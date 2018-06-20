DESCRIPTION = "Rover Menu Service"
AUTHOR = "Pedro Cuadra"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit cmake aglwgt

DEPENDS = "dbus glib-2.0 af-binder json-c rover-app rover-services-api"
RDEPENDS_${PN} = "dbus glib-2.0 af-binder json-c rover-app rover-services-api"

SRC_URI = "gitsm://github.com/app4mc-rover/rover-services.git;branch=master"

SRCREV = "13c1275c76e28989b0aec61f732cbaf959963e14"
PV_append = "+r${SRCREV}"

S = "${WORKDIR}/git/menu"

