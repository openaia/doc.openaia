# meta-neu6b

Yocto BSP layer for the Edgeble Neural Compute Accelerator Modules - https://www.edgeble.ai/

This project is based on upstream - https://git.yoctoproject.org/meta-rockchip

Please see the corresponding sections below for details.

## Table of Contents

I. [Build Host](https://github.com/edgeble/meta-neu6b#build-host)

II. [Configure Yocto](https://github.com/edgeble/meta-neu6b#configure-yoctooe)

III. [Build Yocto](https://github.com/edgeble/meta-neu6b#building-meta--bsp-layers)

IV. [Build Linux](https://github.com/edgeble/meta-neu6b#build-linux)

## Build Host
To install the required packages on a Debian based distribution (Ubuntu etc) run

```
sudo apt install gawk wget git diffstat unzip texinfo gcc build-essential \
chrpath socat cpio python3 python3-pip python3-pexpect xz-utils \
debianutils iputils-ping python3-git python3-jinja2 libegl1-mesa \
libsdl1.2-dev pylint xterm python3-subunit mesa-common-dev zstd liblz4-tool
```

## Configure Yocto/OE

In order to build an image with BSP support for a given release, you need to download the corresponding layers described in the "Dependencies" section. Be sure that everything is in the same directory.

```shell
~ $ mkdir yocto; cd yocto
~/yocto $ git clone git://git.openembedded.org/bitbake -b master
~/yocto $ git clone git://git.openembedded.org/openembedded-core -b kirkstone
~/yocto $ git clone git://git.yoctoproject.org/meta-arm -b kirkstone
~/yocto $ git clone git://git.openembedded.org/meta-openembedded -b kirkstone
```

And put the meta-neu6b layer here too.

Then you need to source the configuration script:

```shell
~/yocto $ source openembedded-core/oe-init-build-env
```

Having done that, you can build a image for a edgeble boards by adding the location of the meta-neu6b layer to bblayers.conf, along with any other layers needed.

For example:

```makefile
# conf/bblayers.conf
BBLAYERS ?= " \
  ${TOPDIR}/../openembedded-core/meta\
  ${TOPDIR}/../meta-arm/meta-arm \
  ${TOPDIR}/../meta-arm/meta-arm-toolchain \
  ${TOPDIR}/../meta-neu6b \
  ${TOPDIR}/../meta-openembedded/meta-oe \
  ${TOPDIR}/../meta-openembedded/meta-python \
  ${TOPDIR}/../meta-openembedded/meta-networking \
  "
```

To enable a particular machine, you need to add a MACHINE line naming the BSP to the local.conf file:

```makefile
  MACHINE = "neu2a-io"
```

Enable systemd in your Yocto configuration by adding the following to your local.conf file

```makefile
INIT_MANAGER = "systemd"
```

Enable disto features needed to support the pacakges by adding the following to your local.conf file

```makefile
DISTRO_FEATURES:append = " bluetooth wifi"
```

To enable Wifi using wpa_supplicant

Create the wpa_supplicant configuration file by running the following command on your desktop.
This will prompt you for the passphrase for your WiFi.
You may want to then edit the file to remove the clear-text passphrase:

```shell
wpa_passphrase 'YOUR_SSID' >  ../meta-neu6b/recipes-connectivity/wpa-supplicant/files/wpa_supplicant-nl80211-wlan0.conf
```

All supported machines can be found in meta-neu6b/conf/machine.

## Building meta- BSP Layers

You should then be able to build a image as such:

```shell
bitbake core-image-full-cmdline
```

At the end of a successful build, you should have an .wic image in /path/to/yocto/build/tmp-glibc/deploy/\<MACHINE\>/

If you want to boot the image on microSD card the follow below steps.

```shell
cd tmp-glibc/deploy/images/\<MACHINE\>
sudo bmaptool copy --bmap core-image-full-cmdline-neu2a-io.wic.bmap core-image-full-cmdline-neu2a-io.wic.xz /dev/sdX
```
## Build linux

Manual build of kernel with yocto toolchain would be helpful to test any sources before intigrating into yocto.

Configure kernel

```shell
cd build/tmp-glibc/work/neu2a_io-oe-linux-gnueabi/linux-kernel-neu2a/4.19-r0/git
make ARCH=arm rv1126_defconfig
```

Build kernel
```shell
cd build/tmp-glibc/work/neu2a_io-oe-linux-gnueabi/linux-kernel-neu2a/4.19-r0/recipe-sysroot-native/usr/bin/arm-oe-linux-gnueabi
export CROSS_COMPILE=$PWD/arm-oe-linux-gnueabi-
make ARCH=arm CC=$PWD/arm-oe-linux-gnueabi-gcc dtbs zImage -j 16
```

## Maintainers

* Anand Moon `<anand@edgeble.ai>`
* Edgeble AI `<info@edgeble.ai>`
