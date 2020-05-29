LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DM/DMAKI/ZMQ-1.06.tar.gz"
SRC_URI[md5sum] = "bb78a185d0d9e7ae0be02b115b0a7958"
SRC_URI[sha256sum] = "97e51ffd7747e37d6d1587be5c624652d3b29aceebd7924ac4bd5d0895f36c38"
S = "${WORKDIR}/ZMQ-1.06/"
inherit cpan
DEPENDS = " \
perl \
sub-name-perl \
zmq-constants-perl \
zmq-libzmq2-perl \
devel-checklib-perl \
task-weaken-perl \
test-fatal-perl \
try-tiny-perl \
test-requires-perl \
test-tcp-perl \
test-sharedfork-perl \
zmq-constants-perl \
"
RDEPENDS_${PN} = " \
perl \
sub-name-perl \
zmq-constants-perl \
zmq-libzmq2-perl \
task-weaken-perl \
zmq-constants-perl \
"
