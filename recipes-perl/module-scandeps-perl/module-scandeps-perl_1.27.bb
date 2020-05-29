LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/R/RS/RSCHUPP/Module-ScanDeps-1.27.tar.gz"
SRC_URI[md5sum] = "54a6339fee713017195a0a3d315fe3ce"
SRC_URI[sha256sum] = "ee4ce19c04485e5caf71384e599518b2cbad2f27241ab09d89e0969e524ed948"
S = "${WORKDIR}/Module-ScanDeps-1.27/"
inherit cpan
DEPENDS = " \
file-spec-perl \
file-temp-perl \
getopt-long-perl \
module-metadata-perl \
text-parsewords-perl \
version-perl \
"
RDEPENDS_${PN} = " \
"
