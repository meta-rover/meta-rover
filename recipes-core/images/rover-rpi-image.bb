#
# Rover Image For Raspberry Pi - without AGL 
# Created by M.Ozcelikors <mozcelikors@gmail.com>

DESCRIPTION = "APP4MC-APPSTACLE Rover Extended Image Creation Recipe for Raspberry Pi"
LICENSE = "MIT"

# Use Raspberry Pi image
require recipes-core/images/rpi-test-image.bb

# Re-use what's implemented for Rover
require recipes-core/images/rover-rpi-image-reuse.bb

