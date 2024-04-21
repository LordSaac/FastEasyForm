package com.creativity.dev.formsimpleigb


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.ResponseFormsIGB

class ExampleActivity : AppCompatActivity(), FormsListenerIGB {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)



    }

    override fun actionFormResponse(result: ResponseFormsIGB) {

    }


}
