LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/PathTools-3.75.tar.gz"
SRC_URI[md5sum] = "8f329058f74468a576442d841c62aa62"
SRC_URI[sha256sum] = "a558503aa6b1f8c727c0073339081a77888606aa701ada1ad62dd9d8c3f945a2"
S = "${WORKDIR}/PathTools-3.75/"
inherit cpan
DEPENDS = " \
carp-perl \
file-basename-perl \
scalar-util-perl \
test-more-perl \
"
RDEPENDS_${PN} = " \
"
