package com.lan.kotlinextention

import android.content.Context
import android.text.Layout
import android.widget.Toast

fun Context.toast(konten : String){
    Toast.makeText(this,konten, Toast.LENGTH_SHORT).show()
}
