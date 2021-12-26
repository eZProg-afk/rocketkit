package spiral.bit.dev.rocket_kit.base.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import spiral.bit.dev.rocket_kit.base.fragment.orbit.OrbitViewModel
import spiral.bit.dev.rocket_kit.extensions.containerHost.observe

abstract class OrbitActivity<BINDING : ViewBinding, STATE : Any, SIDE_EFFECT : Any>(
    private val inflateBinding: (LayoutInflater, ViewGroup?, Boolean) -> BINDING
) : AppCompatActivity() {

    var binding: BINDING? = null
        private set

    abstract val viewModel: OrbitViewModel<STATE, SIDE_EFFECT>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rootView = findViewById<ViewGroup>(android.R.id.content)
        inflateBinding(layoutInflater, rootView, false).also { binding = it }
        setContentView(checkNotNull(binding).root)
        bindMviToViewModel()
    }

    private fun bindMviToViewModel() = with(viewModel) {
        observe(this@OrbitActivity, state = ::renderState, sideEffect = ::handleSideEffect)
    }

    protected abstract fun renderState(state: STATE)

    protected abstract fun handleSideEffect(sideEffect: SIDE_EFFECT)
}