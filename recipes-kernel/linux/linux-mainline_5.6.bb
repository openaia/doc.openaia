FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.6-rc3"
KBRANCH ?= "master"
SRCREV ?= "f8788d86ab28f61f7b46eb6be375f8a726783636"

require linux-mutual.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
