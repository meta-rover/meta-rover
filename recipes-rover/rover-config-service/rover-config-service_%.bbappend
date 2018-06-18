do_install_append() {
        # Install the config files
        install -d ${D}/etc
        install -m 0644 ${S}/rover.conf.sample ${D}/etc/rover.conf
        install -m 0644 ${S}/rover.conf.sample ${D}/etc/rover.conf.sample
}

FILES_${PN} += "\
  /etc/rover.conf \
  /etc/rover.conf.sample"

