# To pull all lfs files
#do_configure_prepend() {
#        git-lfs pull
#}

# To use systems node modules
do_install_append () {
	ln -sf /usr/lib/node_modules ${D}/opt/rover-web/scripts/nodejs
}
