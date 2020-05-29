LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/CPAN-Meta-YAML-0.018.tar.gz"
SRC_URI[md5sum] = "1e00f4426d743c88c6da1b79c7e882a5"
SRC_URI[sha256sum] = "33caf7c94cde58abdbd370a5ae7149635d4085c643d4838aa0ada97568821294"
S = "${WORKDIR}/CPAN-Meta-YAML-0.018/"
inherit cpan
DEPENDS = " \
b-perl \
carp-perl \
exporter-perl \
fcntl-perl \
scalar-util-perl \
strict-perl \
warnings-perl \
"
RDEPENDS_${PN} = " \
"
