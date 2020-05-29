LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DM/DMAKI/ZMQ-LibZMQ3-1.19.tar.gz \
           "
SRC_URI[md5sum] = "c1514be966e4db371d9eb5f5e05eac3a"
SRC_URI[sha256sum] = "529b867bbd04c25e981a4feca02163f9776e0296b0c252c1ffb21daa195bd580"
S = "${WORKDIR}/ZMQ-LibZMQ3-1.19/"
inherit cpan pkgconfig ptest
DEPENDS = " \
perl \
devel-checklib-perl \
task-weaken-perl \
test-fatal-perl \
try-tiny-perl \
test-requires-perl \
test-tcp-perl \
test-sharedfork-perl \
zmq-constants-perl \
module-install-perl \
zeromq \
"
RDEPENDS_${PN} = " \
perl \
task-weaken-perl \
zmq-constants-perl \
zeromq \
"

do_configure_prepend () {
    export PERLLIB="${STAGING_DIR_HOST}/usr/share/perl5 $(perl -e 'print join(' ',@INC,"")')"
}
