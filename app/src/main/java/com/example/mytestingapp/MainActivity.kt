package com.example.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tvText: TextView
    private lateinit var btnSetValue: Button

    private var name = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSetValue = findViewById(R.id.btnSetValue)
        tvText = findViewById(R.id.tvText)

        btnSetValue.setOnClickListener(this)

        name.add("Wahyu")
        name.add("Udin")
        name.add("Ganteng")
    }

    override fun onClick(p0: View?) {
        if(p0?.id == R.id.btnSetValue){
            Log.d("MainActivity", name.toString())
            val name = StringBuilder()
            for (i in this.name){
                name.append(i).append("\n")
            }
            tvText.text = name.toString()
        }
    }
}
