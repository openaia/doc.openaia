# meta-ecm

Yocto BSP layer for the Edge Compute Modules.

This README file contains information on building and booting the meta-ecm BSP layers.

Please see the corresponding sections below for details.

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
  ${TOPDIR}/../meta-ecm \
```

To enable a particular machine, you need to add a MACHINE line naming the BSP to the local.conf file:

```makefile
  MACHINE = "ecm0-carrier"
```

All supported machines can be found in meta-ecm/conf/machine.

### II. Building meta- BSP Layers

You should then be able to build a image as such:

```shell
$ bitbake core-image-full-cmdline
```

At the end of a successful build, you should have an .wic image in /path/to/yocto/build/tmp-glibc/deploy/\<MACHINE\>/

### III. Booting your Device

#### SD Boot

1. Plug debug uart at 1500000 baudrate.

2. Program SD card (assume card detected at /dev/sdX)

```shell
$ cd tmp-glibc/deploy/images/\<MACHINE\>
$ sudo bmaptool copy --bmap core-image-full-cmdline-ecm0-carrier.wic.bmap core-image-full-cmdline-ecm0-carrier.wic.xz /dev/sdX
```

3. Turn On the board.

#### eMMC Boot

### IV. Tested Hardwares

The following undergo regular basic testing with their respective MACHINE types.

* Edge Compute Module 0 Carrier board

## Maintainers

* Anand Moon `<anand@edgeble.ai>`
* Edgeble AI `<info@edgeble.ai>`
