package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.DecimalFormat


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
            display.setTextSize(TypedValue.COMPLEX_UNIT_SP, 90F)
            display.setText("0").toString()

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
        val backspaceButton: FloatingActionButton = findViewById(R.id.backspace)
        val percentButton: FloatingActionButton = findViewById(R.id.percent)
        val divideButton: FloatingActionButton = findViewById(R.id.divide)
        val multiplyButton: FloatingActionButton = findViewById(R.id.multiply)
        val minusButton: FloatingActionButton = findViewById(R.id.minus)
        val plusButton: FloatingActionButton = findViewById(R.id.plus)




        when (expression.length) {
            in 0..13 -> display.setTextSize(TypedValue.COMPLEX_UNIT_SP, 90F)
            in 13..32 -> display.setTextSize(TypedValue.COMPLEX_UNIT_SP, 60F)
            else -> display.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40F)

        }


        when (clickedButton.id) {

            zeroButton.id -> {
                expression += "0"
            }
            oneButton.id -> {
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

            backspaceButton.id -> {
                expression = expression.dropLast(1)
            }

            dotButton.id -> {
                if (!expression.endsWith('.')) {
                    expression += "."
                }
            }
            percentButton.id -> {
                expression += "%"
            }
            divideButton.id -> {
                if (!expression.endsWith('÷')) {
                    expression += "÷"
                }

            }
            multiplyButton.id -> {
                if (!expression.endsWith('×')) {
                    expression += "×"
                }
            }
            minusButton.id -> {
                if (!expression.endsWith('-')) {
                    expression += "−"
                }
            }

            plusButton.id -> {
                if (!expression.endsWith('+')) {
                    expression += "+"
                }
            }


        }
        display.setText(expression).toString()
    }

    fun calculate(view: View) {


        val display: EditText = findViewById(R.id.display)
        var num: String = ""
        var symbol: Char = '+'
        var result: Double = 0.0

        for (each in expression) {
            if (each in listOf('.','1','2','3','4','5', '6', '7', '8', '9', '0'))
                num += each
            else {
                when (symbol) {
                    '+' -> result += num.toDouble()
                    '−' -> result -= num.toDouble()
                    '×' -> result *= num.toDouble()
                    '÷' -> result /= num.toDouble()
                }
                num = ""
                symbol = each
            }
        }
        when (symbol) {
            '+' -> result += num.toDouble()
            '−' -> result -= num.toDouble()
            '×' -> result *= num.toDouble()
            '÷' -> result /= num.toDouble()
        }
        val format: DecimalFormat = DecimalFormat("0.#")
        val output = format.format(result).toString()
        expression = output
        //display.setText("56").toString()
        Log.e(Tag, "$output")
        display.setText(output).toString()

    }
}



