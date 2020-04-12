package com.lan.kotlinextention

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Kepala = findViewById(R.id.Kepala) as LinearLayout
        var Baju = findViewById(R.id.Baju) as LinearLayout
        var TanganKiri = findViewById(R.id.TanganKiri) as LinearLayout
        var TanganKanan = findViewById(R.id.TanganKanan) as LinearLayout


        Kepala.setOnClickListener {
            toast("Ini Adalah Kepala")
        }
        Baju.setOnClickListener {
            toast("Bajunya Warna Merah")
        }
        TanganKanan.setOnClickListener {
            toast("Ini Adalah Tangan Kanan")
        }
        TanganKiri.setOnClickListener {
            toast("Ini Adalah Tangan Kiri")
        }
    }
}

