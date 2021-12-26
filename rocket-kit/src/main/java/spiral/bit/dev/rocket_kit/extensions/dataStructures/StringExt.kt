package spiral.bit.dev.rocket_kit.extensions.dataStructures

import java.text.DecimalFormat

fun String.toPriceAmount(): String {
    val dec = DecimalFormat("###,###,###.00")
    return dec.format(this.toDouble())
}