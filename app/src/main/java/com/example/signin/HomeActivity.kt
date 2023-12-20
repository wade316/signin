package com.example.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val iddata = intent.getStringExtra("HomeId").toString()
//        val namedata = intent.getStringExtra("dataFromSignUpActivity2")
//        val agedata = intent.getStringExtra("dataFromSignUpActivity3")
//        val mbtidata = intent.getStringExtra("dataFromSignUpActivity4")
        val idText = findViewById<TextView>(R.id.tv_id)
//        val nameText = findViewById<TextView>(R.id.tv_name)
//        val ageText = findViewById<TextView>(R.id.tv_age)
//        val mbtiText = findViewById<TextView>(R.id.tv_mbti)
        idText.setText(iddata)
//        nameText.setText(namedata)
//        ageText.setText(agedata)
//        mbtiText.setText(mbtidata)

        val btn_close = findViewById<Button>(R.id.btn_close)
        btn_close.setOnClickListener {
            finish()
        }
    }
}


//fun onButtonClicked(v: View) {
//    Toast.makeText(this, "시작버튼이 눌렸어요", Toast.LENGTH_SHORT).show()
//}
