# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   libmclurs-snap-perl-1.0/debian/copyright
#   libmclurs-snap-perl-1.0/debian/libmclurs-snap-perl/usr/share/doc/libmclurs-snap-perl/copyright
#   mclurs-1.0/debian/copyright
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://libmclurs-snap-perl-1.0/debian/copyright;md5=3d7a1388251a016265b06f7fe77d9699 \
                    file://libmclurs-snap-perl-1.0/debian/libmclurs-snap-perl/usr/share/doc/libmclurs-snap-perl/copyright;md5=3d7a1388251a016265b06f7fe77d9699 \
                    file://mclurs-1.0/debian/copyright;md5=4000a2a9c915abe613cf1ee84d51d60f"

SRC_URI = "git://gitlab.com/esrl/mclurs.git;protocol=https \
    file://Makefile;subdir=git"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "ff0f2ab3bac9147bb54895469f9a0c0965432923"

S = "${WORKDIR}/git"

inherit module autotools-brokensep

RDEPENDS_${PN} = "zmq-perl daemontools runit-systemd"

FILES_${PN} = "${bindir}/* ${sbindir}/* ${datadir}/*"
