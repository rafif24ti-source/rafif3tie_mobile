package com.example.rafif_3tie_mobile.Message

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.bumptech.glide.Glide
import com.example.rafif_3tie_mobile.databinding.ItemMessageBinding
import com.google.android.material.snackbar.Snackbar

class MessageAdapter(
    context: Context,
    private val messages: List<MessageModel>
) : ArrayAdapter<MessageModel>(context, 0, messages) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: ItemMessageBinding =
            ItemMessageBinding.inflate(LayoutInflater.from(context), parent, false)
        val view = binding.root
        val message = messages[position]

        // Muat gambar dari URL dengan Glide
        Glide.with(context)
            .load(message.avatarUrl)
            .into(binding.avatarImg)

        binding.textSender.text = message.senderName
        binding.textMessage.text = message.messageText

        // Event onClick diterapkan di adapter
        view.setOnClickListener {
            Snackbar.make(
                parent,
                "Pesan dari ${message.senderName}: ${message.messageText}",
                Snackbar.LENGTH_SHORT
            ).show()
        }

        return view
    }
}