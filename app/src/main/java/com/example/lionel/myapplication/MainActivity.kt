package com.example.lionel.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    var n1 = 0.0
    var n2 = 0.0
    var res = 0.0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun numero(v: View) {
        val numer = findViewById<Button>(v.id)
        val textnum = numer.text.toString()
        resultado.text = "${resultado.text.toString()}${textnum}"
        bPunto.isEnabled = true
        activarBotones()
        if (resultado.text.contains("X") || resultado.text.contains("/") || resultado.text.contains("+") || resultado.text.contains("-")) {
            desactivarBotones()
        }
        if (resultado.text.toString().contains("."))
            bPunto.isEnabled = false
    }
    fun decimal(v: View)
    {
        bigual.isEnabled=true
        desactivarHexa()
        activarnum()
    }

    fun hexa(v: View)
    {
        bigual.isEnabled=true
        activarHexa()
        activarnum()
    }

    fun bin(v: View){
        bigual.isEnabled=true
        desactivarHexa()
        desactivarnum()

    }

    fun desactivarBotones() {
        bmult.isEnabled = false
        bdividir.isEnabled = false
        bsumar.isEnabled = false
        brestar.isEnabled = false
    }

    fun activarBotones() {
        bmult.isEnabled = true
        bdividir.isEnabled = true
        bsumar.isEnabled = true
        brestar.isEnabled = true
    }

    fun calculardec(v : View) {

        var s = resultado.text.toString()

        if(bA.isEnabled==false) {
            if (s.contains("X")) {
                n1 = s.substring(0, s.lastIndexOf("X")).toDouble()
                n2 = s.substring(s.lastIndexOf("X") + 1, s.length).toDouble()
                res = n1 * n2
                activarBotones()
                bPunto.isEnabled = false
                resultado.text = res.toString()
            } else
                if (s.contains("/")) {
                    n1 = s.substring(0, s.lastIndexOf("/")).toDouble()
                    n2 = s.substring(s.lastIndexOf("/") + 1, s.length).toDouble()
                    res = n1 / n2
                    activarBotones()
                    bPunto.isEnabled = false
                    resultado.text = res.toString()
                } else
                    if (s.contains("+")) {
                        n1 = s.substring(0, s.lastIndexOf("+")).toDouble()
                        n2 = s.substring(s.lastIndexOf("+") + 1, s.length).toDouble()
                        res = n1 + n2
                        activarBotones()
                        bPunto.isEnabled = false
                        resultado.text = res.toString()
                    } else
                        if (s.contains("-")) {
                            n1 = s.substring(0, s.lastIndexOf("-")).toDouble()
                            n2 = s.substring(s.lastIndexOf("-") + 1, s.length).toDouble()
                            res = n1 - n2
                            activarBotones()
                            bPunto.isEnabled = false
                            resultado.text = res.toString()
                        }
        }
        if (bA.isEnabled)
        {
            if(s.contains("X")){
                n1= s.substring(0, s.lastIndexOf("X")).toLong(radix = 16).toDouble()
                n2= s.substring(s.lastIndexOf("X")+1, s.length).toLong(radix = 16).toDouble()
                res=n1*n2
                activarBotones()
                bPunto.isEnabled=false
                resultado.text=res.toString()
            }
            else
                if(s.contains("/")){
                    n1=s.substring(0, s.lastIndexOf("/")).toLong(radix = 16).toDouble()
                    n2=s.substring(s.lastIndexOf("/")+1, s.length).toLong(radix = 16).toDouble()
                    res=n1/n2
                    activarBotones()
                    bPunto.isEnabled=false
                    resultado.text=res.toString()
                }
                else
                    if(s.contains("+")){
                        n1=s.substring(0, s.lastIndexOf("+")).toLong(radix = 16).toDouble()
                        n2=s.substring(s.lastIndexOf("+")+1, s.length).toLong(radix = 16).toDouble()
                        res=n1+n2
                        activarBotones()
                        bPunto.isEnabled=false
                        resultado.text=res.toString()
                    }
                    else
                        if(s.contains("-")){
                            n1=s.substring(0, s.lastIndexOf("-")).toLong(radix = 16).toDouble()
                            n2=s.substring(s.lastIndexOf("-")+1, s.length).toLong(radix = 16).toDouble()
                            res=n1-n2
                            activarBotones()
                            bPunto.isEnabled=false
                            resultado.text=res.toString()
                        }
            activarBotones()
            bPunto.isEnabled=false
        }
        activarBotones()
        bPunto.isEnabled=false
    }




    fun activarHexa(){
        bA.isEnabled=true
        bB.isEnabled=true
        bC.isEnabled=true
        bD.isEnabled=true
        bE.isEnabled=true
        bF.isEnabled=true
    }
    fun desactivarHexa(){
        bA.isEnabled=false
        bB.isEnabled=false
        bC.isEnabled=false
        bD.isEnabled=false
        bE.isEnabled=false
        bF.isEnabled=false
    }

    fun activarnum(){
        b2.isEnabled=true
        b3.isEnabled=true
        b4.isEnabled=true
        b5.isEnabled=true
        b6.isEnabled=true
        b7.isEnabled=true
        b8.isEnabled=true
        b9.isEnabled=true

    }
    fun desactivarnum(){
        b2.isEnabled=false
        b3.isEnabled=false
        b4.isEnabled=false
        b5.isEnabled=false
        b6.isEnabled=false
        b7.isEnabled=false
        b8.isEnabled=false
        b9.isEnabled=false

    }




    fun borrar(v : View){

        resultado.setText(" ")

    }






}
