FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.3.15"
KBRANCH ?= "linux-5.3.y"
SRCREV ?= "8539dfa4fcbcf58c3c2f92ac57b964add884d12b"

require linux-stable.inc
