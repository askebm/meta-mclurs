# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   runit-2.1.2/package/COPYING
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://runit-2.1.2/package/COPYING;md5=c9e8a560732fc8b860b6a91341cc603b"

SRC_URI = "http://smarden.org/runit/runit-${PV}.tar.gz \
           file://runit.service \
           file://0001-Fix-so-we-can-compile-in-crops.patch \
           "
SRC_URI[md5sum] = "6c985fbfe3a34608eb3c53dc719172c4"
SRC_URI[sha256sum] = "6fd0160cb0cf1207de4e66754b6d39750cff14bb0aa66ab49490992c0c47ba18"



S = "${WORKDIR}/admin"


# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
    cd runit-${PV}/src
    # set default service path to /var/service
    sed -i -e 's:^char \*varservice ="/service/";$:char \*varservice ="/var/service/";:' sv.c

    # do not build statically
    sed -i -e 's/ -static//g' Makefile

    # add custom CFLAGS and LDFLAGS instead of predefined ones by the source
    echo "${CC:-gcc} $CFLAGS" > conf-cc
    echo "${CC:-gcc -s} $LDFLAGS" > conf-ld
}

do_compile () {
    cd runit-${PV}/src
    oe_runmake
}

do_install () {
    cd runit-${PV}
    install -dm755 "${D}/var/service"
    install -Dm755 src/{chpst,runit,runit-init,runsv,runsvchdir,runsvdir,sv,svlogd,utmpset} -t "${D}${bindir}"
    install -Dm644 man/* -t "${D}${datadir}/man/man8"
    install -Dm644 doc/*.html -t "${D}${datadir}/doc/runit"
    install -Dm644 "package/COPYING" "${D}${datadir}/licenses/${pkgname}/COPYING"
    install -Dm644 "${WORKDIR}/runit.service" "${D}${libdir}/systemd/system/runit.service"
}
FILES_${PN} = "${bindir}/* ${libdir}/systemd/* /var/service"
FILES_${PN}-dev = "${datadir}/*"


