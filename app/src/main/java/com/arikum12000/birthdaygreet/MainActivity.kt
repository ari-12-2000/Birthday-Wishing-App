package com.arikum12000.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthDayCard(view: android.view.View) {
        /*val name= editTextTextPersonName.editableText.toString()
        Toast.makeText(this, "$name", Toast.LENGTH_LONG).show()
     Here after toast button click user's name will be  for some time */

        val name =editTextTextPersonName.editableText.toString()
        val intent= Intent(this, BirthdayActivity::class.java)
        intent.putExtra(BirthdayActivity.NAME_EXTRA, name)
        startActivity(intent)
    }

}