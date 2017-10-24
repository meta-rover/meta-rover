# http://github.com/meta-rover/meta-rover

DESCRIPTION = "APP4MC-APPSTACLE Rover Extended Image Creation Recipe for Raspberry Pi"
LICENSE = "MIT"

# Use Raspberry Pi image
require recipes-core/images/rpi-hwup-image.bb

# Re-use what's implemented for Rover
require recipes-core/images/rover-rpi-image-reuse.bb

