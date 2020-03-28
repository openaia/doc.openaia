FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.4.28"
KBRANCH ?= "linux-5.4.y"
SRCREV ?= "462afcd6e7ea94a7027a96a3bb12d0140b0b4216"

require linux-mutual.inc
