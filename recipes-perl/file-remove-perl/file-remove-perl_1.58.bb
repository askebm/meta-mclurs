LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHLOMIF/File-Remove-1.58.tar.gz"
SRC_URI[md5sum] = "f2d3959c7a8982bbdd03bb27f8b76891"
SRC_URI[sha256sum] = "81f6ec83acab8ba042afe904334a26eb3a56c217bdb9981d237a89ab072fd0d8"
S = "${WORKDIR}/File-Remove-1.58"
inherit cpan
DEPENDS = " \
perl \
module-build-perl \
"
RDEPENDS_${PN} = " \
perl \
"
