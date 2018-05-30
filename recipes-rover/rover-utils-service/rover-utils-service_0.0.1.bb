DESCRIPTION = "Rover Utils Service"
AUTHOR = "Pedro Cuadra"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit cmake aglwgt pkgconfig

DEPENDS = "dbus glib-2.0 af-binder json-c rover-app"
RDEPENDS_${PN} = "dbus glib-2.0 af-binder json-c rover-app"

SRCREV = "14b63f77c058dfa3a1fabe50b5ceb139a3571bce"
PV_append = "+gitr${SRCPV}"

SRC_URI = "gitsm://github.com/app4mc-rover/rover-services.git;branch=master"


S = "${WORKDIR}/git/service/roverutils"

