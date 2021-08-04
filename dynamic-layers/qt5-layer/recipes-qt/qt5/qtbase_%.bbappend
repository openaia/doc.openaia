PACKAGECONFIG_GL:rk3399 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'gl', \
                              bb.utils.contains('DISTRO_FEATURES', 'opengl', 'eglfs gles2', \
                                                '', d), d)}"
PACKAGECONFIG_GL:append:rk3399 = " kms gbm"

PACKAGECONFIG_FONTS:rk3399 = "fontconfig"

PACKAGECONFIG:append:rk3399 = " libinput examples tslib xkbcommon"
PACKAGECONFIG:remove:rk3399 = "tests"
