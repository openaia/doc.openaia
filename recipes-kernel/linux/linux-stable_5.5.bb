FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.5.3"
KBRANCH ?= "linux-5.5.y"
SRCREV ?= "deff2fcb0de9352c271d6eafe60178f0e085180b"

require linux-mutual.inc
