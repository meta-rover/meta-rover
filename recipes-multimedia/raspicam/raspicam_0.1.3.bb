#
# Bitbake recipe for raspicam_0.1.3 module from https://github.com/6by9/raspicam-0.1.3
# Recipe created by: M.Ozcelikors <mozcelikors@gmail.com>
#

DESCRIPTION = "raspicam" 
SECTION = "multimedia"
#LICENSE = "CLOSED" is useful for testing purposes. 
LICENSE = "BSD" 

# This directory contains most common licenses in case no file named COPYING or LICENSE is provided: ${COMMON_LICENSE_DIR}
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD;md5=3775480a712fc46a69647678acb234cb"

PR = "r0" 

# If your build system does not have opencv recipe, then you can test still by commenting below line
# The following is required for this recipe to be cross-compiled.
DEPENDS = "opencv"
PROVIDES = "raspicam"

# For do_package
PACKAGES = "${PN} ${PN}-dev ${PN}-dbg ${PN}-staticdev"
FILES_${PN} += " ${libdir}/*"

# Runtime dependencies of created packages
RDEPENDS_${PN}-staticdev = ""
RDEPENDS_${PN}-dev = ""
RDEPENDS_${PN}-dbg = ""

#Fetching from git repo
SRC_URI = "git://github.com/6by9/raspicam-0.1.3.git;protocol=https;branch=master"

# SHA1-Hash when downloading from git
SRCREV = "${AUTOREV}"

# This should be correct for git-based fetching
S = "${WORKDIR}/git" 

inherit pkgconfig cmake

do_install() {
    # Installing libraries
    # Create directory
    install -d ${D}${libdir}
    # Copy library
    install -m 0755 ${B}/src/libraspicam.so* ${D}${libdir}
    
    # If raspicam is compiled with opencv
    if [ -f "${B}/src/libraspicam_cv.so"]; then
        install -m 0755 ${B}/src/libraspicam_cv.so* ${D}${libdir}
    fi

    # At local.conf be sure to add library as
    # IMAGE_INSTALL_append = "raspicam-staticdev"

    # If we chose to install manually here, without packing concerns:
    #mkdir -p ${D}${libdir}
    #cp -r ${B}/src/libraspicam.so* ${D}${libdir}
    
    # If OpenCV library is also compiled, install it too
    #if [ -f "${B}/src/libraspicam_cv.so"]; then
    #     cp -r ${B}/src/libraspicam_cv.so* ${D}${libdir}
    #fi
}
