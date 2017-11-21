# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Serve static files"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
LICENSE = "ISC & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27b1707520b14d0bc890f4e75cd387b0 \
                    file://node_modules/parseurl/LICENSE;md5=e7842ed4f188e53e53c3e8d9c4807e89 \
                    file://node_modules/encodeurl/LICENSE;md5=272621efa0ff4f18a73221e49ab60654 \
                    file://node_modules/escape-html/LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595 \
                    file://node_modules/send/LICENSE;md5=df2b0938eba0709b77ac937e2d552b7a \
                    file://node_modules/send/node_modules/fresh/LICENSE;md5=373c2cf0978b37e434394a43b4cbbdb4 \
                    file://node_modules/send/node_modules/range-parser/LICENSE;md5=d4246fb961a4f121eef5ffca47f0b010 \
                    file://node_modules/send/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/send/node_modules/statuses/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/send/node_modules/http-errors/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/send/node_modules/http-errors/node_modules/depd/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/send/node_modules/http-errors/node_modules/setprototypeof/LICENSE;md5=4846f1626304c2c0f806a539bbc7d54a \
                    file://node_modules/send/node_modules/http-errors/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/send/node_modules/http-errors/node_modules/statuses/LICENSE;md5=36e2bc837ce69a98cc33a9e140d457e5 \
                    file://node_modules/send/node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/send/node_modules/on-finished/node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/send/node_modules/encodeurl/LICENSE;md5=272621efa0ff4f18a73221e49ab60654 \
                    file://node_modules/send/node_modules/etag/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/send/node_modules/mime/LICENSE;md5=8e8ea2ad138ce468f8570a0edbadea65 \
                    file://node_modules/send/node_modules/depd/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/send/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/send/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/send/node_modules/destroy/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/send/node_modules/escape-html/LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595"

SRC_URI = "npm://registry.npmjs.org;name=serve-static;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-encodeurl = "MIT"
LICENSE_${PN}-escape-html = "MIT"
LICENSE_${PN}-parseurl = "MIT"
LICENSE_${PN}-send-debug-ms = "MIT"
LICENSE_${PN}-send-debug = "MIT"
LICENSE_${PN}-send-depd = "MIT"
LICENSE_${PN}-send-destroy = "MIT"
LICENSE_${PN}-send-encodeurl = "MIT"
LICENSE_${PN}-send-escape-html = "MIT"
LICENSE_${PN}-send-etag = "MIT"
LICENSE_${PN}-send-fresh = "MIT"
LICENSE_${PN}-send-http-errors-depd = "MIT"
LICENSE_${PN}-send-http-errors-inherits = "ISC"
LICENSE_${PN}-send-http-errors-setprototypeof = "ISC"
LICENSE_${PN}-send-http-errors-statuses = "MIT"
LICENSE_${PN}-send-http-errors = "MIT"
LICENSE_${PN}-send-mime = "MIT"
LICENSE_${PN}-send-ms = "MIT"
LICENSE_${PN}-send-on-finished-ee-first = "MIT"
LICENSE_${PN}-send-on-finished = "MIT"
LICENSE_${PN}-send-range-parser = "MIT"
LICENSE_${PN}-send-statuses = "MIT"
LICENSE_${PN}-send = "MIT"
LICENSE_${PN} = "MIT"
