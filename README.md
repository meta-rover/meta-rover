This README file contains information on the contents of the
rover layer.

Please see the corresponding sections below for details.



Patches
=======

Please submit any patches against the rover layer to the maintainer:

Maintainer: Mustafa Ozcelikors <mozcelikors@gmail.com>


Dependencies
============

This layer depends on:

  URI: git://git.openembedded.org/bitbake
  branch: master

  URI: git://git.openembedded.org/openembedded-core
  layers: meta
  branch: master

  URI: https://github.com/openembedded/meta-openembedded.git
  layers: meta-python, meta-networking, meta-oe, meta-multimedia

  URI: git://git.yoctoproject.org/meta-qt4
  layers: meta-qt

  URI: git://git.yoctoproject.org/meta-raspberrypi
  layers: meta-raspberrypi
  branch: master

Table of Contents
=================

  I. Adding the rover layer to your build
 II. Misc


I. Adding the rover layer to your build
=================================================

In order to use this layer, you need to make the build system aware of
it.

Assuming the rover layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the rover layer to bblayers.conf, along with any
other layers needed. e.g.:

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
    /home/mozcelikors-host/poky/meta-qt4 \
  "




Example build sys / machine setup should be in conf/local.conf should be as follows:

BB_VERSION        = "1.25.0"
BUILD_SYS         = "x86_64-linux"
NATIVELSBSTRING   = "Ubuntu-14.04"
TARGET_SYS        = "arm-poky-linux-gnueabi"
MACHINE           = "raspberrypi"
DISTRO            = "poky"
DISTRO_VERSION    = "2.3.2"
TUNE_FEATURES     = "arm armv6 vfp"
TARGET_FPU        = "vfp"

To make sure every package is whitelisted by the build system,

In your build system under conf/local.conf
Add

   LICENSE_FLAGS_WHITELIST="commercial"


II. Misc
========

