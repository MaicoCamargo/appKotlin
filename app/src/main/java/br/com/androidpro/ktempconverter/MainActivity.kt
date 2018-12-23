package br.com.androidpro.ktempconverter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText// lateinit diz que a variavel vai ser incialiazada mais tarde
    lateinit var celsius: RadioButton
    lateinit var fahreinheit: RadioButton
    lateinit var botaoConveter: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.valorTemp) as EditText
        celsius = findViewById(R.id.celsiusRadio) as RadioButton
        fahreinheit = findViewById(R.id.FahreinheitRadio) as RadioButton
        botaoConveter = findViewById(R.id.conveterButton) as Button

        botaoConveter.setOnClickListener{ converter(it)}
    }

    fun converter(view : View){
        var temp : Double = editText.text.toString().toDouble()//val é imutavel
        if (celsius.isChecked){
            temp =(temp -32) * 5/9
        }else{
            temp = temp * 9/5 + 32
        }
        editText.setText(temp.toString())// colocar o texto pra dentro do input
    }
}
