
package com.example.rafif_3tie_mobile.Home.pertemuan_11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.rafif_3tie_mobile.databinding.FragmentTutorial1Binding

class Tutorial1Fragment : Fragment() {

    private var _binding: FragmentTutorial1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTutorial1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTitle.text = "Selamat Datang!"
        binding.tvDescription.text =
            "Temukan berbagai produk menarik dengan mudah dan cepat melalui aplikasi kami."

        binding.ivLogo.setImageResource(
            com.example.rafif_3tie_mobile.R.drawable.ic_home
        )

        binding.root.setBackgroundColor(
            android.graphics.Color.rgb(232, 243, 255)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
