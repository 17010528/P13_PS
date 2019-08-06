package com.example.p13_ps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var first = ""
var second = ""
var total = 0.0
var change = false
var op = ""

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnOnClick(view : View){


        val btnSelected = view as Button
        if(change == false) {
            when (btnSelected.id) {

                button00.id -> first = first + "0"
                button01.id -> first = first + "1"
                button02.id -> first = first + "2"
                button03.id -> first = first + "3"
                button04.id -> first = first + "4"
                button05.id -> first = first + "5"
                button06.id -> first = first + "6"
                button07.id -> first = first + "7"
                button08.id -> first = first + "8"
                button09.id -> first = first + "9"
                buttonDot.id -> first = first + "."

            }
            tvSum.text = "$first"
        }else{
            when (btnSelected.id) {

                button00.id -> second = second + "0"
                button01.id -> second = second + "1"
                button02.id -> second = second + "2"
                button03.id -> second = second + "3"
                button04.id -> second = second + "4"
                button05.id -> second = second + "5"
                button06.id -> second = second + "6"
                button07.id -> second = second + "7"
                button08.id -> second = second + "8"
                button09.id -> second = second + "9"
                buttonDot.id -> second = second + "."

            }
            tvSum.text = "$second"

        }


    }
    fun btnOpClick(view : View){


        val btnSelected = view as Button
        when(btnSelected.id){
            buttonDivide.id -> op = "/"
            buttonMinus.id -> op = "-"
            buttonTimes.id -> op = "*"
            buttonPlus.id -> op = "+"
        }
        change = true
        tvSum.text = ""
    }

    fun btnEqualsClick(view : View){

            if(op == "+"){
                total = first.toDouble() + second.toDouble()
            }else if(op == "-"){
                total = first.toDouble() - second.toDouble()
            }else if(op == "*"){
                total = first.toDouble() * second.toDouble()
            }else if(op == "/"){
                total = first.toDouble() / second.toDouble()
            }
            tvSum.text = total.toString()
            first = total.toString()
            total = 0.0
            second = ""




    }
    fun btnACClick(view : View){
        first = ""
        second = ""
        tvSum.text = ""
        change = false
    }

}
