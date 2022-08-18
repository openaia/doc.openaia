SECTION = "kernel"
DESCRIPTION = "Linux-5.19 ECM kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

require recipes-kernel/linux/linux-yocto.inc

inherit kernel

SRC_URI = " \
	git://git@github.com/edgeble/linux-next.git;protocol=ssh;branch=ecm0-v4 \
	file://rv1126-ecm0.cfg \
	"

SRCREV = "8d2f439d0375b24a3134ef82dd193005c5e53f59"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

DEPENDS += "openssl-native util-linux-native"
