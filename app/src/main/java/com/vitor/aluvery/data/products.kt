package com.vitor.aluvery.data

import com.vitor.aluvery.R
import com.vitor.aluvery.model.Product
import java.math.BigDecimal

val simpleProduct = listOf(
    Product(
        name = "Pizza",
        price = BigDecimal("20.99"),
        image = R.drawable.ic_launcher_background
    ),
    Product(
        name = "Hamburger",
        price = BigDecimal("15.99"),
        image = R.drawable.ic_launcher_background
    ),
    Product(
        name = "Fries",
        price = BigDecimal("10.99"),
        image = R.drawable.ic_launcher_background
    ),
)