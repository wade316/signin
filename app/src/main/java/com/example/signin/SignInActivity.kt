package com.example.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)

        val btn_up = findViewById<Button>(R.id.btn_up)
        btn_up.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        val edit_id = findViewById<EditText>(R.id.edit_mainid)
        val edit_pass = findViewById<EditText>(R.id.edit_mainPass)
        val iddata: Boolean = edit_id.text.toString().isEmpty()
        val passdata = edit_pass.text
        val btn_signin = findViewById<Button>(R.id.btn_in)


        btn_signin.setOnClickListener {
            Log.d("log", "iddata = ${edit_id.text.toString()}")
            Log.d("log", "passdata = ${edit_pass.text.toString()}")

            Log.d("log", "iddata isempty = ${iddata}")
            Log.d("log", "passdata = $passdata")
            if (edit_id.text.toString().isNotEmpty() && edit_pass.text.toString().isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                Toast.makeText(this, getString(R.string.signin), Toast.LENGTH_SHORT).show()
//컨택스트는 띄울 액티비티
                intent.putExtra("HomeId", edit_id.text.toString())
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()


            }
        }

//인텐트는 출발지와 도착지 를 적는다

    }
}
