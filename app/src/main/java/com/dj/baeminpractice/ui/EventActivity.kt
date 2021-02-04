package com.dj.baeminpractice.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dj.baeminpractice.MainActivity
import com.dj.baeminpractice.R
import kotlinx.android.synthetic.main.activity_event.*
import kotlinx.android.synthetic.main.activity_main.*

class EventActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)

        iv_close.setOnClickListener {
            finish()
        }
    }
}