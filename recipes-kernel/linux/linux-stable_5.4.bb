FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.4.17"
KBRANCH ?= "linux-5.4.y"
SRCREV ?= "313c8460cf0290fb1b9f71a20573fc32ac6c9cee"

require linux-stable.inc
