# Add a common override for all Rock Pi 4 machines
MACHINEOVERRIDES =. "rock-pi-4:"

require conf/machine/include/rk3399.inc

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

MACHINE_EXTRA_RRECOMMENDS += "kernel-modules"
