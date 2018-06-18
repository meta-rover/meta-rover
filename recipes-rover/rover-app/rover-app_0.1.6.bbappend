
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
}

FILES_${PN} += "\
  /etc/modules-load.d \
  ${systemd_system_unitdir}/rover-app.service"

