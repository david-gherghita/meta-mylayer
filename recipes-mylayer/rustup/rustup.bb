SUMMARY = "recipe to copy rustup-init script"
DESCRIPTION = "Recipe created by David Gherghita"
LICENSE = "CLOSED"

SRC_URI = "file://rustup-init.sh"

do_install() {
    install -d ${D}${ROOT_HOME}
    install -m 0755 ${WORKDIR}/rustup-init.sh ${D}${ROOT_HOME}
}

FILES_${PN} = "${ROOT_HOME}/rustup-init.sh"
