package com.example.nikassupercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private lateinit var resulttextview: TextView

    private var operand: Double = 0.0
    private var operacia: String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resulttextview = findViewById(R. id.resulttextview)
    }


    fun numberClick(dacherili: View){

        if (dacherili is TextView){
            var result = resulttextview.text.toString()
            val number = dacherili.text.toString()


            if (result == "0") {
                result = ""

            }


            resulttextview.text = result + number
        }

    }


    fun operationClick(dacherili: View) {
        if (dacherili is TextView){
            val result = resulttextview.text.toString()
            if (result.isNotEmpty()){
                operand = result.toDouble()
            }

            operacia = dacherili.text.toString()

            resulttextview.text = ""



        }


    }


    fun equalsClick(dacherili: View) {
        val secOperandText = resulttextview.text.toString()
        var secOperand: Double = 0.0

        if (secOperandText.isNotEmpty()){
            secOperand = secOperandText.toDouble()


        }



        when(operacia) {
            "+" -> resulttextview.text = (operand + secOperand).toString()
            "-" -> resulttextview.text = (operand - secOperand).toString()
            "*" -> resulttextview.text = (operand * secOperand).toString()
            "/" -> resulttextview.text = (operand / secOperand).toString()
            "Clear" -> resulttextview.text = "".toString()


        }


    }

    fun deleteClick(dacherili: View) {
        var result = resulttextview.text.toString()
        val text = resulttextview.text.toString()
        if (text.isNotEmpty()) {
            resulttextview.text = text.dropLast(1)
        }

    }
    



}