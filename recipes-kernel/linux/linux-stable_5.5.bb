FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.5.1"
KBRANCH ?= "linux-5.5.y"
SRCREV ?= "70c707aae3e586f6ebc677ad733a9c3cea32f7ac"

require linux-stable.inc
