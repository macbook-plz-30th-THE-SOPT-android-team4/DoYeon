package com.doyeon.soptseminar.util

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.doyeon.soptseminar.ui.signup.SignUpActivity

fun Context.showShortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.moveToActivity(targetActivity: Class<SignUpActivity>) {
    startActivity(Intent(this, targetActivity))
}
