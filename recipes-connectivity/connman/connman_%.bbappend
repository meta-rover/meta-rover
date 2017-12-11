
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "\
	file://settings \
	"

do_install_append() {
	# Enable Wifi Tethering by default
        install -d ${D}${localstatedir}/lib/connman
        install -m 0600 ${S}/../settings ${D}${localstatedir}/lib/connman/settings
}
