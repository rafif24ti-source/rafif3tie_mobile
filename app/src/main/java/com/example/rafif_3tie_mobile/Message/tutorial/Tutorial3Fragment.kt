
package com.example.rafif_3tie_mobile.Home.pertemuan_11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.rafif_3tie_mobile.R
import com.example.rafif_3tie_mobile.databinding.FragmentTutorial3Binding

class Tutorial3Fragment : Fragment() {

    private var _binding: FragmentTutorial3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTutorial3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTitle.text = "Nikmati Pengalaman Belanja"
        binding.tvDescription.text =
            "Dapatkan pengalaman berbelanja yang praktis, nyaman, dan menyenangkan kapan saja."

        binding.ivLogo.setImageResource(R.drawable.ic_favorite)

        binding.root.setBackgroundColor(
            android.graphics.Color.rgb(235, 250, 240)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
