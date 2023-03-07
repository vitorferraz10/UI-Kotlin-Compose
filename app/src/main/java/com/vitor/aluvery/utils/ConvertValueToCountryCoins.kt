package com.vitor.aluvery.utils

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.*

fun BigDecimal.toConvertToCurrencyCountry(language: String, country: String): String {
    return NumberFormat
        .getCurrencyInstance(Locale(language,  country)).format(this)
}
