# This is a workaround to enable building with newer versions of nodejs
# This is a copied from the npm.class and edited
do_compile() {
	# Copy in any additionally fetched modules
	if [ -d ${WORKDIR}/node_modules ] ; then
		cp -a ${WORKDIR}/node_modules ${S}/
	fi
	# changing the home directory to the working directory, the .npmrc will
	# be created in this directory
	export HOME=${WORKDIR}
	npm config set dev false
	npm set cache ${WORKDIR}/npm_cache
	# clear cache before every build
	npm cache verify
	# Install pkg into ${S} without going to the registry
	npm --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production --no-registry install
}
