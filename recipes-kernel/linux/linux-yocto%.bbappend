COMPATIBLE_MACHINE_marsboard-rk3066 = "marsboard-rk3066"
COMPATIBLE_MACHINE_rock2-square = "rock2-square"
COMPATIBLE_MACHINE_radxarock = "radxarock"
COMPATIBLE_MACHINE_firefly-rk3288 = "firefly-rk3288"
COMPATIBLE_MACHINE_vyasa-rk3288 = "vyasa-rk3288"
COMPATIBLE_MACHINE_tinker-board = "tinker-board"
COMPATIBLE_MACHINE_tinker-board-s = "tinker-board-s"
COMPATIBLE_MACHINE_rock-pi-4 = "rock-pi-4"
COMPATIBLE_MACHINE_nanopi-m4 = "nanopi-m4"
COMPATIBLE_MACHINE_nanopi-m4-2gb = "nanopi-m4-2gb"
COMPATIBLE_MACHINE_rock64 = "rock64"
COMPATIBLE_MACHINE_rock-pi-e = "rock-pi-e"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# indeed applicable to all rk3328 boards
SRC_URI_append_rock64 = " file://0001-ayufan-dtsi-rk3328-add-mmc0-mmc1-aliases.patch"
