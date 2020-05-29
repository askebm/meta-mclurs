LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/S/SA/SAPER/XSLoader-0.24.tar.gz"
SRC_URI[md5sum] = "9b477bb1f0c903d95bef91d4452bc506"
SRC_URI[sha256sum] = "e819a35a6b8e55cb61b290159861f0dc00fe9d8c4f54578eb24f612d45c8d85f"
S = "${WORKDIR}/XSLoader-0.24/"
inherit cpan
DEPENDS = " \
test-more-perl \
"
RDEPENDS_${PN} = " \
"
