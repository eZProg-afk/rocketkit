package spiral.bit.dev.rocket_kit.extensions.dataStructures

@Suppress("UNCHECKED_CAST")
inline fun <reified T> Any?.castOrNull(): T? = this as? T

fun Any?.isNull() = this == null