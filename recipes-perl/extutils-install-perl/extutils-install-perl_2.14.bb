LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/ExtUtils-Install-2.14.tar.gz"
SRC_URI[md5sum] = "ae6af2689daa6f8c2d01d04a28ab0ef0"
SRC_URI[sha256sum] = "35412305cbae979aac3b6e2c70cb301ae461979a1d848a8a043f74518eb96aea"
S = "${WORKDIR}/ExtUtils-Install-2.14/"
inherit cpan
DEPENDS = " \
carp-perl \
cwd-perl \
extutils-makemaker-perl \
file-basename-perl \
file-compare-perl \
file-copy-perl \
file-find-perl \
file-path-perl \
file-spec-perl \
file-temp-perl \
"
RDEPENDS_${PN} = " \
"
