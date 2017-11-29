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
