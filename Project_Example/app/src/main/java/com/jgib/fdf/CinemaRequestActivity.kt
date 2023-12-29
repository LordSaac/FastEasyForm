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

class CinemaRequestActivity : AppCompatActivity(), FormsListenerIGB {

    private val context = this
    private lateinit var rv_main: RecyclerView // Add RecyclerView into xml
    private lateinit var easyForm: EasyForm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinema_request)

        this.easyForm = EasyForm(this)

        this.rv_main = findViewById(R.id.rv_request_cinema)

        this.Init()
    }

    fun Init(){

        Row(ROW_TITLE){

            setText.title = "Cuestionario"
            setSize.title = 22.0f
            setColor.title = ContextCompat.getColor(context, R.color.black)

        }

        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "FRECUENCIA_VISITA"
            setText.title = "¿Con qué frecuencia suele visitar el cine Ya?"
            setting.rowSingleCheck.activeIconSuccess = true
            checkList {
                option { text = "Una vez al mes" }
                option { text = "Un par de veces al año" }
                option { text = "Solo ocasionalmente" }
                option { text = "Primera visita" }
            }
            validation = true // Habilitar validación
        }

        // Calidad de las proyecciones
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "CALIDAD_PROYECCIONES"
            setting.rowSingleCheck.activeIconSuccess = true
            setText.title = "En una escala del 1 al 5, ¿cómo calificaría la calidad de las proyecciones en Cine Ya?"
            checkList {
                option { text = "1 - Mala calidad" }
                option { text = "2 - Regular" }
                option { text = "3 - Aceptable" }
                option { text = "4 - Buena" }
                option { text = "5 - Excelente calidad" }
            }
            validation = true // Habilitar validación
        }

        // Comodidad de las butacas
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "COMODIDAD_BUTACAS"
            setText.title = "¿Qué tan cómodas encuentra las butacas en Cine Ya?"
            setting.rowSingleCheck.activeIconSuccess = true
            checkList {
                option { text = "1 - Muy incómodas" }
                option { text = "2 - Incómodas" }
                option { text = "3 - Aceptables" }
                option { text = "4 - Cómodas" }
                option { text = "5 - Muy cómodas" }
            }
            validation = true // Habilitar validación
        }

        // Variedad en la oferta de películas
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "VARIEDAD_PELICULAS"
            setting.rowSingleCheck.activeIconSuccess = true
            setText.title = "¿Cómo calificaría la variedad de películas ofrecidas por Cine Ya?"
            checkList {
                option { text = "1 - Muy limitada" }
                option { text = "2 - Limitada" }
                option { text = "3 - Aceptable" }
                option { text = "4 - Buena" }
                option { text = "5 - Muy buena" }
            }
            validation = true // Habilitar validación
        }

        // Precio de las entradas
        Row(ROW_SINGLE_CHECK_LIST) {
            tag = "PRECIO_ENTRADAS"
            setting.rowSingleCheck.activeIconSuccess = true
            setText.title = "¿Considera que el precio de las entradas es adecuado en Cine Ya?"
            checkList {
                option { text = "1 - Demasiado caro" }
                option { text = "2 - Caro" }
                option { text = "3 - Aceptable" }
                option { text = "4 - Razonable" }
                option { text = "5 - Muy económico" }
            }
            validation = true // Habilitar validación
        }

        // Comentarios adicionales
        Row(ROW_EDIT) {
            tag = "COMENTARIOS"
            setText.title = "¿Tiene algún comentario adicional o sugerencia para mejorar su experiencia en Cine Ya?"
            validation = true // Habilitar validación
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
        // Manejar la respuesta del formulario si es necesario
        // Por ejemplo, puedes obtener los resultados aquí
        val frecuenciaVisita = easyForm.tool.getResultByTag("FRECUENCIA_VISITA")
        val calidadProyecciones = easyForm.tool.getResultByTag("CALIDAD_PROYECCIONES")
        val comodidadButacas = easyForm.tool.getResultByTag("COMODIDAD_BUTACAS")
        val variedadPeliculas = easyForm.tool.getResultByTag("VARIEDAD_PELICULAS")
        val precioEntradas = easyForm.tool.getResultByTag("PRECIO_ENTRADAS")
        val comentarios = easyForm.tool.getResultByTag("COMENTARIOS")

        result.iconArrow = com.creativity.dev.formsimple.R.drawable.success




        // Puedes procesar los resultados aquí según tus necesidades
    }
}