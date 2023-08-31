FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"

SRC_URI = "\
    file://emmcsetup.lua \
    file://sw-description \
"

# images and files that will be included in the .swu image
SWUPDATE_IMAGES = "core-image-full-cmdline"