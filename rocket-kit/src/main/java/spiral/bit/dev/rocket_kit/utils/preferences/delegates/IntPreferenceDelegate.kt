package spiral.bit.dev.rocket_kit.utils.preferences.delegates

import android.content.SharedPreferences
import spiral.bit.dev.rocket_kit.utils.preferences.CommonPreferenceDelegate

class IntPreferenceDelegate(private val defValue: Int, name: String? = null) : CommonPreferenceDelegate<Int>(name) {
    override fun getValue(prefs: SharedPreferences, key: String) = prefs.getInt(key, defValue)
    override fun setValue(prefs: SharedPreferences, key: String, value: Int) {
        prefs.edit().putInt(key, value).apply()
    }
}