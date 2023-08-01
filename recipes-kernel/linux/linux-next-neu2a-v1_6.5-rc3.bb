SECTION = "kernel"
DESCRIPTION = "Linux-6.5-rc3 Neu2A kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

require recipes-kernel/linux/linux-yocto.inc

LINUX_BRANCH ?= "neu2a-v6.5-rc3"

SRC_URI = " \
	git://git@github.com/edgeble/linux-next.git;protocol=ssh;branch=${LINUX_BRANCH} \
	file://rv1126-neu2a-v1.cfg \
	"
SRCREV = "309a969182e4e9232fc42b4ecf22925a8f27c2f7"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

KERNEL_DTC_FLAGS = "-@"
DEPENDS += " openssl-native util-linux-native"

do_deploy:append() {
    mkdir -p ${DEPLOYDIR}/rockchip
    cp ${DEPLOYDIR}/rv1126-edgeble-neu2-io.dtb ${DEPLOYDIR}/rockchip
    cp ${DEPLOYDIR}/rv1126-edgeble-neu2-io-dsi.dtbo ${DEPLOYDIR}/rockchip
    cp ${DEPLOYDIR}/radxa-display-10hd.dtbo ${DEPLOYDIR}/rockchip
    cp ${DEPLOYDIR}/radxa-display-8hd.dtbo ${DEPLOYDIR}/rockchip
}
