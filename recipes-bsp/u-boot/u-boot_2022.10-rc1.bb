SECTION = "bootloaders"
DESCRIPTION = "U-Boot 2017.09 ECM u-boot"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"

require recipes-bsp/u-boot/u-boot.inc

SRC_URI = "git://git@github.com/edgeble/u-boot.git;protocol=ssh;branch=ecm0-v4"

SRCREV = "164d013655c7bc45f55475d3033a3e2344eea6a1"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
do_configure[cleandirs] = "${B}"

DEPENDS += "flex-native bison-native bc-native dtc-native python3-setuptools-native"
