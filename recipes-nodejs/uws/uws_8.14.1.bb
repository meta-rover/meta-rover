# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Tiny WebSockets"
HOMEPAGE = "https://github.com/uWebSockets/uWebSockets"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4017f4be9779f7947c8f95e5d0334ab7"

SRC_URI = "npm://registry.npmjs.org;name=uws;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

INSANE_SKIP_${PN} = "already-stripped"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN} = "Zlib"
