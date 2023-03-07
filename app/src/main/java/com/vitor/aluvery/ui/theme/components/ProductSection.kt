package com.vitor.aluvery.ui.theme.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vitor.aluvery.R
import com.vitor.aluvery.model.Product
import java.math.BigDecimal

@Composable
fun ProductSection(titleSection: String, products: List<Product>) {
    Column(modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = titleSection, fontSize = 20.sp, fontWeight = FontWeight(400))
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {

           products.forEach { p ->
               ProductItem(Product(name = p.name,
                    price = p.price,
                    image = p.image))
            }
        }
    }
}

