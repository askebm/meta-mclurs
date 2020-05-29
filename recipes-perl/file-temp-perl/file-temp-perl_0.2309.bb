LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/File-Temp-0.2309.tar.gz"
SRC_URI[md5sum] = "c089008cca0e6558e77d8403182bc521"
SRC_URI[sha256sum] = "01b242a9888d155db981aa0a9891ce2c9e439f0e4bbff4dbf17ca4997be6235f"
S = "${WORKDIR}/File-Temp-0.2309/"
inherit cpan
DEPENDS = " \
carp-perl \
carp-heavy-perl \
constant-perl \
cwd-perl \
exporter-perl \
fcntl-perl \
file-path-perl \
file-spec-perl \
io-handle-perl \
io-seekable-perl \
overload-perl \
parent-perl \
posix-perl \
scalar-util-perl \
strict-perl \
symbol-perl \
"
RDEPENDS_${PN} = " \
"
