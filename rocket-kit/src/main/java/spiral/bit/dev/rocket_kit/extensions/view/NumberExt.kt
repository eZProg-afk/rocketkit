package spiral.bit.dev.rocket_kit.extensions.view

import android.content.res.Resources
import android.util.DisplayMetrics

val Number.dp get() = toFloat() * (Resources.getSystem().displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)