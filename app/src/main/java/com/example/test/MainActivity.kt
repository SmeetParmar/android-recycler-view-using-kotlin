package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_activity);

        val peopleList = listOf(
            person("Smeet", "Parmar", "smeet@gmail.com",22),
            person("Ravi", "Chotaliya", "ravi@gmail.com",22),
            person("Aneri", "Patel", "aneri@gmail.com",22),
            person("Shubham", "Sheliya", "shubham@gmail.com",22)
        )

        var recyclerView = findViewById<RecyclerView>(R.id.customRecyclerView);
        recyclerView.layoutManager = LinearLayoutManager(this);

        val adapter =personAdapter(peopleList)
        recyclerView.adapter = adapter;

        }
    }