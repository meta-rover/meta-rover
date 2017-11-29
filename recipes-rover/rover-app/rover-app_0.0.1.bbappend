
do_install_append() {
	install -d ${D}/etc/modules-load.d/
	install -m 0644 ${WORKDIR}/rover-i2c.conf ${D}/etc/modules-load.d/
}

FILES_${PN} += "/etc/modules-load.d"

