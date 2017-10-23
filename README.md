This README file contains information on the contents of the
rover layer.

Please see the corresponding sections below for details.



Patches
=======

Please submit any patches against the rover layer to the maintainers:

Maintainers:
 
Mustafa Ozcelikors <mozcelikors@gmail.com>

Pedro Cuadra

Dependencies
============

This layer depends on:

  ```
  URI: git://git.yoctoproject.org/poky
  branch: master
  revision: HEAD

  URI: https://github.com/openembedded/meta-openembedded.git
  layers: meta-python, meta-networking, meta-oe, meta-multimedia

  URI: git://git.yoctoproject.org/meta-qt5
  layers: meta-qt5

  URI: git://git.yoctoproject.org/meta-raspberrypi
  layers: meta-raspberrypi
  branch: master
  ```

Table of Contents
=================

  I. Adding the rover layer to your build
 II. Image creation for Raspberry Pi (Poky Distro)


I. Adding the rover layer to your build
=================================================

In order to use this layer, you need to make the build system aware of
it.

Assuming the rover layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the rover layer to bblayers.conf, along with any
other layers needed. e.g.:
```bitbake
  BBLAYERS ?= " \
    /home/mozcelikors-host/poky/meta \
    /home/mozcelikors-host/poky/meta-poky \
    /home/mozcelikors-host/poky/meta-yocto-bsp \
    /home/mozcelikors-host/poky/meta-rover \
    /home/mozcelikors-host/poky/meta-raspberrypi \
    /home/mozcelikors-host/poky/meta-multimedia \
    /home/mozcelikors-host/poky/meta-networking \
    /home/mozcelikors-host/poky/meta-oe \
    /home/mozcelikors-host/poky/meta-python \
    /home/mozcelikors-host/poky/meta-qt5 \
  "
```



Example build sys / machine setup should be in `conf/local.conf` should be as follows:

```bitbake
BB_VERSION        = "1.25.0"
BUILD_SYS         = "x86_64-linux"
NATIVELSBSTRING   = "Ubuntu-14.04"
TARGET_SYS        = "arm-poky-linux-gnueabi"
MACHINE           = "raspberrypi"
DISTRO            = "poky"
DISTRO_VERSION    = "2.3.2"
TUNE_FEATURES     = "arm armv6 vfp"
TARGET_FPU        = "vfp"
```

To make sure every package is whitelisted by the build system,

In your build system under conf/local.conf
Add

   `LICENSE_FLAGS_WHITELIST="commercial"`


II. Image creation for Raspberry Pi (Poky Distro)
=================================================

In order to create a Raspberry Pi image,
use our currently developed (experimental) image recipe that depends on rpi-test-image:

`meta-rover/recipes-core/images/rover-rpi-image-reuse.bb`

You can use the extended features in this image recipe and add them to your own recipe to build a custom Rover image.

To see the packages that will be build enter the following from your build root:

`bitbake -g rover-rpi-image && cat pn-buildlist`

To create the image:

`bitbake rover-rpi-image`

