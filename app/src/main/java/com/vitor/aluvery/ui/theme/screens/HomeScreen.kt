package com.vitor.aluvery.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vitor.aluvery.data.simpleProduct
import com.vitor.aluvery.ui.theme.AluveryTheme
import com.vitor.aluvery.ui.theme.components.ProductSection

@Composable
fun HomeScreen() {
    AluveryTheme {
        Column(Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)

        ) {
            Spacer(Modifier)
            ProductSection("Sales", products = simpleProduct)
            ProductSection("Sweet", products = simpleProduct)
            ProductSection("Drinks", products = simpleProduct)
            Spacer(Modifier)
        }
    }
}
