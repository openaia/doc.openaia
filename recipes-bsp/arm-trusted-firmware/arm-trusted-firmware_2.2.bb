# Copyright (C) 2019 Garmin Ltd. or its subsidaries
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Arm Trusted Firmware"
HOMEPAGE = "https://developer.trustedfirmware.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://docs/license.rst;md5=189505435dbcdcc8caa63c46fe93fa89"

PROVIDES = "virtual/atf"

BRANCH = "master"
SRC_URI = "git://git.trustedfirmware.org/TF-A/trusted-firmware-a.git;protocol=http;branch=${BRANCH}"
SRCREV = "a04808c16cfc126d9fe572ae7c4b5a3d39de5796"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

inherit deploy

ATF_SUFFIX ??= "bin"

do_compile() {
    unset LDFLAGS
    unset CFLAGS
    unset CPPFLAGS

    oe_runmake -C ${S} BUILD_BASE=${B} DEBUG=0 CROSS_COMPILE=${TARGET_PREFIX} \
        PLAT=${ATF_PLATFORM} ${ATF_TARGET}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_deploy() {
    install -m 644 ${B}/${ATF_PLATFORM}/release/${ATF_TARGET}/${ATF_TARGET}.${ATF_SUFFIX} \
        ${DEPLOYDIR}/${ATF_TARGET}.${ATF_SUFFIX}
}
addtask deploy after do_compile

