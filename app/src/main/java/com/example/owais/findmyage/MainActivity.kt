package com.example.owais.findmyage

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonFindMyAge.setOnClickListener {
            //input
            var yearOfBirth:Int = editTextFindMyAge.text.toString().toInt()
            //process
            var currentYear = Calendar.getInstance().get(Calendar.YEAR)
            var age = currentYear - yearOfBirth
            //output
            textViewFindMyAge.text = "your age is $age";
        }
    }
}
