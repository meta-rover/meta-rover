do_deploy_append() {
	sed -i -e 's/#start_x=.*/start_x=1/' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
