package com.sg.post11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        backgroundImage.load(R.drawable.struggle)

    }
}