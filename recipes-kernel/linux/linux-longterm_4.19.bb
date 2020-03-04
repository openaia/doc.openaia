FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.19.107"
KBRANCH ?= "linux-4.19.y"
SRCREV ?= "a083db76118d20d070794ecf79af17843406c3f6"

require linux-mutual.inc

COMPATIBLE_MACHINE = "(firefly-rk3288|marsboard-rk3066|radxarock|rock2-square|^tinker-board$|vyasa-rk3288)"
