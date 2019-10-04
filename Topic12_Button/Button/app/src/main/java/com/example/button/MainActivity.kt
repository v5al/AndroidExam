package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isOn = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ON_OFF(v:View){
        isOn = !isOn
        Toast.makeText(this,"${isOn}",Toast.LENGTH_LONG).show()
        textView.text = if(isOn) "ON" else "OFF"
    }
}
