DESCRIPTION = "Rover Application"
AUTHOR = "Mustafa Ozcelikors"
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5d7f7156f7785ca2eb55d6cc1b4c118"

inherit cmake

DEPENDS = "wiringPi i2c-tools jsoncpp python-psutil raspicam bluez5 mmal"

# FIXME: Update once feathre/cmakelistfix is integrated into master
SRCREV = "d1fdb82d3c14ea4aa55b3bdb06c34beb4c333d2d"
PV = "1.1+gitr${SRCPV}"

SRC_URI = "git://github.com/app4mc-rover/rover-app.git;branch=feature/cmakelistfix"

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
