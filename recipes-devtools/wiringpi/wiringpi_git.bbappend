
do_install_append() {
    rm ${D}${libdir}/libwiringPi.so. 
    rm ${D}${libdir}/libwiringPiDev.so.
}

