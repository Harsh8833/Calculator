package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText
import kotlin.math.exp


var newState = true
var expression = ""
private const val Tag = "MyActivity"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val display: EditText = findViewById(R.id.display)
        val acButton: FloatingActionButton = findViewById(R.id.ac)
        acButton.setOnClickListener {
            expression = ""
            display.setText("0").toString()
        }

        val backspaceButton: FloatingActionButton = findViewById(R.id.backspace)
        backspaceButton.setOnClickListener {
            if(expression.isNotEmpty()){
                Log.d(Tag, "in is not empty")
                expression = expression.dropLast(1)
                display.setText(expression)

            }
        }

    }





    fun digitClicked(view: android.view.View) {
        val clickedButton = view as FloatingActionButton
        val display: EditText = findViewById(R.id.display)
        val zeroButton: FloatingActionButton = findViewById(R.id.key0)
        val oneButton: FloatingActionButton = findViewById(R.id.key1)
        val twoButton: FloatingActionButton = findViewById(R.id.key2)
        val threeButton: FloatingActionButton = findViewById(R.id.key3)
        val fourButton: FloatingActionButton = findViewById(R.id.key4)
        val fiveButton: FloatingActionButton = findViewById(R.id.key5)
        val sixButton: FloatingActionButton = findViewById(R.id.key6)
        val sevenButton: FloatingActionButton = findViewById(R.id.key7)
        val eightButton: FloatingActionButton = findViewById(R.id.key8)
        val nineButton: FloatingActionButton = findViewById(R.id.key9)
        val dotButton: FloatingActionButton = findViewById(R.id.key_decimal)


        when(clickedButton.id){

            zeroButton.id -> {
                expression += "0"
            }
            oneButton.id ->{
                expression += "1"
            }
            twoButton.id -> {
                expression += "2"
            }
            threeButton.id -> {
                expression += "3"
            }
            fourButton.id -> {
                expression += "4"
            }
            fiveButton.id -> {
                expression += "5"
            }
            sixButton.id -> {
                expression += "6"
            }
            sevenButton.id -> {
                expression += "7"
            }
            eightButton.id -> {
                expression += "8"
            }
            nineButton.id -> {
                expression += "9"
            }
        }
        display.setText(expression).toString()
    }

}