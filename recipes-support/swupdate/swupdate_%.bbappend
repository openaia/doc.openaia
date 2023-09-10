FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://swupdate.cfg \
    "

COMPATIBLE_MACHINE = "(neu6b-v1-5.10-swu)"
