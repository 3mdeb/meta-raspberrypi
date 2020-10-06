require userland.inc

COMPATIBLE_MACHINE = "raspberrypi4-64"

# Keep only those libs & bins that are actually
# used during boot EEPROM image update
do_install_append () {
        rm -rf ${D}${bindir}/tvservice
        rm -rf ${D}${bindir}/vchiq_test
        rm -rf ${D}${bindir}/dtmerge
        rm -rf ${D}${prefix}/include
        rm -rf ${D}${prefix}/src
        rm -rf ${D}${libdir}/pkgconfig
        rm -rf ${D}${libdir}/*debug*
        rm -rf ${D}${libdir}/*host*
        rm -rf ${D}${libdir}/*.a
        rm -rf ${D}${bindir}/*post
        rm -rf ${D}${bindir}/*pre
}

FILES_${PN} += " ${libdir}/*.so "
