do_install_append () {
	ln -sf libjpeg.so.62 ${D}${libdir}/libjpeg.so
}

FILES_${PN} += " /usr/lib/libjpeg.so"
