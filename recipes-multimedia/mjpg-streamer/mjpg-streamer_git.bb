SUMMARY = "MJPG-streamer takes JPGs from Linux-UVC compatible webcams, filesystem or other input plugins and streams them as M-JPEG via HTTP to webbrowsers, VLC and other software. It is the successor of uvc-streamer, a Linux-UVC streaming application with Pan/Tilt"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

PV = "0.4+git${SRCPV}"
SRCREV = "c1ecfaf7c5cb958cdfd251bdaa9824c3e798f890"
SRC_URI = "git://github.com/jacksonliam/mjpg-streamer.git;protocol=https \
	   file://0001-Force-Enable-Raspicam.patch \
          "

DEPENDS = "libgphoto2 v4l-utils userland opencv libsdl"

S = "${WORKDIR}/git/mjpg-streamer-experimental"
inherit cmake

ASNEEDED = ""

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release -DCMAKE_EXE_LINKER_FLAGS='-Wl,--no-as-needed' \
                 -DVMCS_INSTALL_PREFIX=${exec_prefix} \
"

EXTRA_OECMAKE_append_aarch64 = " -DARM64=ON "

CFLAGS_append = " -fPIC"

EXTRA_OEMAKE = "USE_LIBV4L2=1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES_${PN} += "${libdir}/*.so"
