DESCRIPTION = "Rover Services API"
AUTHOR = "Pedro Cuadra"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit cmake pythonnative

DEPENDS = "raml2agl-native dbus glib-2.0 af-binder json-c"

RDEPENDS_${PN} = "dbus glib-2.0 af-binder json-c"

SRCREV = "14b63f77c058dfa3a1fabe50b5ceb139a3571bce"
PV_append = "+gitr${SRCPV}"

SRC_URI = "git://github.com/app4mc-rover/rover-services.git;branch=master"

EXTRA_OECMAKE += "-Dpkg_config_libdir=${libdir} -DCMAKE_BUILD_TYPE=Release"

do_configure_prepend() {
	${WORKDIR}/git/gen_app -l info
	cp ${WORKDIR}/git/LICENSE ${WORKDIR}/git/app/
}

S = "${WORKDIR}/git/app"

PACKAGES = "${PN} ${PN}-dbg ${PN}-dev"

FILES_${PN} = "\
     ${bindir}/* \
     ${libdir}/lib*.so \
     ${libdir}/*.a"

FILES_${PN}-dbg = "\
    ${bindir}/.debug \
    ${exec_prefix}/src/debug \
    ${libdir}/.debug"


FILES_${PN}-dev = "\
     ${includedir}"
