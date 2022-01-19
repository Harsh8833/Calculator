package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    //display.inputType = InputType.TYPE_NULL


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun digitClicked(view: android.view.View) {
        val clickedButton = view as FloatingActionButton
        val display: EditText = findViewById(R.id.display)
        val acbutton: FloatingActionButton = findViewById(R.id.ac)
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
            oneButton.id -> display.setText("1").toString()
            twoButton.id -> display.setText("2").toString()
            threeButton.id -> display.setText("3").toString()
            fourButton.id -> display.setText("4").toString()
            fiveButton.id -> display.setText("5").toString()
            sixButton.id -> display.setText("6").toString()
            sevenButton.id -> display.setText("7").toString()
            eightButton.id -> display.setText("8").toString()
            nineButton.id -> display.setText("9").toString()
        }
    }
}