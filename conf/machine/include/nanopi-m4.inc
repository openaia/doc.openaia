# Copyright (C) 2021 Blade SAS
# Common definitions for all NanoPi M4 RK3399 board variants

require rk3399.inc

MACHINE_FEATURES += "usbhost serial"

KMACHINE = "nanopi-m4"
KERNEL_DEVICETREE = "rockchip/rk3399-nanopi-m4.dtb"

RK_BOOT_DEVICE = "mmcblk1"
WKS_FILE ?= "rock-pi-4.wks"
IMAGE_FSTYPES += "wic wic.bmap"

WKS_FILE_DEPENDS ?= " \
    mtools-native \
    dosfstools-native \
    virtual/bootloader \
    virtual/kernel \
    "
IMAGE_BOOT_FILES ?= "\
    ${KERNEL_IMAGETYPE} \
    "
