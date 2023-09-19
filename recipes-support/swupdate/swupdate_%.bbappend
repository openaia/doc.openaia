FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://swupdate.cfg \
    file://swupdate-updates.env \
    file://01-swupdate-args \
    "
do_install:append() {
	install -d ${D}${sysconfdir}/swupdate
	install -m 0644 ${WORKDIR}/swupdate-updates.env ${D}${sysconfdir}/swupdate/swupdate.env

	install -d ${D}${sysconfdir}/swupdate/conf.d
	install -m 0644 ${WORKDIR}/01-swupdate-args ${D}${sysconfdir}/swupdate/conf.d
	install -m 0644 ${WORKDIR}/swupdate.cfg ${D}${sysconfdir}/swupdate/
}

COMPATIBLE_MACHINE = "(neu6b-v1-5.10-swu)"
