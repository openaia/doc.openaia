FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.19.113"
KBRANCH ?= "linux-4.19.y"
SRCREV ?= "54b4fa6d39551639cb10664f6ac78b01993a1d7e"

require linux-mutual.inc

COMPATIBLE_MACHINE = "(firefly-rk3288|marsboard-rk3066|radxarock|rock2-square|^tinker-board$|vyasa-rk3288)"
