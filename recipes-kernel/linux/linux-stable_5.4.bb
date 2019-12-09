FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.4.2"
KBRANCH ?= "linux-5.4.y"
SRCREV ?= "5f8bc2bb0e0f456e2217bbd1caac2acf211431c9"

require linux-stable.inc
