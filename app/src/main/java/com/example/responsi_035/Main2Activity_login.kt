package com.example.responsi_035

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2_login.*

class Main2Activity_login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2_login)

        //val intent = intent
        val nama_o = intent.getStringExtra("nama")
        val nim_o = intent.getStringExtra("nim")
        val kls_o = intent.getStringExtra("kls")
        val user_o = intent.getStringExtra("user")
        val email_o = intent.getStringExtra("email")

        val nam = intent.getStringExtra("nama")
        val ni = intent.getStringExtra("nim")
        val kl = intent.getStringExtra("kls")
        val usr = intent.getStringExtra("user")
        val emel = intent.getStringExtra("email")


        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "Nama : "+nama_o+"\nNim : "+nim_o+"\nProdi : "+kls_o+"\nUser name: "+user_o+"\nE-mail: "+email_o

        back_btn.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
