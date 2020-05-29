LICENSE = "Unknown"
SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/constant-1.33.tar.gz"
SRC_URI[md5sum] = "4ee93d57fbd8dfbc4c902c495614d5f0"
SRC_URI[sha256sum] = "79965d4130eb576670e27ca0ae6899ef0060c76da48b02b97682166882f1b504"
S = "${WORKDIR}/constant-1.33/"
inherit cpan
DEPENDS = " \
test-more-perl \
"
RDEPENDS_${PN} = " \
"
