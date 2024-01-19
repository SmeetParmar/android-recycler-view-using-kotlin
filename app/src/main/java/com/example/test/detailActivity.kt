package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class detailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val firstName : TextView = findViewById(R.id.firstName);
        val lastName : TextView = findViewById(R.id.lastName);
        val email : TextView = findViewById(R.id.email);
        val age : TextView = findViewById(R.id.age);

        firstName.text = "First Name : "+intent.getStringExtra("firstName");
        lastName.text = "Last Name : "+intent.getStringExtra("lastName");
        email.text = "Email : "+intent.getStringExtra("email");
        age.text = "Age : "+intent.getIntExtra("age",0).toString();
    }
}