package com.creativity.dev.formsimpleigb

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.InputType
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.Section
import com.creativity.dev.formsimple.compose.EasyFormCompose

import com.creativity.dev.formsimple.types.ROW_CALENDAR
import com.creativity.dev.formsimple.types.ROW_CHECK
import com.creativity.dev.formsimple.types.ROW_EDIT
import com.creativity.dev.formsimple.types.ROW_INFO

import com.creativity.dev.formsimple.types.ROW_TITLE
import com.creativity.dev.formsimple.types.RType
import com.creativity.dev.formsimple.types.uiMode
import com.creativity.dev.formsimpleigb.ui.theme.FormSimpleIGBTheme
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyFastForm


class ComposeActivity : ComponentActivity() {

    private val context = this

    private lateinit var easyForm: EasyFastForm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.easyForm = EasyFastForm(this)

        setContent {
            FormSimpleIGBTheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ComposeScreen(context,easyForm)

                }
            }
        }
    }

}

@Composable
fun ComposeScreen(context:Context,customForm: EasyFastForm) {

    EasyFormCompose(
        customForm = customForm,
        modifier = Modifier.fillMaxWidth(),
        mode = uiMode.dark,
        body = {

            Section {

                title = "Configuration Settings"

                description = "Config your configuration setting"

                Content {

                    Row(RType.ACTION) {
                        tag = "FRECUENCIA_VISITA"
                        setText.title = "Sounds & Others"
                        setText.descriptionBottom = "Configuration your sounds & rintongs settings"
                        setText.bubble = "1"
                        setImage.iconLeft = R.drawable.sound_color
                        setText.titleToolbar = "Atras"
                        setSize.title = 14f

                        onClick {




                        }


                    }

                    Row(RType.ACTION) {

                        tag = "GAME_SETTING"
                        setText.title = "Game Setting"
                        setText.descriptionBottom = "Configuration your games settings"
                        setImage.iconLeft = R.drawable.controler_color
                        setSize.title = 14f

                        onClick {




                        }

                    }

                    Row(RType.ACTION) {
                        tag = "FRECUENCIA_VISITA"
                        setText.title = "Notifications"
                        setText.descriptionBottom = "Configuration your favorite ringtone settings"
                        setImage.iconLeft = R.drawable.bell_color
                        setSize.title = 14f

                        onClick {

                        }
                    }

                }

            }

        }
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FormSimpleIGBTheme {

        val context = LocalContext.current
        val easyForm: EasyFastForm = EasyFastForm(context)

        ComposeScreen(context,easyForm)

    }
}