# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5d7f7156f7785ca2eb55d6cc1b4c118"

inherit systemd

# FIXME once the license is added to the repo remove this
INSANE_SKIP_${PN} = "license-checksum"

SRC_URI = "git://github.com/app4mc-rover/rover-web.git;protocol=https \
           file://rover-web.service \
           file://rover-web-stream.service \
           file://update_ip.sh \
           file://start_cam.patch \
           file://start_roverweb.patch"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "1c7b78d962a6c4980781545e7e00fc890247c9dc"

S = "${WORKDIR}/git"

# Rover web dependencis
RDEPENDS_${PN} = "nodejs net connect serve-static http nodejs-npm socket.io"
# Rover web streaming dependencies
RDEPENDS_${PN}-stream = "libjpeg-turbo mjpg-streamer"

DEPENDS = "net connect serve-static http socket.io"
DEPENDS += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd-systemctl-native', '', d)}"

# Add services
SYSTEMD_SERVICE_${PN} = "rover-web.service"
SYSTEMD_SERVICE_${PN}-stream = "rover-web-stream.service"
SYSTEMD_PACKAGES = "${PN} ${PN}-stream"

do_install () {
  install -d ${D}/opt/rover-web
  cp -r ${S}/* ${D}/opt/rover-web
  install -m 755 ${S}/scripts/bash/camera_stream/start_camera_stream.sh ${D}/opt/rover-web/scripts/bash/camera_stream/start_camera_stream.sh
  install -m 755 ${S}/scripts/bash/setup/start_roverweb.sh ${D}/opt/rover-web/scripts/bash/setup/start_roverweb.sh
  install -m 755 ${WORKDIR}/update_ip.sh ${D}/opt/rover-web/scripts/bash/setup/update_ip.sh
  install -d ${D}${systemd_system_unitdir}
  install -m 0644 ${WORKDIR}/rover-web.service ${D}${systemd_system_unitdir}
  install -m 0644 ${WORKDIR}/rover-web-stream.service ${D}${systemd_system_unitdir}
}

FILES_${PN} += "/opt/rover-web/* \
                ${systemd_system_unitdir}/rover-web.service"

FILES_${PN}-stream += "${systemd_system_unitdir}/rover-web-stream.service"

PACKAGES = "${PN} ${PN}-stream"
