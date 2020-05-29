LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Simple-1.302175.tar.gz"
SRC_URI[md5sum] = "9ef563cd61fdb265dc11fdd68aa384d4"
SRC_URI[sha256sum] = "c8c8f5c51ad6d7a858c3b61b8b658d8e789d3da5d300065df0633875b0075e49"
S = "${WORKDIR}/Test-Simple-1.302175"
inherit cpan
DEPENDS = " \
file-spec-perl \
file-temp-perl \
scalar-util-perl \
storable-perl \
utf8-perl \
"
RDEPENDS_${PN} = " \
"
