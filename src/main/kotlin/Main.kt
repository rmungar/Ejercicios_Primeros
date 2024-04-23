import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import javax.swing.Box

@Composable
@Preview
fun EJ1() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            Modifier
                .wrapContentSize()
                .size(40.dp)
                .background(Color.Cyan)
        )
    }
}
@Composable
@Preview
fun EJ2(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        contentAlignment = Alignment.Center

    ) {
        Box(
            Modifier
                .wrapContentSize()
                .size(300.dp, 200.dp)
                .background(Color.Cyan)

        ){
            Text("Ejemplo de box con texto",
                Modifier
                    .align(Alignment.BottomCenter)
                    .padding(20.dp))
        }
    }
}

@Composable
@Preview
fun EJ3(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 200.dp)
    ){
        Box(modifier = Modifier
            .size(60.dp, 150.dp)
            .background(color = Color.Red)

        ){
            Text("Ejemplo1")
        }
        Box(modifier = Modifier
            .size(60.dp, 320.dp)
            .background(color = Color.Gray)
        ){
            Text("Ejemplo2")
        }
        Box(modifier = Modifier
            .size(60.dp, 320.dp)
            .background(color = Color.Cyan)
        ){
            Text("Ejemplo3")
        }
        Box(modifier = Modifier
            .size(60.dp, 150.dp)
            .background(color = Color.Green)
        ){
            Text("Ejemplo4")
        }

    }
}

@Composable
@Preview
fun EJ4(){  //No termino de entender el padding de los box
    Row(
        modifier = Modifier
            .absolutePadding(20.dp)
            .fillMaxSize()
            .padding(20.dp, 0.dp),
        verticalAlignment = Alignment.Bottom

    ){
        Box( modifier = Modifier
            .border(5.dp, Color.Red)
            .padding(20.dp)
            .height(180.dp),
        ){
            Text("Ejemplo1")
        }
        Box( modifier = Modifier
            .border(5.dp, Color.Blue)
            .padding(20.dp)
            .height(120.dp)

        ){
            Text("Ejemplo2")
        }
        Box( modifier = Modifier
            .border(5.dp, Color.Red)
            .padding(20.dp)
            .height(60.dp)
        ){
            Text("Ejemplo3")
        }
        Box( modifier = Modifier
            .border(5.dp, Color.Blue)
            .padding(20.dp)
            .height(20.dp)
        ){
            Text("Ejemplo4")
        }
    }
}

@Composable
@Preview
fun EJ5() {
    Column {
        Box(
            modifier = Modifier
                .height(200.dp)
                .background(color = Color.Cyan)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text("BOX1")
        }
        EJ7(50F)
        Box(
            modifier = Modifier
                .height(200.dp)
                .background(color = Color.Gray)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text("BOX2")

        }
        EJ7(80F)
        Box(
            modifier = Modifier
                .height(200.dp)
                .background(color = Color.Green)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text("BOX3")
        }
        EJ7(20F)
        Box(
            modifier = Modifier
                .height(200.dp)
                .background(color = Color.Magenta)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text("BOX4")

        }
    }
}

@Composable
@Preview
fun EJ6(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .height(310.dp)
        ){
            Text(text = "Ejercicio 6 ",
                Modifier
                    .align(Alignment.TopCenter)
                    .padding(10.dp)
                    .border(5.dp, Color.Black)
                    .background(Color.Yellow),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,

            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(310.dp)
        ){
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
                ,
                contentAlignment = Alignment.BottomCenter
            ){
                Text(
                    text = "PMDM",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 33.sp
                )
            }
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight()
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "DAM 2",
                    fontSize = 33.sp
                )
            }
        }
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(310.dp)
                .padding(10.dp)
        ){
            Text(
                text = "...Combinando Column y Box",
                color = Color.Yellow,
                fontSize = 13.sp,
            )
        }
    }
}

@Composable
fun EJ7(espacio: Float): Unit{
    val espacioGenerado = Box(
        modifier = Modifier
            .fillMaxWidth()
            .size(espacio.dp)
    )
    return espacioGenerado

}
fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        EJ4()
    }
}
