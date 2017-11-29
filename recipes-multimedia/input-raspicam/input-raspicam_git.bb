SUMMARY = "Input raspicam MJPG-streamer plugin"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://mjpg-streamer-experimental/LICENSE;md5=751419260aa954499f7abaabaa882bbe"

#INSANE_SKIP_${PN} = " license-checksum"

inherit cmake

PV = "0.4+git${SRCPV}"
SRCREV = "5f6adeefa0d5a78833cc809f2bfa76131f2b9ff8"
SRC_URI = "git://github.com/jacksonliam/mjpg-streamer.git;protocol=https \
           file://0002-fix-raspicam-compilation.patch \
          "

DEPENDS = "mjpg-streamer"

RDEPENDS_${PN} = "vc-graphics"

S = "${WORKDIR}/git"

do_configure() {
	cmake "${S}/mjpg-streamer-experimental/plugins/input_raspicam/"
}

do_install () {
  install -d ${D}/usr/lib
  install -m 0755 ${WORKDIR}/build/libinput_raspicam.so ${D}/usr/lib/input_raspicam.so
}


CFLAGS =+ "-DLINUX -D_GNU_SOURCE"

FILES_${PN} += "${libdir}/*.so"
FILES_${PN}-dbg += "${libdir}/.debug /usr/src"

PACKAGES = "${PN} ${PN}-dbg"
