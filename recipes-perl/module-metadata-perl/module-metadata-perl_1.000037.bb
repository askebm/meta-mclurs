LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Module-Metadata-1.000037.tar.gz"
SRC_URI[md5sum] = "6928e97831255ec3c99271a598523ea9"
SRC_URI[sha256sum] = "8d5a74c1b07e145edda254602fedf19c0dd0c2d9688a370afdaff89c32cba629"
S = "${WORKDIR}/Module-Metadata-1.000037/"
inherit cpan
DEPENDS = " \
carp-perl \
encode-perl \
fcntl-perl \
file-find-perl \
file-spec-perl \
strict-perl \
version-perl \
warnings-perl \
"
RDEPENDS_${PN} = " \
"
