# Rockchip RK3399 compiles some M0 firmware which requires an arm-none-eabi GCC
# toolchain
DEPENDS_append_rk3399 = " virtual/arm-none-eabi-gcc-native"

COMPATIBLE_MACHINE_append_rk3399 = "|rk3399"
COMPATIBLE_MACHINE_append_rk3328 = "|rk3328"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "\
    file://serial-console-baudrate.patch \
    file://0001-Fix-build-with-gcc-11.patch \
    file://0001-dram-Fix-build-with-gcc-11.patch \
    file://0001-plat_macros.S-Use-compatible-.asciz-asm-directive.patch \
    file://0001-pmu-Do-not-mark-already-defined-functions-as-weak.patch \
"
