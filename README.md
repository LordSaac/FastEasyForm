<p align="center"><img src="https://github.com/LordSaac/FastEasyForm/blob/master/background_easy_form.png"></p>

Fast & Easy Form: is a builder forms for your Android project, with this library you will can build forms more fast and easy, using a clear structure for implement in your proyect. This solution offer a different tools like: validations, get data, update data and events listeners.

<p align="center">

<p align="center">
<a href="https://github.com/LordSaac/FastEasyForm"><img src="https://github.com/TheJuki/KFormMaster/workflows/Build/badge.svg?branch=master" alt="Build status" /></a>
<a href="https://github.com/LordSaac/FastEasyForm"><img src="https://codecov.io/gh/TheJuki/KFormMaster/branch/master/graph/badge.svg" alt="codecov" /></a>
  <a href="https://github.com/LordSaac/FastEasyForm"><img src="https://img.shields.io/badge/Android%20Arsenal-Fast%20%26%20Easy%20Form-brightgreen.svg?style=flat" alt="codecov" /></a>
<a href="https://github.com/LordSaac/FastEasyForm"><img alt="codebeat badge" src="https://codebeat.co/badges/43fca492-2564-4401-8f4b-91d3bc811d70" /></a>
<a href="https://github.com/LordSaac/FastEasyForm"><img src="https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat" alt="API" /></a>
<a href="https://github.com/LordSaac/FastEasyForm"><img src="https://maven-badges.herokuapp.com/maven-central/com.github.thejuki/k-form-master/badge.svg" alt="Maven Central" /></a>
</p>

## Examples
| [DARK MODE ON](https://github.com/LordSaac/FastEasyForm/blob/master/app/src/main/java/com/creativity/dev/formsimpleigb/MainActivity.kt) | [Menu Screen](https://github.com/LordSaac/FastEasyForm/blob/master/app/src/main/java/com/creativity/dev/formsimpleigb/MainActivity.kt) | [Input](https://github.com/LordSaac/FastEasyForm/blob/master/app/src/main/java/com/creativity/dev/formsimpleigb/MainActivity.kt) |
| --- | --- | --- |
![Example](https://github.com/LordSaac/FastEasyForm/blob/master/easy_form_video.gif) | ![Example](https://github.com/LordSaac/FastEasyForm/blob/master/recording_2.gif) | ![Example](https://github.com/LordSaac/FastEasyForm/blob/master/recording_98.gif) |


## Features


- [x] Reduce development time for forms
- [x] Create simple and user-friendly forms
- [x] Implement row-level validation for the form fields
- [x] Ability to update rows/data within the form
- [x] Retrieve data based on a unique identifier
- [x] Implement interactive listeners for form elements
- [x] Scroll view form
- [x] Customize text colors
- [x] Customize icons
- [x] Change size text
- [x] Support for Jetpack Compose
- [x] Support Dark Mode
- [x] Use Java 11

## Requirements

Fast & Easy Form is written in Kotlin & Java and compatible with min Sdk version 26 and min version Java 11. This library is only compatible with phones.

## Installation

### Settings Gradle

Fast & Easy Form is available through [Github](github.com). To install
it, simply add the following line to your settings gradle:

```gradle

allprojects {
    repositories {

       maven { url 'https://jitpack.io' }

    }
}
```


### Dependencie

For [dependencie version](https://github.com/LordSaac/FormSimpleIGB/packages/), add the following to your `gradle`:

```gradle

 compileOptions {
        sourceCompatibility JavaVersion.VERSION_11
        targetCompatibility JavaVersion.VERSION_11
 }

kotlinOptions {
        jvmTarget = '11'
 }

dependencies {

     implementation 'com.github.LordSaac:FastEasyForm:v2.0.1'

}
```

## Getting Started

###  Example MainActivity

For classic class activity follow the next code example.

```kotlin

class MainActivity : AppCompatActivity(), FormsListenerIGB {

    private lateinit var rv_main: RecyclerView // Add RecyclerView into xml

    private lateinit var easyForm: EasyForm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.rv_main = findViewById(R.id.rv_main)

        this.init()

    }

    private fun init(){

 this.easyForm = BuildForm(mContext = this) {

    mode = ThemeMode.DARK 

    container = this.rv_main  

    body { 

        section { 

            title = "My Section Number 1"
            description = "Here I put my first section."

            content { 

                Row(RType.TITLE) { 
                    setText.title = "Getting started"
                    setColor.title = R.color.colorPrimary_aar 
                }

                Row(RType.INFO) { 
                    setText.title = "Hello world!"
                    setColor.title = R.color.colorGray 
                }

            }

        }

    }

}


    }



    override fun actionFormResponse(result: ResponseFormsIGB) {



    }

}
```

### Example ComposeActivity

For projects JetPack Compose follow the next code example.

```kotlin
class ComposeActivity : ComponentActivity() {

    private val context = this

    private lateinit var easyForm: EasyForm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.easyForm = EasyForm(this)

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

```
#### Composable

Config the composable code into activity or preview screen.

```kotlin

@Composable
fun ComposeScreen(context:Context,customForm: EasyForm) {

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

```



# Full Example project

If you want check the the code project, you can check click <a href="https://github.com/LordSaac/FastEasyForm/tree/master/app/src/main/java/com/creativity/dev/formsimpleigb" title="Hobbit lifestyles">HERE</a> or check <a href="https://github.com/LordSaac/FastEasyForm/wiki" title="Hobbit lifestyles">FULL DOCUMENTATION.</a>

# Contribution

Thank you for use this library on your project, with you collaboration this project could grow more with improvements and new idea. This project don't have support but you are most welcome to contribute.

<div align="center">

  <figure align="center">
      <a href="https://paypal.me/LordSaac?locale.x=es_XC">
    <img src="https://github.com/LordSaac/FastEasyForm/blob/master/Paypal_2014_logo.png" alt="Sunset Landscape" title="Sunset Landscape" width="100" height="100" />
      </a>
  </figure>

  <figure>
          <a href="https://github.com/LordSaac/FastEasyForm">
    <img src="https://github.com/LordSaac/FastEasyForm/blob/master/68747470733a2f2f6769746875622e626c6f672f77702d636f6e74656e742f75706c6f6164732f323032302f30392f6769746875622d73746172732d6c6f676f5f436f6c6f722e706e67.png" alt="Mountain View" title="Mountain View" width="100" height="100" />
      </a>
  </figure>

</div>

# Licence

Copyright 2024 José I. Gutiérrez B.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

