
package com.truelines.i18n

/**
 * I18n management
 */
object I18n {

    val unknownText = "unknown"

    val textMappingByLang = mutableMapOf<Lang,Map<String, String>>()

    init {
        textMappingByLang.put(Lang.ENGLISH, mapOf<String,String>())

        textMappingByLang.put(Lang.FRENCH, mapOf<String,String>())
    }

    fun getText(lang: Lang, key: String, vararg args: String): String {
        val i18nText = textMappingByLang.get(lang)?.get(key) ?: return unknownText
        return i18nText.format(*args)
    }

    fun String.format(vararg args: String): String {
        var result = this
        if (args.isNotEmpty()) {
            args.forEach {
                result = result.replaceFirst("%s", it)
            }
        }
        return result
    }
}