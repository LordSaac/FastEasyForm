package com.creativity.dev.formsimple.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.compose.ui.theme.FormSimpleIGBTheme
import com.creativity.dev.formsimple.types.ROW_TITLE
import com.example.dreamteach.listselectdinamic.IGBDynamicList.start

class EaseFormComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}

@Composable
fun ComposeScreen() {

    val customLayoutWrapper = EasyFormWrapper(LocalContext.current)

    Column {
        // Use your custom functions
        customLayoutWrapper.rv().start()

        // Embed the custom XML layout in the Compose UI
        AndroidView(
            factory = {  customLayoutWrapper.view() }
        )
    }

}

