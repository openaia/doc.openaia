# Copyright (C) 2022 Edgeble AI Technologies Pvt. Ltd.
# Released under the MIT license (see COPYING.MIT for the terms)

# Add a common override for Edge Compute Module 0
MACHINEOVERRIDES =. "edge-compute-module-0:"

require conf/machine/include/rv1126.inc
require conf/machine/include/rockchip-wic.inc

# Remove unnecessary firmware
ROOTFS_POSTPROCESS_COMMAND:append = " do_post_rootfs;"
do_post_rootfs() {
	rm -rf ${IMAGE_ROOTFS}/lib/firmware/ath10k/QCA4019
	rm -rf ${IMAGE_ROOTFS}/lib/firmware/ath10k/QCA6174
	rm -rf ${IMAGE_ROOTFS}/lib/firmware/ath10k/QCA9887
	rm -rf ${IMAGE_ROOTFS}/lib/firmware/ath10k/QCA9888
	rm -rf ${IMAGE_ROOTFS}/lib/firmware/ath10k/QCA988X
	rm -rf ${IMAGE_ROOTFS}/lib/firmware/ath10k/QCA9984
	rm -rf ${IMAGE_ROOTFS}/lib/firmware/ath10k/QCA99X0
	rm -rf ${IMAGE_ROOTFS}/lib/firmware/ath10k/WCN3990
	rm -rf ${IMAGE_ROOTFS}/lib/firmware/ath10k/QCA9984
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/crbtfw21.tlv
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/crbtfw32.tlv
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/crnv21.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/crnv32.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/crnv32u.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/htbtfw20.tlv
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/htnv20.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/msbtfw11.mbn
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/msbtfw11.tlv
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/msnv11.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_00130300.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_00130302.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_00440302.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_00440302_eu.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_00440302_i2s_eu.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00000200.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00000201.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00000300.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00000302.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00000302_eu.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130200.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130200_0104.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130200_0105.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130200_0106.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130200_0107.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130200_0109.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130200_0110.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130201.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130201_010a.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130201_010b.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130201_0303.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130201_gf.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130201_gf_010a.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130201_gf_010b.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/nvm_usb_00130201_gf_0303.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/rampatch_00130300.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/rampatch_00130302.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/rampatch_00440302.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/rampatch_usb_00000200.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/rampatch_usb_00000201.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/rampatch_usb_00000300.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/rampatch_usb_00000302.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/rampatch_usb_00130200.bin
	rm ${IMAGE_ROOTFS}/lib/firmware/qca/rampatch_usb_00130201.bin
}
