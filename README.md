<p align="center"><img src="https://github.com/LordSaac/FastEasyForm/blob/master/background_easy_form.png"></p>

Fast & Easy Form: is a builder forms for your Android project, with this library you will can build forms more fast and easy, using a clear structure for implement in your proyect. This solution offer a different tools like: validations, get data, update data and events listeners.

<p align="center">

<p align="center">
<a href="https://github.com/TheJuki/KFormMaster/actions"><img src="https://github.com/TheJuki/KFormMaster/workflows/Build/badge.svg?branch=master" alt="Build status" /></a>
<a href="https://codecov.io/gh/TheJuki/KFormMaster"><img src="https://codecov.io/gh/TheJuki/KFormMaster/branch/master/graph/badge.svg" alt="codecov" /></a>
<a href="https://codebeat.co/projects/github-com-thejuki-kformmaster-master"><img alt="codebeat badge" src="https://codebeat.co/badges/43fca492-2564-4401-8f4b-91d3bc811d70" /></a>
<a href="https://android-arsenal.com/api?level=19"><img src="https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat" alt="API" /></a>
<a href="https://maven-badges.herokuapp.com/maven-central/com.github.thejuki/k-form-master"><img src="https://maven-badges.herokuapp.com/maven-central/com.github.thejuki/k-form-master/badge.svg" alt="Maven Central" /></a>
</p>

## Examples
| [DARK MODE ON](https://github.com/LordSaac/FastEasyForm/blob/master/app/src/main/java/com/creativity/dev/formsimpleigb/MainActivity.kt) | [Menu Screen](https://github.com/LordSaac/FastEasyForm/blob/master/app/src/main/java/com/creativity/dev/formsimpleigb/MainActivity.kt) | [Input](https://github.com/LordSaac/FastEasyForm/blob/master/app/src/main/java/com/creativity/dev/formsimpleigb/MainActivity.kt) |
| --- | --- | --- |
![Example](https://github.com/LordSaac/FastEasyForm/blob/master/easy_form_video.gif) | ![Example](https://github.com/LordSaac/FastEasyForm/blob/master/recording_2.gif) | ![Example](https://github.com/LordSaac/FastEasyForm/blob/master/recording_98.gif) |

<!-- TOC -->
## Documentation

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
  - [Forms Structure](#forms-structure)
     - [Row Descriptions](#row-descriptions)
          - [TITLE](#title)
          - [ACTIVITY](#activity)
          - [MULTIPLE_CHECK_LIST](#multiple_check_list)
          - [CHECK](#check)
          - [EDIT](#edit)
          - [SINGLE_CHECK_LIST](#single_check_list)
          - [INFO](#info)
          - [ON_CLICK](#on_click)
          - [ACTION](#on_click)
          - [DATE_PICKER](#on_click)
          - [TIME_PICKER](#on_click)
          - [SWITCH](#on_click)
  - [Parameters and compatibility per row](#parameters-and-compatibility-per-row)
    - [SetText](#description-of-categorized-parameters-used-for-settext)
    - [Lists](#description-of-categorized-parameters-for-lists)
    - [EditText](#description-of-categorized-parameters-for-edittext)
    - [Animations](#description-of-categorized-parameters-for-animations)
    - [Colors](#description-of-categorized-parameters-for-set-colors)
    - [Date Picker](#description-of-categorized-parameters-for-set-date-picker)
    - [Time Picker](#description-of-categorized-parameters-for-set-time-picker)
    - [Validation](#description-of-categorized-parameters-for-setvalidation)
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

 implementation 'com.github.xprojects-K:FastEasyForm_Android:v1.1.0'

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

                Row(RowType.TITLE) { 
                    setText.title = "Getting started"
                    setColor.title = R.color.colorPrimary_aar 
                }

                Row(RowType.INFO) { 
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
| finishProgressView    | close action progress view when execurted a action. | ``` easyForm.tool.finishProgressView("YOUR_TAG_ID")  ```          |
| startProgressView    | start action progress view for execute an any action. | ``` easyForm.tool.startProgressView("YOUR_TAG_ID")  ```          |

### Forms Structure


This code sets up a form structure with sections and rows. It configures the theme mode, specifies a container, divides the form into sections, and defines the content within those sections. This structure provide a structured way to create forms with different elements and configurations.

```kotlin


var easyFastForm = BuildForm(mContext = this) {

    mode = uiMode.dark // Config theme with three options: LIGHT, DARK, & AUTO (System theme selected for the user).

    container = MyRecyclerView // Set your RecyclerView; this option is only used when using classic mode, not JetPack Compose.

    body { // Inside this option, you can set Rows or Sections, depending on your form's structure.

        section { // If you want to divide your form into sections, use this option

            title = "My Section Number 1"
            description = "Here I put my first section."

            content { // Inside this option, you can set your rows.

                row(RowType.INFO) {
                    title = "Developer"
                    text = "JIGB-K"
                }

            }

        }

    }

}


```
#### Row Descriptions

#### TITLE

It is a property to invoke rows within the form to declare the section's title below it. 

##### Example code

```kotlin

  Row(RType.TITLE) { // <--- Add Title

            setText.title = "Getting started" //<--- add your title name

            setColor.title = R.color.colorPrimary_aar
        }

```

#### ACTIVITY

It's a row that functions to make direct calls to other windows within the project. It is fully configurable and easy to use.

##### Example code

```kotlin

   Row(RType.ACTIVITY){ // <-- Here Call Any activity
            title = "Test Activity #1"//<-- title .
            activity = ExampleActivity::class.java // <-- Add your activity
        }

```

#### MULTIPLE_CHECK_LIST

This functionality allows selecting more than one option, making it great for multiple-choice questionnaires.


##### Example code

```kotlin

   Row(RType.MULTIPLE_CHECK_LIST){

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

#### CHECK

Specifically for rows needing quick validation, like accepting terms or specific questions.

##### Example code

```kotlin

     Row(RType.CHECK){

                setText.text= "Are you like you job?" // Add text for the text
                tag = "0012" //tag for identification of the row
                checked = true // Initialize check in false or true

            }

```

#### EDIT

For rows requiring various text editions, such as numbers, phones, emails, etc.

##### Example code

```kotlin

      Row(EDIT){

                setText.title = "Cell Phone"// title row.
                inputTypeEditText = InputType.TYPE_CLASS_PHONE //  To choose type EDITTEXT (https://developer.android.com/reference/android/widget/EditText)
            }

```

#### SINGLE_CHECK_LIST

Enables choosing a single option from several available choices.

##### Example code

```kotlin

       Row(RType.SINGLE_CHECK_LIST){

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

#### ON_CLICK

Use this row for a button actions for config any action.

##### Example code

```kotlin

       Row(RType.ON_CLICK){

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

#### INFO

Primarily used to display information without offering special functionalities.

##### Example code

```kotlin

    Row(RType.INFO){
            setText.title = "Licence"// title row.
            setText.text= "Copyright 2024 José I. Gutiérrez B."
        }

```

#### ACTION

This row is use for action like jump to another activity or execute fuction in your main activity.

##### Example code

```kotlin

    Row(RType.ACTION) {
                            tag = "FRECUENCIA_VISITA"
                            setText.title = "Sounds & Others"
                            setText.descriptionBottom = "Configuration your sounds & rintongs settings"
                            setText.bubble = "1"
                            setImage.iconLeft = R.drawable.sound_color
                            setText.titleToolbar = "Atras"
                            setSize.title = 14f

                            onClick {

                                // Your code Here

                            }

                        }

```

#### DATE_PICKER

This row is use for active the date picker native in Android.

##### Example code

```kotlin

   Row(RType.DATE_PICKER) {
                            tag = "Select Birthday"
                            setText.title = "Birthday"
                            setDatePicker.format = "dd/MM/yyyy"
                            setText.descriptionBottom = "12/01/2024"
                            setImage.iconLeft = R.drawable.calendar_color
                            setSize.title = 14f
                        }

```


#### TIME_PICKER

This row is use for active the time picker native in Android.

##### Example code

```kotlin

    Row(RType.TIME_PICKER) {
                            tag = "Select Time"
                            setText.title = "Check In"
                            setTimePicker.format = "hh:mm a"
                            setTimePicker.is24HourFormat = false
                            setImage.iconLeft = R.drawable.calendar_timer
                            setSize.title = 14f
                        }

```

#### SWITCH

This row is use for active the control swtich, you can personalize the the calor.

##### Example code

```kotlin

      Row(RType.SWITCH) {
                            setText.title = "Terms & Conditions"
                            setText.descriptionBottom = "Are you agree with our terms?"
                            setText.edtHint = "Insert your email"
                            setImage.iconLeft = R.drawable.contract_file
                            setSwitch.active = false
                            tag = "MY_TERMS"
                        }

```


### Parameters and compatibility per row

#### Description of general parameters

| Parameter         | Row compatibility       | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| tag               | ALL                   | Assigns a unique identifier.                                         |
| Activity          | ACTIVITY          | Used to invoke the desired activity.                                 |
| bundleActivity    | ACTIVITY          | Used to send information between activities.                         |
| checked           | ALL                   | Declares that the field in this row needs validation before processing. |
| isAvailable       | EDIT              | Specifies if the displayed data is enabled for editing.             |
| isSingleList      | SINGLE_CHECK_LIST | Notifies the list that the selection will be one-to-many.            |
| universalContentGravity | ALL              | Adjusts the position of the container confirming the entire row's body. |
| isEndableImageSelected | SINGLE_CHECK_LIST | Enables or disables checkboxes.                                   |
| TypeRow           | ALL                   | Assigns the type of row to be built.                                 |
| onClick           | ACTION                   | Config any action into onclick.                                 |

#### Description of categorized parameters used for SetText

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| title             | ALL                   | Assigns text for the title.                                          |
| titleToolbar             |  SINGLE_CHECK_LIST, MULTIPLE_CHECK_LIST                 | Assigns text for the title toolbar. |
| bubble             |  ALL | Assign number or text for into bubble text.                                          |
| text              | ALL                   | Assigns a description below the title.                               |
| descriptionBottom              | ALL                   | Assigns a title bottom below the title.                               |
| btnFinishSelect             |  MULTIPLE_CHECK_LIST                 | Assigns a title bottom below the options to select.  |
| edtHint           | EDIT              | Displays informative text inside the edit field.                    |
| comment           | EDIT              | Adds special comments within the row.                                |
| icon              | ALL                   | Used to assign icons using Font Awesome codes.                       |
| errorMessages     | ALL                   | Displays informative text indicating that this field must be filled.|

#### Description of categorized parameters for Lists

| Parameter         | Row compatibility               | Description                                                         |
|-------------------|------------------------------|---------------------------------------------------------------------|
| options           | SINGLE_CHECK_LIST, MULTIPLE_CHECK_LIST | Assigns special lists to choose from one or many options, depending on the list type. |
| arrayDates        | CALENDAR                | Assigns a special list of dates to delimit dates between weeks.     |

#### Description of categorized parameters for setValidation

| Parameter         | Row compatibility               | Description                                                         |
|-------------------|------------------------------|---------------------------------------------------------------------|
| validationOn           | SINGLE_CHECK_LIST, MULTIPLE_CHECK_LIST, EDIT | Active validation, when you the parameters is important for your form. This important use this option whit funcions validationByTag or validationAll |
| rulePattern        | EDIT                | If you need validation special character, you can using regular expression.    |

#### Description of categorized parameters for EditText

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| isEditable        | EDIT              | Sets whether the data can be edited by the user.                    |
| inputTypeEditText        | EDIT              | Configures the keyboard type for data capture.                  |
| maxLength        | EDIT              | Sets the maximum number of characters the user can input.                  |

#### Description of categorized parameters for Setting

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| rowSingleCheck.activeIconSuccess        | SINGLE_CHECK_LIST              |  When user selected a options will appear icon success.                    |
| rowMultipleCheck.activeIconSuccess        | MULTIPLE_CHECK_LIST              | When user selected a options will appear icon success.                    |

#### Description of categorized parameters for Animations

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| intentEnter       | ACTIVITY          | Assigns an animation for opening an activity.                       |
| intentExit        | ACTIVITY          | Assigns an animation for closing an activity.                       |

#### Description of categorized parameters for Set Colors

| Parameter         | Row compatibility               | Description                                                         |
|-------------------|------------------------------|---------------------------------------------------------------------|
| title             | ALL                          | Sets the color for row titles.                                       |
| descriptions      | ALL                          | Sets the color for row descriptions.                                 |
| descriptionBottom      | ALL                          | Sets the color for row descriptions below the title                               |
| icons             | ALL                          | Sets the color for row icons.                                        |
| separator         | ALL                          | Sets the color for lines separating rows.                           |
| circle            | ALL                          | Not enabled at the moment.                                           |
| letter            | ALL                          | Sets the color for row titles.                                       |
| edit              | ALL                          | Sets the color for text editing titles of a row.                     |
| editStyle         | ALL                          | Not enabled at the moment.                                           |
| titleToolbar      | ALL                          | Sets the color for toolbar component titles.                         |
| backgroundToolbar | ALL                          | Sets the color for the background of the row container.             |
| backgroundContent | ALL                          | Sets the color for the background of the row container.             |
| imageEmpty        | ALL                          | Sets the background color for image containers.                      |
| progressView        | ALL                          | Sets the background color for progress view.                      |
| backgroundContentMain        | ALL                          | Change color background of the row.                    |
| btnFinishSelect        | MULTIPLE_CHECK_LIST                          | Change color background of the button for the list multiple select.                    |


#### Description of categorized parameters for Set Time Picker

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| is24HourFormat             | TIME_PICKER                   | Set boolean parameter for enable format 24 format for the  time picker row.|
| format       | TIME_PICKER                   | Set specify format for show the time after selected.                              |

#### Description of categorized parameters for Set Date Picker

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| format       | DATE_PICKER                   | Set specify format for show the date after selected.                              |


#### Description of categorized parameters for Size

| Parameter         | Row compatibility        | Description                                                         |
|-------------------|-----------------------|---------------------------------------------------------------------|
| title             | ALL                   | Allows assigning the title size.                                    |
| description       | ALL                   | Allows assigning the description size.                              |
| description bottom       | ALL                   | Allows assigning the description bottom size.                              |
| bubble       | ALL                   | Allows assigning the bubble size.                              |
| letter            | ALL                   | Not enabled at the moment.                                           |
| edit              | ALL                   | Allows assigning the size of editable texts.                         |
| icon              | ALL                   | Allows assigning the size of icons.                                  |
| iconLeft              | ALL                   | Allows assigning the size of icons left.                                  |
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
| editText          | ALL                   | Controls the visibility of the editable text (Visible, Invisible, or Gone|
| switch          | SWTICH                   | Controls the visibility of the switch view text (Visible, Invisible, or Gone|
| descriptionBottom          | ALL                   | Controls the visibility of the descroption bottom view text (Visible, Invisible, or Gone|
| iconLeft              | ALL                   | Controls the visibility of the icon left (Visible, Invisible, or Gone depending on the context). |
| btnFinishSelect              | MULTIPLE_CHECK_LIST                   | Controls the visibility of the bottom finish select (Boolean). |
| activeBtnCheck              | MULTIPLE_CHECK_LIST                   | Controls the visibility of the image check (Boolean). |
| bubble             | ALL                   | Controls the visibility of the bubble text (Visible, Invisible, or Gone depending on the context). |
| progressBarRight             | ALL                   | Controls the visibility of the progress view (Visible, Invisible, or Gone depending on the context). |

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

