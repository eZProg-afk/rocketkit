package spiral.bit.dev.rocket_kit.utils.preferences.delegates

import android.content.SharedPreferences
import spiral.bit.dev.rocket_kit.utils.preferences.CommonPreferenceDelegate

class FloatPreferenceDelegate(private val defValue: Float, name: String? = null) : CommonPreferenceDelegate<Float>(name) {
    override fun getValue(prefs: SharedPreferences, key: String) = prefs.getFloat(key, defValue)
    override fun setValue(prefs: SharedPreferences, key: String, value: Float) {
        prefs.edit().putFloat(key, value).apply()
    }
}