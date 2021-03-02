require conf/machine/include/rk3288.inc

WKS_FILE ?= "tinker-board.wks"
IMAGE_FSTYPES += "wic wic.bmap"

WKS_FILE_DEPENDS ?= " \
    mtools-native \
    dosfstools-native \
    virtual/bootloader \
    virtual/kernel \
    "
IMAGE_BOOT_FILES ?= "\
    ${KERNEL_IMAGETYPE} \
    ${KERNEL_DEVICETREE} \
    "
