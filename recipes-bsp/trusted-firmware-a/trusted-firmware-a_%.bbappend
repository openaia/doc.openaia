# Rockchip RK3399 compiles some M0 firmware which requires an arm-none-eabi GCC
# toolchain
DEPENDS_append_rk3399 = " virtual/arm-none-eabi-gcc-native"

COMPATIBLE_MACHINE_append_rk3399 = "|rk3399"

