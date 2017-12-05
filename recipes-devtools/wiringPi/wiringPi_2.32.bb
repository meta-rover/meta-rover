DESCRIPTION = "A library to control Raspberry Pi GPIO channels"
HOMEPAGE = "https://projects.drogon.net/raspberry-pi/wiringpi/"
SECTION = "devel/libs"
LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

# tag 2.32
SRCREV = "b0a60c3302973ca1878d149d61f2f612c8f27fac"

S = "${WORKDIR}/git"

DEPENDS = "glibc"

SRC_URI = "git://git.drogon.net/wiringPi \
           file://0001-Add-initial-cross-compile-support.patch \
           file://0001-include-asm-ioctl.h-directly-for-_IOC_SIZEBITS.patch \
           "

COMPATIBLE_MACHINE = "raspberrypi"

CFLAGS_prepend = "-I${S}/wiringPi -I${S}/devLib "

EXTRA_OEMAKE += "'INCLUDE_DIR=${D}${includedir}' 'LIB_DIR=${D}${libdir}'"
EXTRA_OEMAKE += "'DESTDIR=${D}/usr' 'PREFIX=""'"

do_compile() {
    oe_runmake -C devLib
    oe_runmake -C wiringPi
    oe_runmake -C gpio 'LDFLAGS=${LDFLAGS} -L${S}/wiringPi -L${S}/devLib'
}

do_install() {
    oe_runmake -C devLib install
    oe_runmake -C wiringPi install
    oe_runmake -C gpio install

    rm ${D}${libdir}/libwiringPi.so. 
    rm ${D}${libdir}/libwiringPiDev.so.

    install -m 0644 ${S}/wiringPi/libwiringPi.so ${D}${libdir}/libwiringPi.so
    install -m 0644 ${S}/devLib/libwiringPiDev.so ${D}${libdir}/libwiringPiDev.so
}

PACKAGES = "${PN} ${PN}-dev ${PN}-dbg"

FILES_${PN} = "\
    /usr/bin \
    ${bindir}/* \
    ${libdir}/lib*.so \
    ${libdir}/lib*.so* \
    /usr/share
    ${libdir}/*.a"

FILES_${PN}-dbg = "\
    ${bindir}/.debug \
    ${exec_prefix}/src/debug \
    ${libdir}/.debug"

FILES_${PN}-dev = "\
    ${bindir}/* \
    ${libdir}/lib*.so \
    ${libdir}/lib*.so* \
    ${libdir}/*.a \
    ${includedir}"

