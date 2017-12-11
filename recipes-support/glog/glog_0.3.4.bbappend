
ALLOW_EMPTY_glog = '1'

# Fix compilation error
EXTRA_OECONF_append = " --enable-static --disable-shared"
