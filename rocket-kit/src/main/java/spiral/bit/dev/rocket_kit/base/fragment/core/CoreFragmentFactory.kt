package spiral.bit.dev.rocket_kit.base.fragment.core

import androidx.fragment.app.FragmentFactory

class CoreFragmentFactory(private val fragmentFactoryStore: FragmentFactoryStore) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String) =
        fragmentFactoryStore.getFactory(className)?.invoke()
            ?: super.instantiate(classLoader, className)
}