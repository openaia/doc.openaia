# Copyright (C) 2021 Blade SAS
# Released under the MIT license (see COPYING.MIT for the terms)

SOC_FAMILY = "rk3328"

DEFAULTTUNE ?= "cortexa53-crypto"

require conf/machine/include/soc-family.inc
require conf/machine/include/tune-cortexa53.inc
require conf/machine/include/rockchip-defaults.inc

KBUILD_DEFCONFIG ?= "defconfig"
KERNEL_CLASSES = "kernel-fitimage"
KERNEL_IMAGETYPE = "fitImage"

TFA_PLATFORM = "rk3328"
TFA_BUILD_TARGET = "bl31"

UBOOT_SUFFIX ?= "itb"
UBOOT_ENTRYPOINT ?= "0x06000000"

SERIAL_CONSOLES = "1500000;ttyS2"

PREFERRED_PROVIDER_virtual/bootloader ?= "u-boot"
SPL_BINARY ?= "idbloader.img"
