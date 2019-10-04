package com.example.setonclicklistenerr

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isOn = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            isOn = !isOn
            var color = if (isOn) Color.argb(255,0,255,0) else Color.argb(255,255,0,0)
            button.setBackgroundColor(color)
            button.text = if(isOn) "ON" else "OFF"
        }
    }
}
