# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

DEPENDS = "engine.io"

SUMMARY = "node.js realtime framework server"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/engine.io/node_modules/uws/LICENSE
#
LICENSE = "Zlib & MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ba099e0b43af5af03d887ec8395b604 \
                    file://node_modules/socket.io-adapter/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io-parser/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/socket.io-parser/node_modules/has-binary2/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/socket.io-parser/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io-parser/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io-parser/node_modules/component-emitter/LICENSE;md5=ee4aea2d350b7bdbf93e14297dcdd8a2 \
                    file://node_modules/socket.io-client/LICENSE;md5=b034b27f54cd5a363360fd9207438a01 \
                    file://node_modules/socket.io-client/node_modules/to-array/LICENCE;md5=8966d3100f2d871ee216d056c0ea0160 \
                    file://node_modules/socket.io-client/node_modules/parseuri/LICENSE;md5=b2f87f2456eb667f9260f2af3347b45e \
                    file://node_modules/socket.io-client/node_modules/socket.io-parser/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/socket.io-client/node_modules/socket.io-parser/node_modules/has-binary2/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/socket.io-client/node_modules/socket.io-parser/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io-client/node_modules/socket.io-parser/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io-client/node_modules/socket.io-parser/node_modules/component-emitter/LICENSE;md5=ee4aea2d350b7bdbf93e14297dcdd8a2 \
                    file://node_modules/socket.io-client/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io-client/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io-client/node_modules/base64-arraybuffer/LICENSE-MIT;md5=7e6019c14540d23cd5ed7337b94782b0 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/LICENSE;md5=ff6b9e6830cdd3c4c2c4266dc0b91a86 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/parseuri/LICENSE;md5=b2f87f2456eb667f9260f2af3347b45e \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/yeast/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/engine.io-parser/LICENSE;md5=436a2c205caafa17c010702768e0bed0 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/engine.io-parser/node_modules/base64-arraybuffer/LICENSE-MIT;md5=7e6019c14540d23cd5ed7337b94782b0 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/engine.io-parser/node_modules/has-binary2/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/engine.io-parser/node_modules/after/LICENCE;md5=013fe0a3fb8c715466a12185bc36727b \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/parseqs/LICENSE;md5=b9aac4548c7c97ac7028d5b2b111b19a \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/component-emitter/LICENSE;md5=ee4aea2d350b7bdbf93e14297dcdd8a2 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/ws/LICENSE;md5=95833e8f03687308b0584a377b9e12b0 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/ws/node_modules/ultron/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/ws/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/socket.io-client/node_modules/engine.io-client/node_modules/xmlhttprequest-ssl/LICENSE;md5=cbfa18387b1df27866558353235d1cde \
                    file://node_modules/socket.io-client/node_modules/component-emitter/LICENSE;md5=ee4aea2d350b7bdbf93e14297dcdd8a2 \
                    file://node_modules/socket.io-client/node_modules/parseqs/LICENSE;md5=b9aac4548c7c97ac7028d5b2b111b19a \
                    file://node_modules/engine.io/LICENSE;md5=c9f272e8d85e84d214436bc09de14478 \
                    file://node_modules/engine.io/node_modules/base64id/LICENSE;md5=abb57c73ecaa9ddaa151a4e424935b47 \
                    file://node_modules/engine.io/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/engine.io/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/engine.io/node_modules/accepts/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/engine.io/node_modules/accepts/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/engine.io/node_modules/accepts/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/engine.io/node_modules/accepts/node_modules/negotiator/LICENSE;md5=6417a862a5e35c17c904d9dda2cbd499 \
                    file://node_modules/engine.io/node_modules/engine.io-parser/LICENSE;md5=436a2c205caafa17c010702768e0bed0 \
                    file://node_modules/engine.io/node_modules/engine.io-parser/node_modules/base64-arraybuffer/LICENSE-MIT;md5=7e6019c14540d23cd5ed7337b94782b0 \
                    file://node_modules/engine.io/node_modules/engine.io-parser/node_modules/has-binary2/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/engine.io/node_modules/engine.io-parser/node_modules/after/LICENCE;md5=013fe0a3fb8c715466a12185bc36727b \
                    file://node_modules/engine.io/node_modules/uws/LICENSE;md5=4017f4be9779f7947c8f95e5d0334ab7 \
                    file://node_modules/engine.io/node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/engine.io/node_modules/ws/LICENSE;md5=95833e8f03687308b0584a377b9e12b0 \
                    file://node_modules/engine.io/node_modules/ws/node_modules/ultron/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://node_modules/engine.io/node_modules/ws/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761"

SRC_URI = "npm://registry.npmjs.org;name=socket.io;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

INSANE_SKIP_${PN} = "already-stripped"
# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-debug-ms = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-engine.io-accepts-mime-types-mime-db = "MIT"
LICENSE_${PN}-engine.io-accepts-mime-types = "MIT"
LICENSE_${PN}-engine.io-accepts-negotiator = "MIT"
LICENSE_${PN}-engine.io-accepts = "MIT"
LICENSE_${PN}-engine.io-base64id = "MIT"
LICENSE_${PN}-engine.io-cookie = "MIT"
LICENSE_${PN}-engine.io-debug-ms = "MIT"
LICENSE_${PN}-engine.io-debug = "MIT"
LICENSE_${PN}-engine.io-engine.io-parser-after = "MIT"
LICENSE_${PN}-engine.io-engine.io-parser-arraybuffer.slice = "Unknown"
LICENSE_${PN}-engine.io-engine.io-parser-base64-arraybuffer = "MIT"
LICENSE_${PN}-engine.io-engine.io-parser-blob = "Unknown"
LICENSE_${PN}-engine.io-engine.io-parser-has-binary2-isarray = "MIT"
LICENSE_${PN}-engine.io-engine.io-parser-has-binary2 = "MIT"
LICENSE_${PN}-engine.io-engine.io-parser = "MIT"
LICENSE_${PN}-engine.io-uws = "Zlib"
LICENSE_${PN}-engine.io-ws-safe-buffer = "MIT"
LICENSE_${PN}-engine.io-ws-ultron = "MIT"
LICENSE_${PN}-engine.io-ws = "MIT"
LICENSE_${PN}-engine.io = "MIT"
LICENSE_${PN}-socket.io-adapter = "MIT"
LICENSE_${PN}-socket.io-client-backo2 = "MIT"
LICENSE_${PN}-socket.io-client-base64-arraybuffer = "MIT"
LICENSE_${PN}-socket.io-client-component-bind = "Unknown"
LICENSE_${PN}-socket.io-client-component-emitter = "MIT"
LICENSE_${PN}-socket.io-client-debug-ms = "MIT"
LICENSE_${PN}-socket.io-client-debug = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-component-emitter = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-component-inherit = "Unknown"
LICENSE_${PN}-socket.io-client-engine.io-client-debug-ms = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-debug = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-engine.io-parser-after = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-engine.io-parser-arraybuffer.slice = "Unknown"
LICENSE_${PN}-socket.io-client-engine.io-client-engine.io-parser-base64-arraybuffer = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-engine.io-parser-blob = "Unknown"
LICENSE_${PN}-socket.io-client-engine.io-client-engine.io-parser-has-binary2-isarray = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-engine.io-parser-has-binary2 = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-engine.io-parser = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-has-cors = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-indexof = "Unknown"
LICENSE_${PN}-socket.io-client-engine.io-client-parseqs-better-assert-callsite = "Unknown"
LICENSE_${PN}-socket.io-client-engine.io-client-parseqs-better-assert = "Unknown"
LICENSE_${PN}-socket.io-client-engine.io-client-parseqs = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-parseuri-better-assert-callsite = "Unknown"
LICENSE_${PN}-socket.io-client-engine.io-client-parseuri-better-assert = "Unknown"
LICENSE_${PN}-socket.io-client-engine.io-client-parseuri = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-ws-safe-buffer = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-ws-ultron = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-ws = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-xmlhttprequest-ssl = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client-yeast = "MIT"
LICENSE_${PN}-socket.io-client-engine.io-client = "MIT"
LICENSE_${PN}-socket.io-client-has-cors = "MIT"
LICENSE_${PN}-socket.io-client-indexof = "Unknown"
LICENSE_${PN}-socket.io-client-object-component = "Unknown"
LICENSE_${PN}-socket.io-client-parseqs-better-assert-callsite = "Unknown"
LICENSE_${PN}-socket.io-client-parseqs-better-assert = "Unknown"
LICENSE_${PN}-socket.io-client-parseqs = "MIT"
LICENSE_${PN}-socket.io-client-parseuri-better-assert-callsite = "Unknown"
LICENSE_${PN}-socket.io-client-parseuri-better-assert = "Unknown"
LICENSE_${PN}-socket.io-client-parseuri = "MIT"
LICENSE_${PN}-socket.io-client-socket.io-parser-component-emitter = "MIT"
LICENSE_${PN}-socket.io-client-socket.io-parser-debug-ms = "MIT"
LICENSE_${PN}-socket.io-client-socket.io-parser-debug = "MIT"
LICENSE_${PN}-socket.io-client-socket.io-parser-has-binary2-isarray = "MIT"
LICENSE_${PN}-socket.io-client-socket.io-parser-has-binary2 = "MIT"
LICENSE_${PN}-socket.io-client-socket.io-parser-isarray = "MIT"
LICENSE_${PN}-socket.io-client-socket.io-parser = "MIT"
LICENSE_${PN}-socket.io-client-to-array = "MIT"
LICENSE_${PN}-socket.io-client = "MIT"
LICENSE_${PN}-socket.io-parser-component-emitter = "MIT"
LICENSE_${PN}-socket.io-parser-debug-ms = "MIT"
LICENSE_${PN}-socket.io-parser-debug = "MIT"
LICENSE_${PN}-socket.io-parser-has-binary2-isarray = "MIT"
LICENSE_${PN}-socket.io-parser-has-binary2 = "MIT"
LICENSE_${PN}-socket.io-parser-isarray = "MIT"
LICENSE_${PN}-socket.io-parser = "MIT"
LICENSE_${PN} = "MIT"
