# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "High performance middleware framework"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=656570d159e2d4e4dc85c34a86f3aee4 \
                    file://node_modules/utils-merge/LICENSE;md5=1cf0906082187f374cb9a63c54eb782c \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/parseurl/LICENSE;md5=e7842ed4f188e53e53c3e8d9c4807e89 \
                    file://node_modules/finalhandler/LICENSE;md5=b506956e5cbfbe0d04f8a5c40107ec89 \
                    file://node_modules/finalhandler/node_modules/unpipe/LICENSE;md5=934ab86a8ab081ea0326add08d550739 \
                    file://node_modules/finalhandler/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/finalhandler/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/finalhandler/node_modules/parseurl/LICENSE;md5=e7842ed4f188e53e53c3e8d9c4807e89 \
                    file://node_modules/finalhandler/node_modules/statuses/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/finalhandler/node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/finalhandler/node_modules/on-finished/node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/finalhandler/node_modules/escape-html/LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595 \
                    file://node_modules/finalhandler/node_modules/encodeurl/LICENSE;md5=272621efa0ff4f18a73221e49ab60654"

SRC_URI = "npm://registry.npmjs.org;name=connect;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

DEPENDS = "nodejs"
RDEPENDS_${PN} = "nodejs nodejs-npm"

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-debug-ms = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-finalhandler-debug-ms = "MIT"
LICENSE_${PN}-finalhandler-debug = "MIT"
LICENSE_${PN}-finalhandler-encodeurl = "MIT"
LICENSE_${PN}-finalhandler-escape-html = "MIT"
LICENSE_${PN}-finalhandler-on-finished-ee-first = "MIT"
LICENSE_${PN}-finalhandler-on-finished = "MIT"
LICENSE_${PN}-finalhandler-parseurl = "MIT"
LICENSE_${PN}-finalhandler-statuses = "MIT"
LICENSE_${PN}-finalhandler-unpipe = "MIT"
LICENSE_${PN}-finalhandler = "MIT"
LICENSE_${PN}-parseurl = "MIT"
LICENSE_${PN}-utils-merge = "MIT"
LICENSE_${PN} = "MIT"
