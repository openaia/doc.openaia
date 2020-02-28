FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.4.22"
KBRANCH ?= "linux-5.4.y"
SRCREV ?= "f22dcb31727e3cf31a9143437f134ea133021982"

require linux-mutual.inc
