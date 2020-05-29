LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DM/DMAKI/ZMQ-Constants-1.04.tar.gz"
SRC_URI[md5sum] = "993961a924f88de186419b590266d9c0"
SRC_URI[sha256sum] = "bec3d17d924b8a3fc90505d22ab8154006acc3bac7ad66372470e715165f4b93"
S = "${WORKDIR}/ZMQ-Constants-1.04/"
inherit cpan
DEPENDS = " \
perl \
module-install-perl \
"
RDEPENDS_${PN} = " \
perl \
"
export PERLLIB="${STAGING_DIR_HOST}/usr/share/perl5"
