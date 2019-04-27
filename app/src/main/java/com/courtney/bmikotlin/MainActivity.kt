package com.courtney.bmikotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_bmi.setOnClickListener {
            val weight = edt_weight.text.toString().toFloat()
            val height = edt_height.text.toString().toFloat()
            val bmi = weight / (height * height)
            Log.d(TAG, "bmi: $bmi")
            Toast.makeText(this, getString(R.string.bmi_is, bmi.toString()), Toast.LENGTH_LONG).show()
            AlertDialog.Builder(this)
                .setTitle(getString(R.string.result_title))
                .setMessage(getString(R.string.bmi_is, bmi.toString()))
                .setPositiveButton(getString(R.string.ok), null)
                .show()
        }
    }
}
