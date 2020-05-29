LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/Module-CoreList-5.20200428.tar.gz"
SRC_URI[md5sum] = "0eb169f65c14b6674acd3ad45ccd7241"
SRC_URI[sha256sum] = "eaceca5f46b41fa2f572a69c4686a340e7b742c91902f01fcd99bf3404d349c1"
S = "${WORKDIR}/Module-CoreList-5.20200428/"
inherit cpan
DEPENDS = " \
perl \
"
RDEPENDS_${PN} = " \
perl \
"
