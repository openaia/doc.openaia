do_compile_append_rock2-square () {
	# copy to default search path
	if [ "${SPL_BINARY}" = "u-boot-spl-dtb.bin" ]; then
		cp ${B}/spl/${SPL_BINARY} ${B}
	fi
}

ATF_DEPENDS ??= ""

EXTRA_OEMAKE_append_rk3399 = " BL31=${DEPLOY_DIR_IMAGE}/bl31-rk3399.elf"
ATF_DEPENDS_rk3399 = " virtual/trusted-firmware-a:do_deploy"
EXTRA_OEMAKE_append_rk3328 = " BL31=${DEPLOY_DIR_IMAGE}/bl31-rk3328.elf"
ATF_DEPENDS_rk3328 = " virtual/trusted-firmware-a:do_deploy"

do_compile[depends] .= "${ATF_DEPENDS}"

