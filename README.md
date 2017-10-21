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
    /path/to/yocto/meta \
    /path/to/yocto/meta-poky \
    /path/to/yocto/meta-yocto-bsp \
    /path/to/yocto/meta-rover \
    "

To make sure every package is whitelisted by the build system,

In your build system under conf/local.conf
Add

   LICENSE_FLAGS_WHITELIST="commercial"


II. Misc
========

