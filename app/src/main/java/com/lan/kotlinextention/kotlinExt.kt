package com.lan.kotlinextention

import android.content.Context
import android.text.Layout
import android.view.Gravity
import android.widget.Toast

fun Context.toast(konten : String , x: Int, y: Int){
    var toasta = Toast.makeText(this,konten, Toast.LENGTH_SHORT)
    toasta.setGravity(Gravity.NO_GRAVITY, x,y)
    toasta.show()
}
