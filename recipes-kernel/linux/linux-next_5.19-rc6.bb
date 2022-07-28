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

SRCREV = "cc8e768bf0c92798b95dcf753975604f5d2697da"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

DEPENDS += "openssl-native util-linux-native"
