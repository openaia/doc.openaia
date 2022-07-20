# Copyright (C) 2022 Edgeble AI Technologies Pvt. Ltd.
# Released under the MIT license (see COPYING.MIT for the terms)

SOC_FAMILY = "rv1126"

require conf/machine/include/arm/armv7a/tune-cortexa7.inc
require conf/machine/include/soc-family.inc
require conf/machine/include/rockchip-defaults.inc

SERIAL_CONSOLES = "1500000;ttyS2"

KBUILD_DEFCONFIG ?= "multi_v7_defconfig"
KERNEL_IMAGETYPE = "zImage"

UBOOT_SUFFIX ?= "img"
