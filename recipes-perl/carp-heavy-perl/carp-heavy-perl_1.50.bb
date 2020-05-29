LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/Carp-1.50.tar.gz"
SRC_URI[md5sum] = "95ad382253475fa9f7a4c04c8946136e"
SRC_URI[sha256sum] = "f5273b4e1a6d51b22996c48cb3a3cbc72fd456c4038f5c20b127e2d4bcbcebd9"
S = "${WORKDIR}/Carp-1.50/"
inherit cpan
DEPENDS = " \
config-perl \
exporter-perl \
extutils-makemaker-perl \
ipc-open3-perl \
overload-perl \
strict-perl \
test-more-perl \
warnings-perl \
"
RDEPENDS_${PN} = " \
"
