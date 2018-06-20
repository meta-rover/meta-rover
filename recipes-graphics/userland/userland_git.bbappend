# Overrind waylan config already done by mesa
PACKAGECONFIG = ""
PACKAGECONFIG[wayland] = ""

DEPENDS_append = " mesa"

PROVIDES += " vc-graphics"

EXTRA_OEMAKE = "USE_LIBV4L2=1"

# Already provided in AGL
do_install_append() {
	rm ${D}${libdir}/libGLESv2.so*
	rm ${D}${libdir}/libEGL.so*
	rm ${D}${libdir}/pkgconfig/egl.pc
	rm ${D}${libdir}/pkgconfig/glesv2.pc
  	rm ${D}${includedir}/KHR/khrplatform.h
  	rm ${D}${includedir}/EGL/*
  	rm ${D}${includedir}/GLES/*
  	rm ${D}${includedir}/GLES2/*
}
