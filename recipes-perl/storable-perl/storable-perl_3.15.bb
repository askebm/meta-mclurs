LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/Storable-3.15.tar.gz"
SRC_URI[md5sum] = "7890d8e32c03f9584a1cc65068a7a154"
SRC_URI[sha256sum] = "fc3dad06cb2e6fc86a2f2abc5b5491d9da328ca3e6b6306559c224521db174da"
S = "${WORKDIR}/Storable-3.15/"
inherit cpan
DEPENDS = " \
xsloader-perl \
"
RDEPENDS_${PN} = " \
"
