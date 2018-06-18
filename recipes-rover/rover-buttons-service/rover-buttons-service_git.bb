DESCRIPTION = "Rover Buttons Service"
AUTHOR = "Pedro Cuadra"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "gitsm://github.com/app4mc-rover/rover-services.git;branch=master"
SRCREV = "3f2c12d5c100dfeed77c56add37479887a48e58a"

PV_append = "+r${SRCREV}"
S = "${WORKDIR}/git/service/roverbuttons"
B = "${WORKDIR}/build" 

DEPENDS += " rover-app"
RDEPENDS_${PN} += " rover-app"

inherit cmake aglwgt pkgconfig 
