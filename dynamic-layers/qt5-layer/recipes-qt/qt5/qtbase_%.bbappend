PACKAGECONFIG_GL_rk3399 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'gl', \
                              bb.utils.contains('DISTRO_FEATURES', 'opengl', 'eglfs gles2', \
                                                '', d), d)}"
PACKAGECONFIG_GL_append_rk3399 = " kms gbm"

PACKAGECONFIG_FONTS_rk3399 = "fontconfig"

PACKAGECONFIG_append_rk3399 = " libinput examples tslib xkbcommon"
PACKAGECONFIG_remove_rk3399 = "tests"
