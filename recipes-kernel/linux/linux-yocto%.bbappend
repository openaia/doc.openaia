COMPATIBLE_MACHINE:marsboard-rk3066 = "marsboard-rk3066"
COMPATIBLE_MACHINE:rock2-square = "rock2-square"
COMPATIBLE_MACHINE:radxarock = "radxarock"
COMPATIBLE_MACHINE:firefly-rk3288 = "firefly-rk3288"
COMPATIBLE_MACHINE:vyasa-rk3288 = "vyasa-rk3288"
COMPATIBLE_MACHINE:tinker-board = "tinker-board"
COMPATIBLE_MACHINE:tinker-board-s = "tinker-board-s"
COMPATIBLE_MACHINE:rock-pi-4 = "rock-pi-4"
COMPATIBLE_MACHINE:nanopi-m4 = "nanopi-m4"
COMPATIBLE_MACHINE:nanopi-m4-2gb = "nanopi-m4-2gb"
COMPATIBLE_MACHINE:rock64 = "rock64"
COMPATIBLE_MACHINE:rock-pi-e = "rock-pi-e"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# indeed applicable to all rk3328 boards
SRC_URI:append:rock64 = " file://0001-ayufan-dtsi-rk3328-add-mmc0-mmc1-aliases.patch"
