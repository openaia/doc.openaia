FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.19.88"
KBRANCH ?= "linux-4.19.y"
SRCREV ?= "fb683b5e3f53a73e761952735736180939a313df"

require linux-stable.inc
