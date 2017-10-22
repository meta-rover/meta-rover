#
# Rover Extended Image for Additional Embedded Features to Robots - uses Raspberry Pi
# Image Recipe Created by: Mustafa Ozcelikors <mozcelikors@gmail.com>
#

DESCRIPTION = "APP4MC-APPSTACLE Rover Extended Image Creation Recipe"

require recipes-core/images/rpi-test-image.bb

IMAGE_INSTALL +="apache2 php opencv raspicam"
