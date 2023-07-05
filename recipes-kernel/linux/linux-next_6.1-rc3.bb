SECTION = "kernel"
DESCRIPTION = "Linux-6.1 Neu2 kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

require recipes-kernel/linux/linux-yocto.inc

inherit kernel

LINUX_BRANCH ?= "neu2a-6.1"

SRC_URI = " \
	git://git@github.com/edgeble/linux-neu2k.git;protocol=ssh;branch=${LINUX_BRANCH} \
	file://rv1126-neu2.cfg \
	"
SRCREV = "e51b230f3c99b923e60195b6d16214f4eaea9bf4"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

DEPENDS += " openssl-native util-linux-native"
