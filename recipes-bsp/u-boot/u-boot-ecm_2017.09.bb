SECTION = "bootloaders"
DESCRIPTION = "U-Boot 2017.09 ECM u-boot"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

require recipes-bsp/u-boot/u-boot.inc

SRC_URI = "git://git@github.com/edgeble/u-boot.git;protocol=ssh;branch=stable-4.19-rv1109-rv1126-tpl"

SRCREV = "c5746e0fe53d2684b221dbef33357f07881a2e89"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
do_configure[cleandirs] = "${B}"

DEPENDS += "dtc-native bc-native flex-native bison-native coreutils-native"
