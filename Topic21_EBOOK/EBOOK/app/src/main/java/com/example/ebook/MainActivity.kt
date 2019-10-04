package com.example.ebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var page = 1
    lateinit var frame:FrameLayout
    lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        frame = findViewById(R.id.frameLayout)
    }
    fun switchPage(v:View){
        image = frame.findViewWithTag(page.toString())
        image.visibility = View.INVISIBLE
        if(v==next) page+=1 else if(v==prev) page-=1 else page = if((select.text.toString().length>0) && (select.text.toString().toInt() <=3)) select.text.toString().toInt() else page
        if(page>3) page =1 else if(page<1) page=3
        image = frame.findViewWithTag(page.toString())
        image.visibility = View.VISIBLE
    }
}
