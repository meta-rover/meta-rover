DESCRIPTION = "Rover Application"
AUTHOR = "Pedro Cuadra and Mustafa Ozcelikors"
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://EPL-1.0;md5=eb8a703a05c268e751fdb962e863bfaf"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

inherit cmake

SRCREV = "696d0959f60a25dcd3502b6c586fa67256c56f9d"
PV = "1.1+gitr${SRCPV}"

SRC_URI = "git://git@gitlab.idial.institute:2222/pedro.cuadrachamorro/rover-app.git;branch=master;protocol=ssh"

S = "${WORKDIR}/git"

DEPENDS = "wiringPi bluez5"

EXTRA_OECMAKE += "-Dpkg_config_libdir=${libdir} -DCMAKE_BUILD_TYPE=Release"

PACKAGES = "${PN}"

# TODO Clean up this
FILES_${PN} = "\
    ${bindir}/* \
    ${libexecdir}/* \
    ${libdir}/lib*.so.* \
    ${libdir}/* \
    ${libdir}/${PN}/* \
    ${includedir}" 
