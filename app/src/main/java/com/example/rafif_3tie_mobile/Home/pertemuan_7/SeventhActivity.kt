package com.example.rafif_3tie_mobile.Home.pertemuan_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.rafif_3tie_mobile.databinding.ActivitySeventhBinding

class SeventhActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeventhBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeventhBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarSeventh.setNavigationOnClickListener {
            finish()
        }

        // Fragment pertama ditampilkan saat Activity dibuka
        if (savedInstanceState == null) {
            replaceFragment(SatuFragment())
        }

        // Tombol Fragment 1
        binding.btnFragment1.setOnClickListener {
            replaceFragment(SatuFragment())
        }

        // Tombol Fragment 2
        binding.btnFragment2.setOnClickListener {
            replaceFragment(DuaFragment())
        }

        // Tombol Fragment 3
        binding.btnFragment3.setOnClickListener {
            replaceFragment(TigaFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .commit()
    }
}