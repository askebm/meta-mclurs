LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DM/DMAKI/ZMQ-LibZMQ2-1.09.tar.gz"
SRC_URI[md5sum] = "5960e55ea8a701cf50a74ee969a78b90"
SRC_URI[sha256sum] = "4a63890a4f34063ca824c9d7d82354c00e2d5476daef32ea7e05fbe8e8550fc2"
S = "${WORKDIR}/ZMQ-LibZMQ2-1.09/"
inherit cpan
DEPENDS = " \
task-weaken-perl \
xsloader-perl \
zmq-constants-perl \
"
RDEPENDS_${PN} = " \
task-weaken-perl \
zmq-constants-perl \
"
