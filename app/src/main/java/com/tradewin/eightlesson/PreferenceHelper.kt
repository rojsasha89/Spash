package com.tradewin.eightlesson

import android.content.Context
import android.content.SharedPreferences

object PreferenceHelper {

    private lateinit var preference: SharedPreferences

    private const val APP_NAME = "eightlesson"
    private const val LOGIN = "login"
    private const val NAME = "name"
    private const val SECOND_NAME = "secondName"
    private const val PASS = "pass"
    private const val COUNTRY = "country"

    fun initPreference(context: Context) {
        preference = context.getSharedPreferences(APP_NAME, Context.MODE_PRIVATE)
    }

    fun saveLogin(login: String) {
        preference.edit().putString(LOGIN, login).apply()
    }

    fun getLogin(): String? {
        return preference.getString(LOGIN, "")
    }

    fun saveName(name: String) {
        preference.edit().putString(NAME, name).apply()
    }

    fun getName(): String? {
        return preference.getString(NAME, "")
    }

    fun saveSecondName(secondName: String) {
        preference.edit().putString(SECOND_NAME, secondName).apply()
    }

    fun getSecondName(): String? {
        return preference.getString(SECOND_NAME, "")
    }

    fun savePass(pass: String) {
        preference.edit().putString(PASS, pass).apply()
    }

    fun getPass(): String? {
        return preference.getString(PASS, "")
    }

    fun saveCountry(country: String) {
        preference.edit().putString(COUNTRY, country).apply()
    }

    fun getCountry(): String? {
        return preference.getString(COUNTRY, "")
    }
}