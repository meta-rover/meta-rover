# Since AGL uses libunwind
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "file://0001-unwind-support.appendpatch"

do_configure_prepend () {
    cd ${S}/../contrib
    git apply ${S}/../0001-unwind-support.appendpatch
}

