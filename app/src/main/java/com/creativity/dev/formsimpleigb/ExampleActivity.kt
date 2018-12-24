package com.creativity.dev.formsimpleigb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.ResponseFormsIGB

class ExampleActivity : AppCompatActivity(), FormsListenerIGB {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)
    }

    override fun FormsListenerResponse(obj: ResponseFormsIGB) {

        TODO("not implemented") //Here you listen the row when this change the content.

    }


}
