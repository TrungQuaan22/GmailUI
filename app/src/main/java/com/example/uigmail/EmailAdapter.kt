// EmailAdapter.kt
package com.example.uigmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<EmailData>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvAvatar: TextView = itemView.findViewById(R.id.tvAvatar)
        val tvSender: TextView = itemView.findViewById(R.id.tvSender)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvContent: TextView = itemView.findViewById(R.id.tvContent)
        val tvTime: TextView = itemView.findViewById(R.id.tvTime)
        val ivStar: ImageView = itemView.findViewById(R.id.ivStar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.tvAvatar.text = email.sender.first().toString() // Lấy chữ cái đầu
        holder.tvSender.text = email.sender
        holder.tvTitle.text = email.title
        holder.tvContent.text = email.content
        holder.tvTime.text = email.time
    }

    override fun getItemCount() = emails.size
}
