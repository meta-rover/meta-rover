# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89fae8f18054a51f2f1959c80133154a"

# FIXME once the license is added to the repo remove this
INSANE_SKIP_${PN} = "license-checksum"

SRC_URI = "git://github.com/app4mc-rover/rover-web.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "c3341b3067d0a6238bda090e5395b6162e3df4df"

S = "${WORKDIR}/git"

#TODO Add streamer dependency here
RDEPENDS_${PN} = "nodejs net connect serve-static http libjpeg-turbo nodejs-npm socket.io"
DEPENDS = "net connect serve-static http socket.io libjpeg-turbo"

do_install () {
  install -d ${D}/opt/rover-web
  pwd
  cp -r ${S}/* ${D}/opt/rover-web
}

FILES_${PN} += "/opt/rover-web/*"
