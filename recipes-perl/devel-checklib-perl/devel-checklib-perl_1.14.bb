LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MATTN/Devel-CheckLib-1.14.tar.gz"
SRC_URI[md5sum] = "3519cbf9fe5ec3404449d5330ee5537f"
SRC_URI[sha256sum] = "f21c5e299ad3ce0fdc0cb0f41378dca85a70e8d6c9a7599f0e56a957200ec294"
S = "${WORKDIR}/Devel-CheckLib-1.14/"
inherit cpan
DEPENDS = " \
perl \
"
RDEPENDS_${PN} = " \
perl \
"
