DESCRIPTION = "Rover Buzzer Service"
AUTHOR = "Pedro Cuadra"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit cmake aglwgt pkgconfig

DEPENDS = "dbus glib-2.0 af-binder json-c rover-app"
RDEPENDS_${PN} = "dbus glib-2.0 af-binder json-c rover-app"

SRCREV = "3f2c12d5c100dfeed77c56add37479887a48e58a"
PV_append = "+r${SRCREV}"

SRC_URI = "gitsm://github.com/app4mc-rover/rover-services.git;branch=master"

EXTRA_OECMAKE += "-Dpkg_config_libdir=${libdir} -DCMAKE_BUILD_TYPE=Release"

S = "${WORKDIR}/git/service/roverbuzzer"

