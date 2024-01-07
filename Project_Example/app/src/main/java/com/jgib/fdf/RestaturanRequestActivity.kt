package com.jgib.fdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.ResponseFormsIGB
import com.creativity.dev.formsimple.option
import com.creativity.dev.formsimple.types.ROW_EDIT
import com.creativity.dev.formsimple.types.ROW_SINGLE_CHECK_LIST
import com.creativity.dev.formsimple.types.ROW_TITLE
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyForm

class RestaturanRequestActivity : AppCompatActivity(), FormsListenerIGB {

    private val context = this
    private lateinit var rv_main: RecyclerView // Add RecyclerView into xml
    private lateinit var easyForm: EasyForm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaturan_request)

        this.easyForm = EasyForm(this)

        this.rv_main = findViewById(R.id.rv_restaurant_request)

        this.Init()

    }

     fun Init(){

         Row(ROW_TITLE){

             setText.title = "Cuestionario"
             setSize.title = 22.0f
             setColor.title = ContextCompat.getColor(context, R.color.black)

         }

        // Frecuencia de visita
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "FRECUENCIA_VISITA"
            setText.title = "¿Con qué frecuencia suele visitar el restaurante Rico Pollo?"
            setSize.layout.hight = 150
            checkList {
                option { text = "Una vez a la semana" }
                option { text = "Un par de veces al mes" }
                option { text = "Solo ocasionalmente" }
                option { text = "Primera visita" }
            }
            validation = true // Habilitar validación
            setting.rowSingleCheck.activeIconSuccess = true
        }

        // Opinión sobre la comida
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "OPINION_COMIDA"
            setText.title = "En una escala del 1 al 5, ¿cómo calificaría el sabor de la comida en Rico Pollo?"
            setSize.layout.hight = 150
            checkList {
                option { text = "1 - Muy insatisfactorio" }
                option { text = "2 - Insatisfactorio" }
                option { text = "3 - Neutral" }
                option { text = "4 - Satisfactorio" }
                option { text = "5 - Muy satisfactorio" }
            }
            validation = true // Habilitar validación
            setting.rowSingleCheck.activeIconSuccess = true
        }

        // Calidad del servicio
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "CALIDAD_SERVICIO"
            setText.title = "¿Cómo calificaría la calidad del servicio en Rico Pollo?"
            setSize.layout.hight = 150
            checkList {
                option { text = "1 - Muy insatisfactoria" }
                option { text = "2 - Insatisfactoria" }
                option { text = "3 - Neutral" }
                option { text = "4 - Satisfactoria" }
                option { text = "5 - Muy satisfactoria" }
            }
            validation = true // Habilitar validación
            setting.rowSingleCheck.activeIconSuccess = true
        }

        // Ambiente del restaurante
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "AMBIENTE_RESTAURANTE"
            setText.title = "¿Qué tan agradable encuentra el ambiente en Rico Pollo?"
            setSize.layout.hight = 150
            checkList {
                option { text = "1 - Muy desagradable" }
                option { text = "2 - Desagradable" }
                option { text = "3 - Neutral" }
                option { text = "4 - Agradable" }
                option { text = "5 - Muy agradable" }
            }
            validation = true // Habilitar validación
            setting.rowSingleCheck.activeIconSuccess = true
        }

        // Variedad en el menú
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "VARIEDAD_MENU"
            setText.title = "¿Cómo calificaría la variedad de opciones en el menú?"
            setSize.layout.hight = 150
            checkList {
                option { text = "1 - Muy limitada" }
                option { text = "2 - Limitada" }
                option { text = "3 - Aceptable" }
                option { text = "4 - Buena" }
                option { text = "5 - Muy buena" }
            }
            validation = true // Habilitar validación
            setting.rowSingleCheck.activeIconSuccess = true
        }

        // Precio en relación a la calidad
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "PRECIO_CALIDAD"
            setText.title = "¿Considera que el precio está justificado por la calidad de la comida en Rico Pollo?"
            setSize.layout.hight = 150
            checkList {
                option { text = "1 - No está justificado" }
                option { text = "2 - Apenas justificado" }
                option { text = "3 - Neutral" }
                option { text = "4 - Razonablemente justificado" }
                option { text = "5 - Totalmente justificado" }
            }
            validation = true // Habilitar validación
            setting.rowSingleCheck.activeIconSuccess = true
        }
         Row(ROW_TITLE){

             setText.title = "Información personal"
             setSize.title = 22.0f
             setColor.title = ContextCompat.getColor(context, R.color.black)

         }

        // Comentarios adicionales
        Row(ROW_EDIT) {
            tag = "COMENTARIOS"
            setText.title = "Nombre completo"
            validation = true // Habilitar validación
        }

         Row(ROW_EDIT) {
             tag = "COMENTARIOS"
             setText.title = "Correo"
             inputTypeEditText = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
             validation = true // Habilitar validación
         }

         Row(ROW_EDIT) {
             tag = "COMENTARIOS"
             setText.title = "Edad"
             inputTypeEditText = InputType.TYPE_CLASS_NUMBER
             validation = true // Habilitar validación
         }

         Row(ROW_EDIT) {
             tag = "COMENTARIOS"
             setText.title = "Telefono"
             inputTypeEditText = InputType.TYPE_CLASS_PHONE
             validation = true // Habilitar validación
         }

        this.easyForm.start(recyclerView = rv_main)

    }

    override fun actionFormResponse(result: ResponseFormsIGB) {


        // Manejar la respuesta de la encuesta si es necesario
        // Por ejemplo, puedes obtener los resultados aquí
        val frecuenciaVisita = easyForm.tool.getResultByTag("FRECUENCIA_VISITA")
        val opinionComida = easyForm.tool.getResultByTag("OPINION_COMIDA")
        val calidadServicio = easyForm.tool.getResultByTag("CALIDAD_SERVICIO")
        val ambienteRestaurante = easyForm.tool.getResultByTag("AMBIENTE_RESTAURANTE")
        val variedadMenu = easyForm.tool.getResultByTag("VARIEDAD_MENU")
        val precioCalidad = easyForm.tool.getResultByTag("PRECIO_CALIDAD")
        val comentarios = easyForm.tool.getResultByTag("COMENTARIOS")

        // Puedes procesar los resultados aquí según tus necesidades
    }


}