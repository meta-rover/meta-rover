
# This SHALL to be FIXED
#CXXFLAGS_append = " -Wno-error=format-security"

do_configure_prepend() {
	export SDKTARGETSYSROOT="${PKG_CONFIG_SYSROOT_DIR}"
	env
	
}

do_install_append() {
	# Install the rover-i2c config
	install -d ${D}/etc/modules-load.d/
	install -m 0644 ${WORKDIR}/rover-i2c.conf ${D}/etc/modules-load.d/
	# Install the service file
        install -d ${D}${systemd_system_unitdir}
        install -m 0644 ${WORKDIR}/rover-app.service ${D}${systemd_system_unitdir}
	# Install the config files
        install -d ${D}/etc
        install -m 0644 ${S}/samples/rover.conf.sample ${D}/etc/rover.conf
        install -m 0644 ${S}/samples/rover.conf.sample ${D}/etc/rover.conf.sample
}

FILES_${PN} += "\
  /etc/modules-load.d \
  /etc/rover.conf \
  /etc/rover.conf.sample \
  ${systemd_system_unitdir}/rover-app.service"

