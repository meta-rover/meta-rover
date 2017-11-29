DESCRIPTION = "Rover Application"
AUTHOR = "Mustafa Ozcelikors"
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5d7f7156f7785ca2eb55d6cc1b4c118"

inherit cmake

DEPENDS = "bluez5 i2c-tools wiringPi jsoncpp raspicam"

RDEPENDS_${PN} = "python-psutil bluez5 i2c-tools wiringPi jsoncpp raspicam userland"

SRCREV = "e4639dc78ce0f4d1dd98417c765af776b37a99f7"
PV = "1.1+gitr${SRCPV}"

SRC_URI = "git://github.com/app4mc-rover/rover-app.git \
           file://rover-i2c.conf"

# Patches
SRC_URI += "file://i2c.patch"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-Dpkg_config_libdir=${libdir} -DCMAKE_BUILD_TYPE=Release"

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
