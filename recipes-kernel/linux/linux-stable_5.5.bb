FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.5.6"
KBRANCH ?= "linux-5.5.y"
SRCREV ?= "d542c06f7665ee93cf6983dac472a1dd12050401"

require linux-mutual.inc
