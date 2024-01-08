# Fast & Easy Forms 

Fast & Easy Form: is a builder forms for your Android project, with this library you will can build forms more fast and easy, using a clear structure for implement in your proyect. This solution offer a different tools like: validations, get data, update data and events listeners.

<p align="center">

|||
|:----:|:----:|
|<img  height="568" width="320" src="https://github.com/LordSaac/FastEasyForm/blob/master/Project_Example/Screenshot_20231214_134359.png">|<img  height="568" width="320" src="https://github.com/LordSaac/FastEasyForm/blob/master/Project_Example/Screen_recording_20231214_205436.gif">|
</p>

<!-- TOC -->

- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
  - [Settings Gradle](#settings-gradle)
  - [Dependencie](#dependencie)
- [Getting Started](#getting-started)
  - [Example MainActivity](#example-mainactivity)
  - [Example ComposeActivity](#example-composeactivity)
    - [Composable](#composable)
- [Documentation](#documentation)
  - [Functions](#functions)
     - [General parameters](#description-of-general-parameters)
  - [Rows description](#rows-description)
    - [TITLE](#row_title)
    - [ACTIVITY](#row_activity)
    - [MULTIPLE_CHECK_LIST](#row_multiple_check_list)
    - [CHECK](#row_check)
    - [EDIT](#row_edit)
    - [SINGLE_CHECK_LIST](#row_single_check_list)
    - [CALENDAR_HOUR](#row_calendar_hour)
    - [CALENDAR](#row_calendar)
    - [INFO](#row_info)
    - [ON_CLICK](#row_on_click)
  - [Parameters and compatibility per row](#parameters-and-compatibility-per-row)
    - [SetText](#description-of-categorized-parameters-used-for-settext)
    - [Lists](#description-of-categorized-parameters-for-lists)
    - [EditText](#description-of-categorized-parameters-for-edittext)
    - [Animations](#description-of-categorized-parameters-for-animations)
    - [Colors](#description-of-categorized-parameters-for-colors)
    - [Size](#description-of-categorized-parameters-for-size)
    - [Padding](#description-of-categorized-parameters-for-padding)
    - [Margin](#description-of-categorized-parameters-for-margin)
    - [Alignment](#description-of-categorized-parameters-for-alignment)
    - [Visibility](#description-of-categorized-parameters-for-visibility)
    - [setting](#description-of-categorized-parameters-for-setting)

- [Example project](#example-project)
- [Contribution](#contribution)
- [Licence](#licence)
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

 implementation 'com.github.xprojects-K:FastEasyForm_Android:v1.1.0'

}
```

## Getting Started

###  Imports into class

Copy and paste this imports in the top on the activity class.

```kotlin

import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.option
import com.creativity.dev.formsimple.types.*
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyForm

```

###  Example MainActivity

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
        rows = {

         
        Row(ROW_TITLE) {

            setText.title = "Getting started"

            setColor.title = R.color.colorPrimary_aar
        }

        Row(ROW_INFO) {

            setText.title = "Hello word!"

            setColor.title = R.color.colorGray

        }
   
         
        }

    )

}

```

## Documentation

### Functions

| Functions       | Descriptions                                       | Code      |
|-----------------|---------------------------------------------------|-------------|
| start           | Starts generating the form in the user interface. |     ``` easyForm.start(your_reciclerview)     ```        |
| validateAll     |Valid all fields of the form.           |       ``` easyForm.tool.validateAll()   ```        |
| validateByTag   | Validates a specific field identified by a label. |   ``` easyForm.tool.validateByTag("Tag Id")   ```            |
| getResultByTag  | Gets the result of a specific field by its label. | ``` easyForm.tool.getResultByTag("Tag Id")   ```           |
| getResult       | Gets the overall result of the form.        |  ``` easyForm.tool.getResultAll()   ```            |
| updateRow       | Updates a row or section of the form.       |  ``` easyForm.tool.updateRow("Tag Id",ResponseFormsIGB())   ```              |
| eventChecked    | Handles item verification or selection events. | ``` easyForm.tool.eventChecked(false,0)  ```          |

### Rows description

#### ROW_TITLE

It is a property to invoke rows within the form to declare the section's title below it. 

##### Example code

```kotlin

  Row(ROW_TITLE) { // <--- Add Title

            setText.title = "Getting started" //<--- add your title name

            setColor.title = R.color.colorPrimary_aar
        }

```

#### ROW_ACTIVITY

It's a row that functions to make direct calls to other windows within the project. It is fully configurable and easy to use.

##### Example code

```kotlin

   Row(ROW_ACTIVITY){ // <-- Here Call Any activity
            title = "Test Activity #1"//<-- title .
            activity = ExampleActivity::class.java // <-- Add your activity
        }

```

#### ROW_MULTIPLE_CHECK_LIST

This functionality allows selecting more than one option, making it great for multiple-choice questionnaires.


##### Example code

```kotlin

   Row(ROW_MULTIPLE_CHECK_LIST){

                tag = "002"
                setText.title = "Favorite Fruit"


                checkList{

                    option(){
                        text = "Banana"

                    }

                    option(){
                        text = "Apple"
                    }

                    option(){
                        text = "Peach"
                    }

                    option(){
                        text = "Papaya"

                    }

                }

                validation = true

            }


```

#### ROW_CHECK

Specifically for rows needing quick validation, like accepting terms or specific questions.

##### Example code

```kotlin

     Row(ROW_CHECK){

                setText.text= "Are you like you job?" // Add text for the text
                tag = "0012" //tag for identification of the row
                checked = true // Initialize check in false or true

            }

```

#### ROW_EDIT

For rows requiring various text editions, such as numbers, phones, emails, etc.

##### Example code

```kotlin

      Row(ROW_EDIT){

                setText.title = "Cell Phone"// title row.
                inputTypeEditText = InputType.TYPE_CLASS_PHONE //  To choose type EDITTEXT (https://developer.android.com/reference/android/widget/EditText)
            }

```

#### ROW_SINGLE_CHECK_LIST

Enables choosing a single option from several available choices.

##### Example code

```kotlin

       Row(ROW_SINGLE_CHECK_LIST){

                tag = "007"
                setText.title = "Favorite Movie"
                setting.rowSingleCheck.activeIconSuccess = true

                checkList{

                    option(){
                        text = "Action"

                    }

                    option(){
                        text = "Drama"
                    }

                    option(){
                        text = "Comedy"
                    }

                    option(){
                        text = "Fantasy"

                    }

                }

                validation = true

            }

```

#### ROW_CALENDAR_HOUR

Simplifies time insertion, allowing hour insertions without manual programming.

##### Example code

```kotlin

     Row(ROW_CALENDAR_HOUR){

                setText.title = "Start hour"
                validation = true

            }

```

#### ROW_CALENDAR

Assists in entering specific dates, like the date of birth. Simplifies custom calendar programming for forms.

##### Example code

```kotlin

         Row(ROW_CALENDAR){
                
                setText.title = "Birthday"
                validation = true

            }

```

#### ROW_ON_CLICK

Use this row for a button actions for config any action.

##### Example code

```kotlin

       Row(ROW_ON_CLICK){

                setText.title = "Click me!"

                onClick {

                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Hello")
                        .setMessage("I'm here")
                        .setPositiveButton("OK") { dialog, _ ->
                            // Do something when OK button is clicked
                            dialog.dismiss()
                        }
                        .setNegativeButton("Cancel") { dialog, _ ->
                            // Do something when Cancel button is clicked
                            dialog.dismiss()
                        }
                        .show()

                }

            }

```

#### ROW_INFO

Primarily used to display information without offering special functionalities.

##### Example code

```kotlin

    Row(ROW_INFO){
            setText.title = "Licence"// title row.
            setText.text= "Copyright 2024 José I. Gutiérrez B."
        }

```


### Parameters and compatibility per row

#### Description of general parameters

| Parameter         | Row compatibility       | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| tag               | ALL                   | Assigns a unique identifier.                                         |
| Activity          | ROW_ACTIVITY          | Used to invoke the desired activity.                                 |
| bundleActivity    | ROW_ACTIVITY          | Used to send information between activities.                         |
| checked           | ALL                   | Declares that the field in this row needs validation before processing. |
| isAvailable       | ROW_EDIT              | Specifies if the displayed data is enabled for editing.             |
| isSingleList      | ROW_SINGLE_CHECK_LIST | Notifies the list that the selection will be one-to-many.            |
| setDateFormat     | ROW_CALENDAR, ROW_CALENDAR_HOUR | Sets the desired date format for display.                   |
| maxLength         | ROW_EDIT              | Sets the maximum number of characters the user can input.           |
| inputTypedEditText| ROW_EDIT              | Configures the keyboard type for data capture.                      |
| gravityTitle      | ALL                   | Adjusts the position of the title.                                   |
| universalContentGravity | ALL              | Adjusts the position of the container confirming the entire row's body. |
| isEndableImageSelected | ROW_SINGLE_CHECK_LIST | Enables or disables checkboxes.                                   |
| TypeRow           | ALL                   | Assigns the type of row to be built.                                 |

#### Description of categorized parameters used for SetText

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| title             | ALL                   | Assigns text for the title.                                          |
| text              | ALL                   | Assigns a description below the title.                               |
| edtHint           | ROW_EDIT              | Displays informative text inside the edit field.                    |
| comment           | ROW_EDIT              | Adds special comments within the row.                                |
| icon              | ALL                   | Used to assign icons using Font Awesome codes.                       |
| emptyMessages     | ALL                   | Displays informative text indicating that this field must be filled.|

#### Description of categorized parameters for Lists

| Parameter         | Row compatibility               | Description                                                         |
|-------------------|------------------------------|---------------------------------------------------------------------|
| options           | ROW_SINGLE_CHECK_LIST, ROW_MULTIPLE_CHECK_LIST | Assigns special lists to choose from one or many options, depending on the list type. |
| arrayDates        | ROW_CALENDAR                | Assigns a special list of dates to delimit dates between weeks.     |

#### Description of categorized parameters for EditText

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| isEditable        | ROW_EDIT              | Sets whether the data can be edited by the user.                    |

#### Description of categorized parameters for Setting

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| rowSingleCheck.activeIconSuccess        | ROW_SINGLE_CHECK_LIST              |  When user selected a options will appear icon success.                    |
| rowMultipleCheck.activeIconSuccess        | ROW_MULTIPLE_CHECK_LIST              | When user selected a options will appear icon success.                    |

#### Description of categorized parameters for Animations

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| intentEnter       | ROW_ACTIVITY          | Assigns an animation for opening an activity.                       |
| intentExit        | ROW_ACTIVITY          | Assigns an animation for closing an activity.                       |

#### Description of categorized parameters for Colors

| Parameter         | Row compatibility               | Description                                                         |
|-------------------|------------------------------|---------------------------------------------------------------------|
| title             | ALL                          | Sets the color for row titles.                                       |
| descriptions      | ALL                          | Sets the color for row descriptions.                                 |
| icons             | ALL                          | Sets the color for row icons.                                        |
| separator         | ALL                          | Sets the color for lines separating rows.                           |
| circle            | ALL                          | Not enabled at the moment.                                           |
| letter            | ALL                          | Sets the color for row titles.                                       |
| edit              | ALL                          | Sets the color for text editing titles of a row.                     |
| editStyle         | ALL                          | Not enabled at the moment.                                           |
| titleToolbar      | ALL                          | Sets the color for toolbar component titles.                         |
| backgroundToolbar | ALL                          | Sets the color for the background of the row container.             |
| styleContentHour  | ROW_CALENDAR, ROW_CALENDAR_HOUR | Sets the color for the background of the container for date or time assignment activities. |
| backgroundContent | ALL                          | Sets the color for the background of the row container.             |
| imageEmpty        | ALL                          | Sets the background color for image containers.                      |

#### Description of categorized parameters for Size

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| title             | ALL                   | Allows assigning the title size.                                    |
| description       | ALL                   | Allows assigning the description size.                              |
| letter            | ALL                   | Not enabled at the moment.                                           |
| edit              | ALL                   | Allows assigning the size of editable texts.                         |
| icon              | ALL                   | Allows assigning the size of icons.                                  |
| row               | ALL                   | Allows assigning the general size of the row.                         |

#### Description of categorized parameters for Padding

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| Content           | ALL                   | Sets spaces inside the entire container equally.                    |
| Content.top       | ALL                   | Sets spaces inside affecting the top part of the container.         |
| Content.bottom    | ALL                   | Sets spaces inside affecting the bottom part of the container.      |
| Content.left      | ALL                   | Sets spaces inside affecting the left part of the container.        |
| Content.right     | ALL                   | Sets spaces inside affecting the right part of the container.       |

#### Description of Categorized Parameters for Margin

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| content           | ALL                   | Sets spaces outside the entire container equally.                   |
| content.Top       | ALL                   | Sets spaces outside affecting the top part of the container.        |

#### Description of Categorized Parameters for Alignment

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| text              | ALL                   | Aligns text on different lines, either center, left, or right of the container. |
| description       | ALL                   | Aligns the description on different lines, either center, left, or right of the container. |

#### Description of categorized parameters for Visibility

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| title             | ALL                   | Controls the visibility of the title (Visible, Invisible, or Gone depending on the context). |
| description       | ALL                   | Controls the visibility of the description (Visible, Invisible, or Gone depending on the context). |
| icon              | ALL                   | Controls the visibility of the icon (Visible, Invisible, or Gone depending on the context). |
| check             | ALL                   | Controls the visibility of the checkbox (Visible, Invisible, or Gone depending on the context). |
| editText          | ALL                   | Controls the visibility of the editable text (Visible, Invisible, or Gone

# Example project

The project example is separate from the main project, if you want check the project, you can check click <a href="https://github.com/LordSaac/FastEasyForm/tree/master/Project_Example" title="Hobbit lifestyles">HERE.</a>

# Contribution

Thank you for use this library on your project, with you collaboration this project could grow more with improvements and new idea. This project don't have support but you are most welcome to contribute.

<div align="center">

  <figure align="center">
      <a href="https://paypal.me/LordSaac?locale.x=es_XC">
    <img src="https://github.com/LordSaac/FastEasyForm/blob/master/Project_Example/Paypal_2014_logo.png" alt="Sunset Landscape" title="Sunset Landscape" width="100" height="100" />
      </a>
  </figure>

  <figure>
          <a href="https://github.com/LordSaac/FastEasyForm">
    <img src="https://github.com/LordSaac/FastEasyForm/blob/master/Project_Example/github-stars-logo_Color.png" alt="Mountain View" title="Mountain View" width="100" height="100" />
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

