package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt : Button = view.findViewById(R.id.cancell);
        val submitbt : Button = view.findViewById(R.id.submitt);
        val radioGroup = view.findViewById<RadioGroup>(R.id.RadioGroupp)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(this,radioButton.text,Toast.LENGTH_SHORT).show()
             dismiss()
        }
    }

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
            inflater.inflate(R.menu.menu, menu)
            return super.onCreateOptionsMenu(menu)
        }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.mail -> {
                Toast.makeText(this, "contact selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.done -> {
                Toast.makeText(this, "done selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.email_contact -> {
                Toast.makeText(this, "mail selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.phone_contact -> {
                Toast.makeText(this, "phone selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}