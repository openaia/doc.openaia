FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.5.13"
KBRANCH ?= "linux-5.5.y"
SRCREV ?= "fe5ae687d01e74854ed33666c932a9c11e22139c"

require linux-mutual.inc
