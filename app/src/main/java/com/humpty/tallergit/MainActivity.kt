package com.humpty.tallergit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.humpty.tallergit.ui.theme.Blue
import com.humpty.tallergit.ui.theme.TallerGitTheme

class MainActivity : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
        presentacion()
    }
}
}

@Preview(showBackground = true,
showSystemUi = true)
@Composable
fun presentacion() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp),

    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Imagen perfil
            Image(
                painter = painterResource(id = R.drawable.person),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(3.dp, Color(0xFF2F80ED), CircleShape)
            )

            Text(
                text = "Sebastián Suárez",
                fontSize = 28.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 20.dp)
            )

            Text(
                text = "Desarrollador Móvil Jr.",
                fontSize = 16.sp,
                color = Color(0xFF2F80ED)
            )
        }

        HorizontalDivider(
            thickness = 1.dp,
            color = Color.Gray,
            modifier = Modifier.padding(5.dp,20.dp)
        )

        Text(
            text = "Edad",
            fontSize = 22.sp,
            color = Color.Gray
        )
        Text(
            text = "20 años",
            fontSize = 18.sp,
            color = Color.Black
        )
        Text(
            text = "Correo",
            fontSize = 22.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 10.dp)
        )
        Text(
            text = "[jsuarez219@unab.edu.co]",
            color = Color.Blue,
            fontSize = 18.sp,
        )
        Text(
            text = "Ciudad",
            fontSize = 22.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 10.dp)
        )
        Text(
            text = "Bucaramanga, Colombia",
            fontSize = 18.sp,
            color = Color.Black
        )
        Text(
            text = "Celular",
            fontSize = 22.sp,
            color = Color.Gray,
        )

        HorizontalDivider(
            thickness = 1.dp,
            color = Color.Gray,
            modifier = Modifier.padding(25.dp,25.dp,25.dp,15.dp)
        )
        Text(
            text = "SOBRE MI MATERIA FAVORITA",
            fontSize = 20.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )
        Text(
            text = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos. ",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp, bottom = 10.dp)
        )

        Text(
            text = "CONTÁCTAME",
            fontSize = 20.sp,
            color = Color.Gray
        )
        Text(
            text = "Hola"
        )
        // Botón abajo
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
            containerColor = Blue,   // Color del botón
            contentColor = Color.White           // Color del texto
        )
        ) {
            Text("Contactar conmigo", fontSize = 22.sp)
        }
    }
}

