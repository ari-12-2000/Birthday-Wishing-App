package com.arikum12000.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday.*

class BirthdayActivity : AppCompatActivity() {

    companion  object{
        const val NAME_EXTRA = "name" //companion object is like static variables
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        val name = intent.getStringExtra(NAME_EXTRA)
        textView5.text="Happy Birthday\n$name"
    }

}