package br.senai.sp.jandira.ppdm_school.screens.components

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CaretScope
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R

@Composable
fun CursosCard() {
        Card(
            modifier = Modifier
                .height(270.dp)
                .fillMaxWidth(),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color.Blue
                ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Row (
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = stringResource
                        (
                    R.string.curso1
                ),
                    fontSize = 68.sp,
                    fontWeight = FontWeight.Bold,
                    color = (Color(0xFFF6BF4D))
                    )

            }
        }
}

@Preview
@Composable
private fun CursosCardpreview(){
    CursosCard()
}