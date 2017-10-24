# http://github.com/meta-rover/meta-rover

DESCRIPTION = "APP4MC-APPSTACLE Rover Extended Image Creation Recipe Append File"
LICENSE = "MIT"

IMAGE_INSTALL_append = " apache2 php wiringPi php-cli php-modphp opencv raspicam python-psutil"

# Check for providers of libs
#TOOLCHAIN_TARGET_TASK_append = " libraspicam libwiringpi libopencv_core libopencv_highgui libopencv_imgproc"
