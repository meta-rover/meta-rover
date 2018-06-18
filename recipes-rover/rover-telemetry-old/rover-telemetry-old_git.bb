DESCRIPTION = "Rover Menu Service"
AUTHOR = "Pedro Cuadra"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit cmake aglwgt pkgconfig

DEPENDS = "dbus glib-2.0 af-binder json-c rover-app rover-services-api rover-app"
RDEPENDS_${PN} = "dbus glib-2.0 af-binder json-c rover-app rover-services-api rover-app"

SRCREV = "40490bba59ba8fb1eae21b12af292c3c4382f6b9"
PV_append = "+r${SRCREV}"

SRC_URI = "gitsm://github.com/app4mc-rover/rover-telemetry-service-old.git;branch=master"


S = "${WORKDIR}/git"

