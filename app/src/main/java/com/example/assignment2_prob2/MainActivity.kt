package com.example.assignment2_prob2

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.first_text)

        val text = "Sign in to Zappos.com using yout Amazon account"
        val spannable = SpannableString(text)

        // Find the start and end index of the word "world"
        val startIndex = text.indexOf("Zappos.com")
        val endIndex = startIndex + "Zappos.com".length

        // Apply bold style to the word "world"
        spannable.setSpan(StyleSpan(Typeface.BOLD), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Set the styled text to the TextView
        textView.text = spannable
    }
}