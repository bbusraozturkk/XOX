package com.example.xox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

lateinit var b1 : Button
lateinit var b2 : Button
lateinit var b3 : Button
lateinit var b4 : Button
lateinit var b5 : Button
lateinit var b6 : Button
lateinit var b7 : Button
lateinit var b8 : Button
lateinit var b9 : Button
lateinit var bReset : Button

class MainActivity : AppCompatActivity() {
    var player = "P1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        bReset= findViewById(R.id.bReset)

        b1.setOnClickListener{
            if(b1.text==""){
                if(player=="P1") {
                    b1.text = "X"
                    player ="P2"

                }
            else{
                b1.text="O"
                    player="P1"
            }
                win()
        }
    }
        b2.setOnClickListener{
            if(b2.text==""){
                if(player=="P1") {
                    b2.text = "X"
                    player ="P2"
                }
            else{
                b2.text="O"
                    player="P1"
            }
                win()
        }
    }
        b3.setOnClickListener{
            if(b3.text==""){
                if(player=="P1") {
                    b3.text = "X"
                    player ="P2"
                }
            else{
                b3.text="O"
                    player="P1"
            }
                win()
        }
    }
        b4.setOnClickListener{
            if(b4.text==""){
                if(player=="P1") {
                    b4.text = "X"
                    player ="P2"
                }
            else{
                b4.text="O"
                    player="P1"
            }
                win()
        }
    }
        b5.setOnClickListener{
            if(b5.text==""){
                if(player=="P1") {
                    b5.text = "X"
                    player ="P2"
                }
            else{
                b5.text="O"
                    player="P1"
            }
                win()
        }
    }
        b6.setOnClickListener{
            if(b6.text==""){
                if(player=="P1") {
                    b6.text = "X"
                    player ="P2"
                }
            else{
                b6.text="O"
                    player="P1"
            }
                win()
        }
    }
        b7.setOnClickListener{
            if(b7.text==""){
                if(player=="P1") {
                    b7.text = "X"
                    player ="P2"
                }
            else{
                b7.text="O"
                    player="P1"
            }
                win()
        }
    }
        b8.setOnClickListener{
            if(b8.text==""){
                if(player=="P1") {
                    b8.text = "X"
                    player ="P2"
                }
            else{
                b8.text="O"
                    player="P1"
            }
                win()
        }
    }
        b9.setOnClickListener{
            if(b9.text==""){
                if(player=="P1") {
                    b9.text = "X"
                    player ="P2"
                }
            else{
                b9.text="O"
                    player="P1"
            }
                win()
        }
    }
        bReset.setOnClickListener{
            b1.text=""
            b2.text=""
            b3.text=""
            b4.text=""
            b5.text=""
            b6.text=""
            b7.text=""
            b8.text=""
            b9.text=""
            b1.isEnabled=true
            b2.isEnabled=true
            b3.isEnabled=true
            b4.isEnabled=true
            b5.isEnabled=true
            b6.isEnabled=true
            b7.isEnabled=true
            b8.isEnabled=true
            b9.isEnabled=true
            player="P1"
        }

}
    fun win() {
        if (
            (b1.text == "X" && b2.text == "X" && b3.text == "X") ||
            (b4.text == "X" && b5.text == "X" && b6.text == "X") ||
            (b7.text == "X" && b8.text == "X" && b9.text == "X") ||
            (b1.text == "X" && b4.text == "X" && b7.text == "X") ||
            (b1.text == "X" && b5.text == "X" && b9.text == "X") ||
            (b2.text == "X" && b5.text == "X" && b8.text == "X") ||
            (b3.text == "X" && b6.text == "X" && b9.text == "X") ||
            (b3.text == "X" && b5.text == "X" && b7.text == "X")
        ) {
            alertX()
            disableButtons()
        } else if (
            (b1.text == "O" && b2.text == "O" && b3.text == "O") ||
            (b4.text == "O" && b5.text == "O" && b6.text == "O") ||
            (b7.text == "O" && b8.text == "O" && b9.text == "O") ||
            (b1.text == "O" && b4.text == "O" && b7.text == "O") ||
            (b1.text == "O" && b5.text == "O" && b9.text == "O") ||
            (b2.text == "O" && b5.text == "O" && b8.text == "O") ||
            (b3.text == "O" && b6.text == "O" && b9.text == "O") ||
            (b3.text == "O" && b5.text == "O" && b7.text == "O")
        ) {
            alertO()
            disableButtons()
        } else if (
            b1.text != "" && b2.text != "" && b3.text != "" &&
            b4.text != "" && b5.text != "" && b6.text != "" &&
            b7.text != "" && b8.text != "" && b9.text != ""
        ) {
            // Berabere
            Toast.makeText(applicationContext, "Berabere!", Toast.LENGTH_SHORT).show()
            disableButtons()
        }
    }

    fun alertX(){
        var alertX= AlertDialog.Builder(this)
        alertX.setTitle("X wins!!!")
        alertX.setMessage("X wins!! play again?")
        alertX.setPositiveButton("yes"){dialog,which ->
            Toast.makeText(applicationContext, "Reset", Toast.LENGTH_SHORT).show()
        }.setNegativeButton("no"){dialog, which ->
            //no
        }
        alertX.show()
    }
    fun alertO(){
        var alertO= AlertDialog.Builder(this)
        alertO.setTitle("O wins!!!")
        alertO.setMessage("O wins!! play again?")
        alertO.setPositiveButton("yes"){dialog,which ->
            Toast.makeText(applicationContext, "Reset", Toast.LENGTH_SHORT).show()
        }.setNegativeButton("no"){dialog, which->
            //no
        }
        alertO.show()
    }
    fun disableButtons(){
        b1.isEnabled=false
        b2.isEnabled=false
        b3.isEnabled=false
        b4.isEnabled=false
        b5.isEnabled=false
        b6.isEnabled=false
        b7.isEnabled=false
        b8.isEnabled=false
        b9.isEnabled=false
    }

}