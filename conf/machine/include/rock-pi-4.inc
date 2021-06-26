# Add a common override for all Rock Pi 4 machines
MACHINEOVERRIDES =. "rock-pi-4:"

require conf/machine/include/rk3399.inc

RK_BOOT_DEVICE = "mmcblk1"

MACHINE_EXTRA_RRECOMMENDS += "kernel-modules"
