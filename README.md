# Fast & Easy Forms 

Simple List IGB is new a dynamic template for creating easy forms for the Android kotlin developer. Combine any design and adapt this library in your final user interface.

<p align="center">

|Int Top|In Bottom|
|:----:|:----:|
|<img  height="568" width="320" src="https://github.com/LordSaac/FormSimpleIGB/blob/master/Media/Screenshot_20181224-103520.png">|<img  height="568" width="320" src="https://github.com/LordSaac/FormSimpleIGB/blob/master/Media/Screenshot_20181224-103524.png">|
</p>

## Type Rows: 
*	**ROW_TITLE:** use this row for add sections and separators. 

*	**ROW_ACTIVITY:** here call any activity. 

*	**ROW_MULTIPLE_CHECK_LIST:** use this row for selected more of one options.

*	**ROW_SINGLE_CHECK_LIST:** select only one options.

*	**ROW_CHECK:** use this list for easy check.

*	**ROW_EDIT:** use this row for editing text.

*	**ROW_CALENDAR_HOUR:** use for to select hours and minutes.

*	**ROW_CALENDAR:** use basic calendar for your forms.

*	**ROW_INFO:** add basic information for your descriptions.  

*  [For more info, see you Wiki.](https://github.com/LordSaac/FormSimpleIGB/wiki)

## Descriptions attributes: 

*	**title:** add title name.

*	**text:** add a description for your row

*	**tag:** for identification of the row.

*	**titleColor:** Add any colors for title.

*	**activity:** add any class activity for your call, when the user click in the option appear the activity.

*	**validation:** here validate rows important for your forms.

*	**options:** is a list composite for selecting a groups options.

*	**colorBackgroundToolbar:** add color in the toolbar (optional but recomendable)

*	**emptyMessage:** add messsage when your list is empty.

*	**imageEmpty:** Add an image for empty list (Optional)

*	**checked:** Initialize check in false or true

*	**inputTypeEditText:** to choose type EDITTEXT

*	**maxLength:** choose the text length to text edit

## Initialize Form:  
#### Add XML Tools (Optional)
Add this component in your XML, but is optional, you can add own Recyclerview control: 
```
    <com.creativity.dev.formsimple.ext.FormSimpleIGB
            android:id="@+id/rv_main"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            app:layout_constraintBottom_toTopOf="@+id/button" android:layout_marginTop="0dp"
            app:layout_constraintTop_toTopOf="parent"/>
```
#### Simple Form Example:  
```
     private fun init(){
       Row(ROW_TITLE){ 
            title = "Information"
            titleColor = ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark) 
        }
        
       Row(ROW_EDIT){
            title = "Firts Name" 
        }

        Row(ROW_EDIT){

            title = "Lastname"
            validation = true

        }
        
          Row(ROW_EDIT){

            title = "Correo Electronico"
            text= "jose19.26@hotmail.com"
            inputTypeEditText = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS 

        } 
        yourRecyclerview.initListDynamic()       
     } 
```

#### For initialize forms add: 
This object is very important for initialize the form: 
```
yourRecyclerview.initListDynamic() //Here initialize your recycler view
```
## Methods:
#### Get:
Add tag the row for getting the atributte text, checked, list options, postion. 
```
 str =  SimpleFormsIGB.Result(tagEditAge).text 
```
#### Update:
For update row insert in left the correspond tag and the right use "Set Row" for update: checked,text,position or selecting options.
```
   SimpleFormsIGB.UpdateRow(yourTag, SetRow {checked = true})
```
#### Validate:
Validate row brands with the attribute "Validate" if the state is true. 
```
 SimpleFormsIGB.validationForms() 
```
## Listener Descriptions: 
#### FormsListenerResponse: 
This interface detect changes in the rows, for using you need the corresponding tag row for is identification. 
<br>
Example:
```
class MainActivity : AppCompatActivity(), FormsListenerIGB {
 
 // Body Activity
 
 override fun FormsListenerResponse(obj: ResponseFormsIGB) {

        if(obj.tag.equals(myTag)){
            AlertDialogManager.simpleAlerts(this,"Alert","Hello, i here")
        }

    }
   
 }
```
<br>

# Gradle:

dependencies {
<br>
` implementation 'com.jgb.lordsaac.igb.formsimpleigb:simpleformigb:0.0.1'`
 <br>
}
# Contribution

You are most welcome to contribute to this project!

*  Buy me a  [Coffee](https://paypal.me/LordSaac?locale.x=es_XC)  &nbsp; :coffee:

*  Give me a [Star](https://github.com/LordSaac/FormSimpleIGB) &nbsp; :star: 

<h2>Release December 28, 2018</h2>

## Licence

Copyright 2018 Isaac G. Banda

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

