package com.example.portfolio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BlogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        val posts = listOf(
            Post("Learning Git", "Today I learned how to use branches and merge them."),
            Post("My first Android app", "I built a small portfolio app with Kotlin."),
            Post("Pull requests", "I opened my first pull request on GitHub.")
        )

        val rvPosts = findViewById<RecyclerView>(R.id.rvPosts)
        rvPosts.layoutManager = LinearLayoutManager(this)
        rvPosts.adapter = PostAdapter(posts)
    }
}
