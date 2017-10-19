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
DEPENDS = "opencv"

#For do_package
FILES_${PN} += " ${libdir}/*"

#Fetching from git repo
SRC_URI = "git://github.com/6by9/raspicam-0.1.3.git;protocol=https;branch=master"

# SHA1-Hash when downloading from git
SRCREV = "${AUTOREV}"

# This should be correct for git-based fetching
S = "${WORKDIR}/git" 

inherit pkgconfig cmake
#inherit cmake

do_install() {
# In case a binary needs to be installed
#    install -d ${D}${bindir}
    #install -d ${B}/src/libraspicam.so* ${D}${libdir}
    #install -d ${B}/src/libraspicam_cv.so* ${D}${libdir}

    # We chose to install manually here, TODO: any improvements welcome
    mkdir -p ${D}${libdir}
    cp -r ${B}/src/libraspicam.so* ${D}${libdir}
    
    # If OpenCV library is also compiled, install it too
    if [ -f "${B}/src/libraspicam_cv.so"]; then
         cp -r ${B}/src/libraspicam_cv.so* ${D}${libdir}
    fi
}
