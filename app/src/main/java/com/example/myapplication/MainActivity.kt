package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll)
        //Listener que hace que cuando escuche el boton Clic llame al metodo rollDado
        rollButton.setOnClickListener {
            rollDado()
        }
    }

    // funcion para que el dado haga el roll
    private fun rollDado() {
        val dado = Dado(6)
        val dadoRoll = dado.roll()
        // Aqui cambiará el valor por pantalla entre 1 y 6
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = dadoRoll.toString()    }
}

    // una clase para decirle el numero de lados que tendra el dado y que haga un return entre el 1
    // y el numero de lados
    class Dado(val numSides : Int){
        fun roll(): Int{
            return (1..numSides).random()
        }
    }
