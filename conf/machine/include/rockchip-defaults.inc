# meta-rockchip default settings

# kernel
PREFERRED_PROVIDER_virtual/kernel ?= "linux-yocto"
KCONFIG_MODE ?= "alldefconfig"
LINUX_VERSION_EXTENSION ?= "-rockchip"

# xserver
PREFERRED_PROVIDER_virtual/xserver = "xserver-xorg"
XSERVER = " \
	xserver-xorg \
	xserver-xorg-utils \
	xserver-xorg-xvfb \
	xserver-xorg-extension-glx \
	xserver-xorg-module-libwfb \
	xserver-xorg-module-exa \
	xf86-video-modesetting \
	xf86-input-evdev \
	xf86-input-mouse \
	xf86-input-keyboard \
	"

# misc
SERIAL_CONSOLES ?= "1500000;ttyS2"
IMAGE_FSTYPES += "ext4"

# use the first-defined <baud>;<device> pair in SERIAL_CONSOLES
# for the console parameter in the wks files
RK_CONSOLE_BAUD ?= "${@d.getVar('SERIAL_CONSOLES').split(';')[0]}"
RK_CONSOLE_DEVICE ?= "${@d.getVar('SERIAL_CONSOLES').split(';')[1].split()[0]}"

# boot device (sd-card/emmc)
RK_BOOT_DEVICE ??= "mmcblk0"

WICVARS_append = " \
	RK_BOOT_DEVICE \
	RK_CONSOLE_BAUD \
	RK_CONSOLE_DEVICE \
	"
