// MainActivity.kt
package com.example.uigmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailList = listOf(
            EmailData("Edurila.com", "$19 Only (First 10 spots)", "Are you looking to Learn Web Design...", "12:34 PM"),
            EmailData("Chris Abad", "Help make Campaign Monitor better", "Let us know your thoughts! No Images...", "11:22 AM"),
            EmailData("Tuto.com", "8h de formation gratuite et les nouvea...", "Photoshop, SEO, Blender, CSS, WordPre...", "11:04 AM"),
            EmailData("support", "Société Ovh : suivi de vos services - h...", "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM"),
            EmailData("Matt from Ionic", "The New Ionic Creator Is Here!", "Announcing the all-new Creator, build...", "9:40 AM")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}
