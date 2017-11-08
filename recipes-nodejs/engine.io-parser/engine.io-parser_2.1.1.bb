# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Parser for the client for the realtime Engine"
HOMEPAGE = "https://github.com/socketio/engine.io-parser"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
LICENSE = "MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=436a2c205caafa17c010702768e0bed0 \
                    file://node_modules/base64-arraybuffer/LICENSE-MIT;md5=7e6019c14540d23cd5ed7337b94782b0 \
                    file://node_modules/has-binary2/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/after/LICENCE;md5=013fe0a3fb8c715466a12185bc36727b"

SRC_URI = "npm://registry.npmjs.org;name=engine.io-parser;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

DEPENDS = "nodejs"

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-after = "MIT"
LICENSE_${PN}-arraybuffer.slice = "Unknown"
LICENSE_${PN}-base64-arraybuffer = "MIT"
LICENSE_${PN}-blob = "Unknown"
LICENSE_${PN}-has-binary2-isarray = "MIT"
LICENSE_${PN}-has-binary2 = "MIT"
LICENSE_${PN} = "MIT"
