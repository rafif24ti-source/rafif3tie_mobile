
package com.example.rafif_3tie_mobile.Home.pertemuan_11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.rafif_3tie_mobile.R
import com.example.rafif_3tie_mobile.databinding.FragmentTutorial2Binding

class Tutorial2Fragment : Fragment() {

    private var _binding: FragmentTutorial2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTutorial2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTitle.text = "Belanja Lebih Mudah"
        binding.tvDescription.text =
            "Jelajahi berbagai kategori produk dan pilih barang favorit sesuai kebutuhanmu."

        binding.ivLogo.setImageResource(R.drawable.ic_shopping_cart)

        binding.root.setBackgroundColor(
            android.graphics.Color.rgb(255, 241, 230)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
