DESCRIPTION = "Rover QMC5883l Service"
AUTHOR = "Pedro Cuadra"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit cmake aglwgt

DEPENDS = "dbus glib-2.0 af-binder json-c rover-app"
RDEPENDS_${PN} = "dbus glib-2.0 af-binder json-c rover-app"

SRCREV = "3059cfba488515c92502b34979c77ae98303f472"
PV_append = "+r${SRCREV}"

SRC_URI = "gitsm://github.com/app4mc-rover/rover-services.git;branch=master"


S = "${WORKDIR}/git/service/roverqmc5883l"

