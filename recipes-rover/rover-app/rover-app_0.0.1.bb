DESCRIPTION = "Rover Application"
AUTHOR = "Mustafa Ozcelikors"
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5d7f7156f7785ca2eb55d6cc1b4c118"

inherit cmake

DEPENDS = "bluez5 i2c-tools wiringPi jsoncpp"

RDEPENDS_${PN} = "python-psutil bluez5 i2c-tools wiringPi jsoncpp userland"

SRCREV = "18580b554eb369d149d085d6da9f3516dd5f9cf1"
PV = "1.1+gitr${SRCPV}"

SRC_URI = "git://github.com/app4mc-rover/rover-app.git \
           file://rover-i2c.conf \
           file://0001-Fix-Compilation-Errors.patch"

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
