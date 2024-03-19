package com.example.librarytutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val imageUrl = "https://recoverit.wondershare.com/uploads/image-8-1.jpg"

        Glide.with(this).load(imageUrl).into(imageView)
    }
}