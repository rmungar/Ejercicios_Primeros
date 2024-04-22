import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun Box1() {
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
fun Box2(){
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
            Text("Ejemplo de box con texto", Modifier.align(Alignment.BottomCenter))
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Box2()
    }
}
