DESCRIPTION = "Rover Application"
AUTHOR = "Mustafa Ozcelikors"
#LICENSE = "EPL-1.0"
#LIC_FILES_CHKSUM = "file://EPL-1.0;md5=eb8a703a05c268e751fdb962e863bfaf"

#INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

inherit cmake

DEPENDS = "wiringPi i2c-tools jsoncpp python-psutil raspicam bluez5"

SRCREV = "8e221612bffe4dcc5f2533d861fd7339c6526da3"
PV = "1.1+gitr${SRCPV}"

SRC_URI = "git@github.com:app4mc-rover/rover-app.git;branch=master;protocol=ssh"

S = "${WORKDIR}/git"

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
