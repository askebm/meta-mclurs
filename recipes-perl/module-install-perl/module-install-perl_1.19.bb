LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Module-Install-1.19.tar.gz"
SRC_URI[md5sum] = "0d1b78cc13ebf9b9ad008c8928a5b2dd"
SRC_URI[sha256sum] = "1a53a78ddf3ab9e3c03fc5e354b436319a944cba4281baf0b904fa932a13011b"
S = "${WORKDIR}/Module-Install-1.19/"
inherit cpan
DEPENDS = " \
perl \
file-remove-perl \
module-build-perl \
module-build-perl \
module-corelist-perl \
module-scandeps-perl \
yaml-tiny-perl \
"
RDEPENDS_${PN} = " \
perl \
file-remove-perl \
module-build-perl \
module-corelist-perl \
module-scandeps-perl \
yaml-tiny-perl \
"

export PERLLIB="${STAGING_DIR_HOST}/usr/share/perl5"
