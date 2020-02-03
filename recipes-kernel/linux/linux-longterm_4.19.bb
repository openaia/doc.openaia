FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.19.101"
KBRANCH ?= "linux-4.19.y"
SRCREV ?= "32ee7492f104d82b01a44fc4b4ae17d5d2bb237b"

require linux-mutual.inc
