LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://mjpg-streamer-experimental/LICENSE;md5=751419260aa954499f7abaabaa882bbe" 

SRC_URI = ""

# Patches

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "c1ecfaf7c5cb958cdfd251bdaa9824c3e798f890"

inherit pkgconfig cmake

DEPENDS = "raspicam libjpeg-turbo bcm-host mmal"

OECMAKE_SOURCEPATH = "${S}/mjpg-streamer-experimental"

