package com.example.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val btn_signup = findViewById<Button>(R.id.btn_signup)
        val ed_name = findViewById<EditText>(R.id.edit_name)
        val ed_id = findViewById<EditText>(R.id.edit_id2)
        val ed_pass = findViewById<EditText>(R.id.edit_Password2)
        val name = ed_name.text.toString()
        val id = ed_id.text.toString()
        val pass = ed_pass.text.toString()
        btn_signup.setOnClickListener {
            if (ed_name.text.toString().isNotEmpty() && ed_id.text.toString().isNotEmpty() && ed_pass.text.toString().isNotEmpty()) {
                finish()
            } else {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다", Toast.LENGTH_SHORT).show()
            }


//            val edit_name = findViewById<EditText>(R.id.edit_name)
//            val edit_id = findViewById<EditText>(R.id.edit_id2)
//            val edit_age = findViewById<EditText>(R.id.edit_age)
//            val edit_mbti = findViewById<EditText>(R.id.edit_mbti)
//            val iddata = edit_name.text.toString()
//            val namedata = edit_id.text.toString()
//            val agedata = edit_age.text.toString()
//            val mbtidata = edit_mbti.text.toString()
//            val intent = Intent(this, HomeActivity::class.java)
//            intent.putExtra("dataFromName",iddata)
//            intent.putExtra("dataFromSignUpActivity2",namedata)
//            intent.putExtra("dataFromSignUpActivity3",agedata)
//            intent.putExtra("dataFromSignUpActivity4",mbtidata)

//            finish()

        }
    }
}