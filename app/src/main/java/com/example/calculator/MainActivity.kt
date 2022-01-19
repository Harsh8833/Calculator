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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        //display.inputType = InputType.TYPE_NULL

        acbutton.setOnClickListener {
            display.setText("").toString()
        }
        oneButton.setOnClickListener {
            display.setText("1").toString()
        }
        twoButton.setOnClickListener {
            display.setText("2").toString()
        }




    }
}