# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   COPYING.LESSER
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=f7b40df666d41e6508d03e1c207d498f \
                    file://COPYING.LESSER;md5=ad8c3bd15d88ea9d4509fc89bebc915c"

SRC_URI = "http://download.zeromq.org/zeromq-${PV}.tar.gz"
SRC_URI[md5sum] = "d4189c152fbdc45b376a30bd643f67fd"
SRC_URI[sha256sum] = "09653e56a466683edb2f87ee025c4de55b8740df69481b9d7da98748f0c92124"

inherit pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

