LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/J/JK/JKEENAN/File-Path-2.16.tar.gz"
SRC_URI[md5sum] = "1994f582d7183f310050373b2048174e"
SRC_URI[sha256sum] = "21f7d69b59c381f459c5f0bf697d512109bd911f12ca33270b70ca9a9ef6fa05"
S = "${WORKDIR}/File-Path-2.16/"
inherit cpan
DEPENDS = " \
cwd-perl \
exporter-perl \
file-basename-perl \
file-spec-perl \
"
RDEPENDS_${PN} = " \
"
