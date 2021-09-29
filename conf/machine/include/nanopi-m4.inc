# Copyright (C) 2021 Blade SAS
# Common definitions for all NanoPi M4 RK3399 board variants

# add a common override for all nanopi-m4
MACHINEOVERRIDES =. "nanopi-m4:"

require conf/machine/include/rk3399.inc

MACHINE_FEATURES += "usbhost serial"

KERNEL_DEVICETREE = "rockchip/rk3399-nanopi-m4.dtb"
