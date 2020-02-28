FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.19.106"
KBRANCH ?= "linux-4.19.y"
SRCREV ?= "f25804f389846835535db255e7ba80eeed967ed7"

require linux-mutual.inc

COMPATIBLE_MACHINE = "(firefly-rk3288|marsboard-rk3066|radxarock|rock2-square|^tinker-board$|vyasa-rk3288)"
