package com.creativity.dev.formsimple


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.types.ROW_CALENDAR
import com.creativity.dev.formsimple.types.ROW_CHECK
import com.creativity.dev.formsimple.types.ROW_EDIT
import com.creativity.dev.formsimple.types.ROW_ON_CLICK
import com.creativity.dev.formsimple.types.ROW_SINGLE_CHECK_LIST
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyFastForm

import java.lang.Exception

class UnitTestActivity : AppCompatActivity() {

    private lateinit var easyForm: EasyFastForm

    private lateinit var rv_main: RecyclerView

    val success= "OK"

    val error = "Error"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_test)

        this.easyForm = EasyFastForm(this)

        this.rv_main = findViewById(R.id.rv_unit_test)

        this.init()
    }

    fun init() : Boolean{

        try {

            easyForm.apply {

                Row(ROW_SINGLE_CHECK_LIST) {
                    tag = "FRECUENCIA_VISITA"
                    setText.title = "¿Con qué frecuencia suele visitar el cine Ya?"
                    setSize.title = 14f

                    checkList {
                        option { text = "Una vez al mes" }
                        option { text = "Un par de veces al año" }
                        option { text = "Solo ocasionalmente" }
                        option { text = "Primera visita" }
                    }
                    setting.rowSingleCheck.activeIconSuccess = true
                   setValidation.validationOn = true // Habilitar validación
                }

                // Calidad de las proyecciones
                Row(ROW_SINGLE_CHECK_LIST) {
                    tag = "CALIDAD_PROYECCIONES"
                    setText.title = "En una escala del 1 al 5, ¿cómo calificaría la calidad de las proyecciones en Cine Ya?"
                    setSize.title = 14f
                    checkList {
                        option { text = "1 - Mala calidad" }
                        option { text = "2 - Regular" }
                        option { text = "3 - Aceptable" }
                        option { text = "4 - Buena" }
                        option { text = "5 - Excelente calidad" }
                    }
                    setValidation.validationOn = true // Habilitar validación
                }

                Row(ROW_CHECK) {

                    tag = "1234"
                    setText.title = "Are you like this librery ?"
                    setSize.title = 14f

                    setValidation.validationOn = true // Habilitar validación
                }

                // Nombre del cliente
                Row(ROW_EDIT) {
                    setText.title = "Nombre"
                    setText.edtHint = "Ingrese su nombre"
                    setText.text = "Test"
                    tag = "nombreCliente"
                    setValidation.validationOn = true
                }

                Row(ROW_EDIT) {
                    setText.title = "Apellido"
                    setText.edtHint = "Ingrese su apellido"
                    tag = "apellidoCliente"
                    setValidation.validationOn = true
                }

                Row(ROW_CALENDAR) {
                    setText.title = "Date of Birth"
                    tag = "dateOfBirth"
                    setValidation.validationOn = true
                }


                // Calificación de la película
                Row(ROW_SINGLE_CHECK_LIST) {
                    setText.title = "Calificación de la película"
                    tag = "calificacionPelicula"

                    checkList {
                        option { text = "Excelente" }
                        option { text = "Buena" }
                        option { text = "Regular" }
                        option { text = "Mala" }
                    }

                    setValidation.validationOn = true
                }

                Row(ROW_EDIT) {
                    setText.title = "Comentario"
                    setText.edtHint = "Ingrese su comentario"
                    tag = "comentario"
                }

                // Correo electrónico (opcional)
                Row(ROW_EDIT) {
                    setText.title = "Correo Electrónico (Opcional)"
                    setText.edtHint = "Ingrese su correo electrónico"
                    tag = "correoElectronico"
                }

                Row(ROW_ON_CLICK) {
                    setText.title = "Visitar sitio web de Cine Ya"
                    onClick {
                        val url = "https://spc.tropigas.com.pa/system-detect/index.html" // Aquí debes poner el enlace real del sitio web del cine
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    }
                }

                Row(ROW_EDIT) {
                    setText.title = "Comentario"
                    setText.edtHint = "Ingrese su comentario"
                    tag = "comentario"
                }

                start(rv_main)
            }

           return true

        }catch (ex: Exception){

            print(ex.message)

            return false

        }

    }

    fun validateAll() : String{

        return try {

            val result = easyForm.tool.validateAll()

            if(!result)

                this.success

            else

                this.error



        }catch (ex: Exception){

            this.error

        }

    }

    fun validateByTag() : String{

        return try {

             easyForm.tool.validateByTag("apellidoCliente")

            val isSuccessOne = easyForm.tool.validateByTag("nombreCliente")

            val isSuccessTwo = easyForm.tool.validateByTag("calificacionPelicula")

            val isSuccessThree = easyForm.tool.validateByTag("empty")

            val isSuccessFour = easyForm.tool.validateByTag("comentario")

            if(isSuccessOne && !isSuccessTwo && !isSuccessThree && !isSuccessFour){

                this.success

            }
            else

                this.error



        }catch (ex: Exception){

            this.error

        }

    }

    fun resultByTag() : String{

        return try {

            val isSuccessOne = easyForm.tool.getResultByTag("nombreCliente")

            val isSuccessTwo = easyForm.tool.getResultByTag("calificacionPelicula")

            val isSuccessThree = easyForm.tool.getResultByTag("empty")

            if(isSuccessOne.title.isNotEmpty() && isSuccessTwo.title.isNotEmpty() && isSuccessThree.title.isEmpty()){

                this.success

            }
            else

                this.error

        }catch (ex: Exception){

            this.error

        }

    }

    fun getResultAll() : String{

        return try {

            val result = easyForm.tool.getResultAll()

            if(result.isNotEmpty()){

                this.success

            }
            else

                this.error

        }catch (ex: Exception){

            this.error

        }

    }

    fun updateRow() : String{

        return try {

            val testObj = easyForm.tool.getResultByTag("nombreCliente")

            testObj.title = "test"

            testObj.checked = true

            testObj.text = "this is a test"

            val resultOne = easyForm.tool.updateRow("nombreCliente", testObj)

            val resultThree = easyForm.tool.updateRow("empty", testObj)

            if(resultOne && !resultThree){

                val isUpdatedOne =  easyForm.tool.getResultByTag("nombreCliente")

                if(isUpdatedOne.title == testObj.title){

                    this.success

                }else{

                    this.error

                }

            }
            else

                this.error

        }catch (ex: Exception){

            this.error

        }

    }

    fun onclickValidateAll(v:View){

        this.validateAll()

    }

    fun onclickValidateByTag(v:View){

        this.validateByTag()

    }

    fun onclickUpdateRow(v:View){

        this.updateRow()

    }

}