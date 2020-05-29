LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TODDR/IO-1.42.tar.gz"
SRC_URI[md5sum] = "e8e33b749d9fd7cf273f301e1b54972b"
SRC_URI[sha256sum] = "eec5cc33a6cddba8b5d2425b60752882add7e4d41b7431a0ea4dcd73cc1f8cca"
S = "${WORKDIR}/IO-1.42/"
inherit cpan
DEPENDS = " \
file-temp-perl \
test-more-perl \
"
RDEPENDS_${PN} = " \
"
