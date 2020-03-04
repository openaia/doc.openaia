FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.4.23"
KBRANCH ?= "linux-5.4.y"
SRCREV ?= "bfe3046ecafdd71ba6932deebe2eb357048b7bfc"

require linux-mutual.inc
