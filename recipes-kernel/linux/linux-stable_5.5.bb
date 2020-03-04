FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.5.7"
KBRANCH ?= "linux-5.5.y"
SRCREV ?= "449718782a469dba0922fa97c39ff6897efd7026"

require linux-mutual.inc
