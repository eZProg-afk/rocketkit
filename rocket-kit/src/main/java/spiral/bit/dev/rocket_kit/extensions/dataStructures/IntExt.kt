package spiral.bit.dev.rocket_kit.extensions.dataStructures

import android.content.res.Resources

val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()