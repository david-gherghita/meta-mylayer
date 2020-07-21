SUMMARY = "recipe to copy startup script file to rootfs \
	and set it with update-rc.d"
DESCRIPTION = "Recipe created by David Gherghita"
LICENSE = "CLOSED"

inherit update-rc.d

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME = "startup-script.sh"

SRC_URI = "file://startup-script.sh"

do_install() {
    install -d ${D}${INIT_D_DIR}
    install -m 0755 ${WORKDIR}/startup-script.sh ${D}${INIT_D_DIR}
}

FILES_${PN} = "${INIT_D_DIR}/startup-script.sh"
