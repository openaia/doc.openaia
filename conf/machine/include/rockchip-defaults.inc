# meta-rockchip default settings

# kernel
PREFERRED_PROVIDER_virtual/kernel ?= "linux-yocto"
KCONFIG_MODE ?= "alldefconfig"

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
