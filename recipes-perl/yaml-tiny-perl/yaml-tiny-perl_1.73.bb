LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/YAML-Tiny-1.73.tar.gz"
SRC_URI[md5sum] = "d1bb2525e4ab46bfab4b22842c467529"
SRC_URI[sha256sum] = "bc315fa12e8f1e3ee5e2f430d90b708a5dc7e47c867dba8dce3a6b8fbe257744"
S = "${WORKDIR}/YAML-Tiny-1.73/"
inherit cpan
DEPENDS = " \
perl \
"
RDEPENDS_${PN} = " \
perl \
"
