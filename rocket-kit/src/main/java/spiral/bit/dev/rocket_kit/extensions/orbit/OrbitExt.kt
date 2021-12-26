package spiral.bit.dev.rocket_kit.extensions.orbit

import androidx.viewbinding.ViewBinding
import spiral.bit.dev.rocket_kit.base.activity.OrbitActivity
import spiral.bit.dev.rocket_kit.base.fragment.orbit.OrbitFragment

fun <BINDING : ViewBinding, STATE : Any, SIDE_EFFECT : Any> OrbitActivity<BINDING, STATE, SIDE_EFFECT>.binding(block: BINDING.() -> Unit) {
    binding?.apply(block)
}

fun <STATE : Any, SIDE_EFFECT : Any, BINDING : ViewBinding> OrbitFragment<STATE, SIDE_EFFECT, BINDING>.binding(block: BINDING.() -> Unit) {
    binding?.apply(block)
}