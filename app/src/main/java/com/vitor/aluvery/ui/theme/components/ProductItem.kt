package com.vitor.aluvery.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vitor.aluvery.model.Product
import com.vitor.aluvery.ui.theme.Purple500
import com.vitor.aluvery.ui.theme.Teal200
import com.vitor.aluvery.utils.toConvertToCurrencyCountry

@Composable
fun ProductItem(product: Product) {
    Surface(shape = RoundedCornerShape(15.dp), elevation = 4.dp) {
        Column(Modifier
            .heightIn(250.dp, 300.dp)
            .width(200.dp)

        ) {
            val imageSize = 50.dp
            Box(modifier = Modifier
                .height(100.dp)
                .background(brush = Brush.horizontalGradient(colors = listOf(Purple500, Teal200)))
                .fillMaxWidth()) {
                Image(painter = painterResource(id = product.image),
                    contentDescription = "product image",
                    Modifier
                        .size(100.dp)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(Alignment.BottomCenter))
            }

            Spacer(modifier = Modifier.height(imageSize / 2))

            Column(Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 16.dp)) {

                Text(text = product.name,
                    modifier = Modifier.fillMaxWidth(),
                    fontWeight = FontWeight(700),
                    fontSize = 18.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis)

                Text(text = product.price.toConvertToCurrencyCountry("pt", "br"),
                    modifier = Modifier.fillMaxWidth(),
                    fontWeight = FontWeight(400),
                    fontSize = 14.sp)
            }

        }
    }
}
