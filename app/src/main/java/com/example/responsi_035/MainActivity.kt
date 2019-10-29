package com.example.responsi_035


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.app.Dialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val username = findViewById<EditText>(R.id.user)
        val passw = findViewById<EditText>(R.id.pass)
        val login = findViewById<Button>(R.id.log_btn)

        val dialog = Dialog(this@MainActivity)
        dialog.setContentView(R.layout.dialoge)

        log_btn.setOnClickListener() {

            val nama_o = intent.getStringExtra("nama")
            val nim_o = intent.getStringExtra("nim")
            val kls_o = intent.getStringExtra("kls")
            val user_from = intent.getStringExtra("user")
            val pass_from = intent.getStringExtra("pass")
            val email_o = intent.getStringExtra("email")
            val user_o = user.text.toString()
            val pass_o = pass.text.toString()
            val nam="Dimas Eko Saputro"
            val ni="5170411035"
            val kl="teknik Informatika"
            val usr="dimas"
            val emel="dimasexsap@gmail.com"

            if(user_o==user_from && pass_o==pass_from){

                intent = Intent(this, Main2Activity_login::class.java)
                intent.putExtra("nama",nama_o)
                intent.putExtra("user",user_o)
                intent.putExtra("email",email_o)
                intent.putExtra("pass",pass_o)
                startActivity(intent)
            }
            else if(user_o=="dimas" && pass_o=="dimas135"){
                intent = Intent(this, Main2Activity_login::class.java)
                intent.putExtra("nama",nam)
                intent.putExtra("nim",ni)
                intent.putExtra("kls",kl)
                intent.putExtra("user",usr)
                intent.putExtra("email",emel)
                startActivity(intent)
            }
            else{
                val text = dialog.findViewById(R.id.dialog) as TextView
                text.text = "Login yang anda lakukan salah, Silahkan ulangi kembali"
                dialog.show()
            }
        }

        reg_btn.setOnClickListener() {

            intent = Intent(this, Main3Activity_register::class.java)

            startActivity(intent)
        }
    }
}