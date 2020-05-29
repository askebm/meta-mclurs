LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/CPAN-Meta-Requirements-2.140.tar.gz"
SRC_URI[md5sum] = "8febe4f14f356e57fd1e2c342d56a64b"
SRC_URI[sha256sum] = "0898645e8e86f0922f0f0502b503f592a8eb3d3176b4fd87adcc7ba51e751fa9"
S = "${WORKDIR}/CPAN-Meta-Requirements-2.140/"
inherit cpan
DEPENDS = " \
b-perl \
carp-perl \
strict-perl \
version-perl \
warnings-perl \
"
RDEPENDS_${PN} = " \
"
