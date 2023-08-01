require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

SRCREV = "72de5a560a44fb81549f1da325a1b3e323a7aaf7"
SRC_URI = " \
	git://github.com/JeffyCN/mirrors.git;protocol=https;nobranch=1;branch=kernel-5.10-2022_01_10; \
"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI[sha256sum] = "dcdf99e43e98330d925016985bfbc7b83c66d367b714b2de0cbbfcbf83d8ca43"
