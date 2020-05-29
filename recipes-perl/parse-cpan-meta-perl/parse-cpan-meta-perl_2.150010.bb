LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/CPAN-Meta-2.150010.tar.gz"
SRC_URI[md5sum] = "40043190b75a1d598f9bee5ed70a44de"
SRC_URI[sha256sum] = "e4f80f2ec73e0741455f957bbfc992b167ecbfa1c9e23ba358df3b37b86ba3d6"
S = "${WORKDIR}/CPAN-Meta-2.150010/"
inherit cpan
DEPENDS = " \
carp-perl \
cpan-meta-requirements-perl \
cpan-meta-yaml-perl \
encode-perl \
exporter-perl \
file-spec-perl \
json-pp-perl \
scalar-util-perl \
strict-perl \
version-perl \
warnings-perl \
"
RDEPENDS_${PN} = " \
"
