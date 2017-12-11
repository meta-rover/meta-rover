
do_install_append() {
	install -d ${D}/etc/modules-load.d/
	install -m 0644 ${WORKDIR}/rover-i2c.conf ${D}/etc/modules-load.d/
        install -d ${D}${systemd_system_unitdir}
        install -m 0644 ${WORKDIR}/rover-app.service ${D}${systemd_system_unitdir}
}

FILES_${PN} += "\
  /etc/modules-load.d \
  ${systemd_system_unitdir}/rover-app.service"

