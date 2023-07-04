SECTION = "bootloaders"
DESCRIPTION = "U-Boot 2022.10 neuk2k-uboot"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"

require recipes-bsp/u-boot/u-boot.inc

UBOOT_BRANCH ?= "neu2a-v1"

SRC_URI += " \
	git://git@github.com/edgeble/u-boot.git;protocol=ssh;branch=${UBOOT_BRANCH} \
	file://rv1126_tee_ta_v1.12.bin \
	"

SRCREV = "e1fb5a4ac1c540bfdd84b3eeaa13db890e34cfaf"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
do_configure[cleandirs] = "${B}"

# copy op-tee prebuild binary to u-boot dir.
do_configure:prepend () {
      install -m 644 ${WORKDIR}/rv1126_tee_ta_v1.12.bin ${B}/tee.bin
}

DEPENDS += " flex-native bison-native bc-native dtc-native python3-setuptools-native"
