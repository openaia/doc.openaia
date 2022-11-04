# meta-neu2-io

Yocto BSP layer for the Edgeble Neural Compute Module 2.

This README file contains information on building and booting the meta-ecm BSP layers.

Please see the corresponding sections below for details.

## Required Packages for the Build Host
To install the required packages on a Debian based distribution (Ubuntu etc) run

```
sudo apt install gawk wget git diffstat unzip texinfo gcc build-essential \
chrpath socat cpio python3 python3-pip python3-pexpect xz-utils \
debianutils iputils-ping python3-git python3-jinja2 libegl1-mesa \
libsdl1.2-dev pylint xterm python3-subunit mesa-common-dev zstd liblz4-tool
```

## Dependencies

This layer depends on:

```
* URI: git://git.openembedded.org/bitbake
* branch: master
```
```
* URI: git://git.openembedded.org/openembedded-core
* layers: meta
* branch: matched branches (e.g. kirkstone, ...)
```
```
* URI: git://git.yoctoproject.org/meta-arm
* layers: meta-arm, meta-arm-toolchain
* branch: matched branches (e.g. kirkstone, ...)
```
```
* URI: git clone git://git.openembedded.org/meta-openembedded
* layers: meta-oe, meta-python, meta-networking
* branch: matched branches (e.g. kirkstone, ...)
```

## Table of Contents

I. Configure yocto/oe Environment

II. Building meta-ecm BSP Layers

III. Booting your Device

IV. Tested Hardwares

### I. Configure yocto/oe Environment

In order to build an image with BSP support for a given release, you need to download the corresponding layers described in the "Dependencies" section. Be sure that everything is in the same directory.

```shell
~ $ mkdir yocto; cd yocto
~/yocto $ git clone git://git.openembedded.org/bitbake -b master
~/yocto $ git clone git://git.openembedded.org/openembedded-core -b kirkstone
~/yocto $ git clone git://git.yoctoproject.org/meta-arm -b kirkstone
~/yocto $ git clone git://git.openembedded.org/meta-openembedded -b kirkstone
```

And put the meta-ecm layer here too.

Then you need to source the configuration script:

```shell
~/yocto $ source openembedded-core/oe-init-build-env
```

Having done that, you can build a image for a ecm boards by adding the location of the meta-ecm layer to bblayers.conf, along with any other layers needed.

For example:

```makefile
# build/conf/bblayers.conf
BBLAYERS ?= " \
  ${TOPDIR}/../openembedded-core/meta\
  ${TOPDIR}/../meta-arm/meta-arm \
  ${TOPDIR}/../meta-arm/meta-arm-toolchain \
  ${TOPDIR}/../meta-neu2k \
  ${TOPDIR}/../meta-openembedded/meta-oe \
  ${TOPDIR}/../meta-openembedded/meta-python \
  ${TOPDIR}/../meta-openembedded/meta-networking \
  "
```

To enable a particular machine, you need to add a MACHINE line naming the BSP to the local.conf file:

```makefile
  MACHINE = "neu2-io"
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
wpa_passphrase 'YOUR_SSID' >  ../meta-ecm/recipes-connectivity/wpa-supplicant/files/wpa_supplicant-nl80211-wlan0.conf
```

All supported machines can be found in meta-ecm/conf/machine.

### II. Building meta- BSP Layers

You should then be able to build a image as such:

```shell
bitbake core-image-full-cmdline
```

At the end of a successful build, you should have an .wic image in /path/to/yocto/build/tmp-glibc/deploy/\<MACHINE\>/

### III. Booting your Device

#### SD Boot

1. Plug debug uart at 1500000 baudrate.

2. Program SD card (assume card detected at /dev/sdX)

```shell
cd tmp-glibc/deploy/images/\<MACHINE\>
sudo bmaptool copy --bmap core-image-full-cmdline-neu2-io.wic.bmap core-image-full-cmdline-neu2-io.wic.xz /dev/sdX
```

3. Turn On the board.

#### eMMC Boot

### IV. Tested Hardwares

The following undergo regular basic testing with their respective MACHINE types.

* Edgeble Neural Compute Module 2

## Maintainers

* Anand Moon `<anand@edgeble.ai>`
* Edgeble AI `<info@edgeble.ai>`
