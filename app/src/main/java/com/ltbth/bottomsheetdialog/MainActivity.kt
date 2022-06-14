package com.ltbth.bottomsheetdialog

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btn)
        button.setOnClickListener {
            openBottomSheetDialog()
        }
    }

    private fun openBottomSheetDialog() {
        val view: View = layoutInflater.inflate(R.layout.bottom_sheet,null)
        val bottomSheetDialog = BottomSheetDialog(this@MainActivity)
        bottomSheetDialog.setContentView(view)
        bottomSheetDialog.show()
//        bottomSheetDialog.setCancelable(false)

        val buttonCancel: Button = view.findViewById(R.id.btn_cancel)
        val buttonPayment: Button = view.findViewById(R.id.btn_payment)
        buttonCancel.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        buttonPayment.setOnClickListener {
            Toast.makeText(this@MainActivity,"Click payment",Toast.LENGTH_SHORT).show()
        }
    }
}