# the rock-pi-e is very new
# it's exciting that support has already been added upstream
# but it's so new that even linux-yocto-dev doesn't have it yet
#
# in time we should see the need for this recipe going away

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git"
SRCREV = "c03c21ba6f4e95e406a1a7b4c34ef334b977c194"
LINUX_VERSION = "5.11"
LINUX_VERSION_EXTENSION = ""
PV = "${LINUX_VERSION}"

COMPATIBLE_MACHINE = "(rock-pi-e)"
