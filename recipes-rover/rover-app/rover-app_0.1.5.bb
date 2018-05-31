DESCRIPTION = "Rover Application"
AUTHOR = "Mustafa Ozcelikors"
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5d7f7156f7785ca2eb55d6cc1b4c118"

inherit cmake systemd

DEPENDS = "bluez5 i2c-tools wiringpi jsoncpp userland paho-mqtt-c raspicam"

RDEPENDS_${PN} = "python-psutil bluez5 i2c-tools wiringpi jsoncpp userland paho-mqtt-c raspicam"

PROVIDES += "rover-api"

SRCREV = "499ce8c8ee2e796677dba96adb4474161dea4af3"
PV_append = "+gitr${SRCPV}"

SRC_URI = "git://github.com/app4mc-rover/rover-app.git;branch=master \
           file://rover-i2c.conf \
           file://rover-app.service"

# Add patches
#SRC_URI += "file://0001-Fix-Compilation-Errors.patch \
#            file://0002-Fix-Coreutil-issue.patch"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-Dpkg_config_libdir=${libdir} -DCMAKE_BUILD_TYPE=Release"

# Add services
#SYSTEMD_SERVICE_${PN} = "rover-app.service"
#SYSTEMD_PACKAGES = "${PN}"

PACKAGES = "${PN} ${PN}-dbg ${PN}-dev"

FILES_${PN} = "\
    ${bindir}/* \
    ${libdir}/lib*.so \
    ${libdir}/*.a \
    /opt/rover-app/*"

FILES_${PN}-dbg = "\
    ${bindir}/.debug \
    ${exec_prefix}/src/debug \
    ${libdir}/.debug"

FILES_${PN}-dev = "\
    ${includedir}"
