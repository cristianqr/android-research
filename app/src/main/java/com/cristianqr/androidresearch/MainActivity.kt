package com.cristianqr.androidresearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeGreeting.setOnClickListener {
            helloWorld.text = "Hello CristianQR!"
        }

        openSheet.setOnClickListener {
            var bottomSheet = BottomSheet(R.layout.botton_sheet_layout)
            bottomSheet.show(supportFragmentManager, "TAG")
        }
    }
}
