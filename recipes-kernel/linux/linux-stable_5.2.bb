FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.2.20"
KBRANCH ?= "linux-5.2.y"
SRCREV ?= "56fd0c9f54730c7049774c0aa2a73151b628b735"

require linux-stable.inc
