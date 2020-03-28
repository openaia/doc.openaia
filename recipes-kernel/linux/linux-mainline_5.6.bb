FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.6-rc7"
KBRANCH ?= "master"
SRCREV ?= "16fbf79b0f83bc752cee8589279f1ebfe57b3b6e"

require linux-mutual.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
