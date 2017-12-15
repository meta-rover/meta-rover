# Since AGL uses libunwind
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "file://0001-unwind-support.appendpatch"

apply_contrib_patch () {
	cd ${S}/../contrib
	git apply ${S}/../0001-unwind-support.appendpatch
}

# Moves the macro at the appropriate location.
do_patch_append () {
    bb.build.exec_func('apply_contrib_patch', d)
}
