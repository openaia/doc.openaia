FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.4.19"
KBRANCH ?= "linux-5.4.y"
SRCREV ?= "d6591ea2dd1a44b1c72c5a3e3b6555d7585acdae"

require linux-mutual.inc
