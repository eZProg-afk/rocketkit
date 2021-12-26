package spiral.bit.dev.rocket_kit.utils

import androidx.recyclerview.widget.GridLayoutManager

object SpanSizeLookupUtils {

    fun oneSpan(defaultColumn: Int, positions: List<Int>): GridLayoutManager.SpanSizeLookup {
        return object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return if (position in positions) defaultColumn else 1
            }
        }
    }
}