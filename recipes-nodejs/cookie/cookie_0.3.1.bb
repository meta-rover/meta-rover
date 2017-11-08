# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "HTTP server cookie parsing and serialization"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca"

SRC_URI = "npm://registry.npmjs.org;name=cookie;version=${PV}"

NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

DEPENDS = "nodejs"

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN} = "MIT"
