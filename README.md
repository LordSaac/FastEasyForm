# Fast & Easy Forms 

Fast & Easy Form: is a builder forms for your Android project, with this library you will can build forms more fast and easy, using a clear structure for implement in your proyect. This solution offer a different tools like: validations, get data, update data and events listeners.

<p align="center">

|Int Top|In Bottom|
|:----:|:----:|
|<img  height="568" width="320" src="https://github.com/LordSaac/FormSimpleIGB/blob/master/Media/Screenshot_20181224-103520.png">|<img  height="568" width="320" src="https://github.com/LordSaac/FormSimpleIGB/blob/master/Media/Screenshot_20181224-103524.png">|
</p>

<!-- TOC -->

- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
  - [Settings Gradle](#settings-gradle)
  - [Dependencie](#dependencie)
- [Getting Started](#getting-started)
  - [Add a floating panel as a child view controller](#add-a-floating-panel-as-a-child-view-controller)
  - [Present a floating panel as a modality](#present-a-floating-panel-as-a-modality)

<!-- /TOC -->

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
- [x] Use Java 11

## Requirements

Fast & Easy Form is written in Kotlin & Java and compatible with min Sdk version 26 and min version Java 11

## Installation

### Settings Gradle

Fast & Easy Form is available through [Github](github.com). To install
it, simply add the following line to your settings gradle:

```gradle
allprojects {
    repositories {

        mavenLocal()

    }
}
```

### Dependencie

For [dependencie version](https://github.com/LordSaac/FormSimpleIGB/packages/), add the following to your `gradle`:

```gradle
implementation 'com.form.jigb:formsimple:v0.3.3'
```

## Getting Started

### Config in your class MainActivity.kt

For classic class activity follow the next code example.

```kotlin
class MainActivity : AppCompatActivity(), FormsListenerIGB {

    private lateinit var rv_main: RecyclerView // Add RecyclerView into xml

    private lateinit var easyForm: EasyForm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.easyForm = EasyForm(this)

        this.rv_main = findViewById(R.id.rv_main)

        this.init()

    }

    private fun init(){

    /* Build here */

        Row(ROW_TITLE) {

            setText.title = "Getting started"

            setColor.title = R.color.colorPrimary_aar
        }

        Row(ROW_INFO) {

            setText.title = "Hello word!"

            setColor.title = R.color.colorGray

        }


        easyForm.start(rv_main)

    }



    override fun actionFormResponse(result: ResponseFormsIGB) {



    }

}
```

### Config in your class ComposeActivity.kt

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
        rows = {

            Row(ROW_TITLE) { // <--- Add Title

                setText.title = "Easy Form" //<--- add your title name
                setColor.title = ContextCompat.getColor(
                    context,
                    R.color.colorPrimaryDark
                ) // <--- Add any colors for title

            }

            Row(ROW_EDIT) {

                setText.title = "Email"// title row.
                inputTypeEditText = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS //  To choose type EDITTEXT (https://developer.android.com/reference/android/widget/EditText)

            }

            Row(ROW_EDIT) {
                setText.title = "Full name" // Add only text, but the text edit type is default
            }

            Row(ROW_EDIT) {

                setText.title = "Address" // Add only text, but the text edit type is default
                ///  emptyMessages = "Please insert lastname"
                validation = true  // Add it is you want validate this row

            }

            Row(ROW_EDIT){

                setText.title = "Cell Phone"// title row.
                inputTypeEditText = InputType.TYPE_CLASS_PHONE //  To choose type EDITTEXT (https://developer.android.com/reference/android/widget/EditText)
            }

        }

    )

}

```

## Methods:

| Functions       | Descriptions                                       | Code      |
|-----------------|---------------------------------------------------|-------------|
| start           | Starts generating the form in the user interface. |     ``` easyForm.start(your_reciclerview)     ```        |
| validateAll     |Valid all fields of the form.           |       ``` easyForm.tool.validateAll()   ```        |
| validateByTag   | Validates a specific field identified by a label. |   ``` easyForm.tool.validateByTag("Tag Id")   ```            |
| getResultByTag  | Gets the result of a specific field by its label. | ``` easyForm.tool.getResultByTag("Tag Id")   ```           |
| getResult       | Gets the overall result of the form.        |  ``` easyForm.tool.getResultAll()   ```            |
| updateRow       | Updates a row or section of the form.       |  ``` easyForm.tool.updateRow("Tag Id",ResponseFormsIGB())   ```              |
| eventChecked    | Handles item verification or selection events. | ``` easyForm.tool.eventChecked(false,0)  ```          |


# Contribution

You are most welcome to contribute to this project!

*  Buy me a  [Coffee](https://paypal.me/LordSaac?locale.x=es_XC)  &nbsp; :coffee:

*  Give me a [Star](https://github.com/LordSaac/FormSimpleIGB) &nbsp; :star: 


## Licence

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

