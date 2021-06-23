# Copyright (C) 2014 NEO-Technologies
# Released under the MIT license (see COPYING.MIT for the terms)

SOC_FAMILY = "rk3066"

require conf/machine/include/tune-cortexa9.inc
require conf/machine/include/soc-family.inc
require conf/machine/include/rockchip-defaults.inc

SERIAL_CONSOLES = "115200;ttyS2"

KBUILD_DEFCONFIG = "multi_v7_defconfig"
KERNEL_IMAGETYPE = "zImage"
