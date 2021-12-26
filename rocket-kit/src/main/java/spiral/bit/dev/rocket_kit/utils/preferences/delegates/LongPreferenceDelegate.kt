package spiral.bit.dev.rocket_kit.utils.preferences.delegates

import android.content.SharedPreferences
import spiral.bit.dev.rocket_kit.utils.preferences.CommonPreferenceDelegate

class LongPreferenceDelegate(private val defValue: Long, name: String? = null) : CommonPreferenceDelegate<Long>(name) {
    override fun getValue(prefs: SharedPreferences, key: String) = prefs.getLong(key, defValue)
    override fun setValue(prefs: SharedPreferences, key: String, value: Long) {
        prefs.edit().putLong(key, value).apply()
    }
}