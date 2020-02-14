FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.19.103"
KBRANCH ?= "linux-4.19.y"
SRCREV ?= "357668399cf70ccdc0ee8967bff3448d0f4f9ae1"

require linux-mutual.inc

COMPATIBLE_MACHINE = "(firefly-rk3288|marsboard-rk3066|radxarock|rock2-square|^tinker-board$|vyasa-rk3288)"
