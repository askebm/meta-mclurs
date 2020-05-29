LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/JSON-PP-4.04.tar.gz"
SRC_URI[md5sum] = "5268ef58fc8ed59a63e61bd36675b6ba"
SRC_URI[sha256sum] = "81311c56d7b94bbf8003cf421e87961efba576189198e516fd5426889650b66a"
S = "${WORKDIR}/JSON-PP-4.04/"
inherit cpan
DEPENDS = " \
scalar-util-perl \
test-more-perl \
"
RDEPENDS_${PN} = " \
"
