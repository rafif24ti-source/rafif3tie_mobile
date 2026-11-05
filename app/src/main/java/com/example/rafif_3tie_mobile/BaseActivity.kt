package com.example.rafif_3tie_mobile

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.rafif_3tie_mobile.Home.HomeFragment
import com.example.rafif_3tie_mobile.Message.MessageFragment
import com.example.rafif_3tie_mobile.More.MoreFragment
import com.example.rafif_3tie_mobile.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        // Inisialisasi ViewBinding (dari activity_base.xml)
        binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur tampilan agar menyesuaikan system bars
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars()
            )

            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )

            insets
        }

        // Menampilkan HomeFragment saat pertama kali dibuka
        if (savedInstanceState == null) {
            replaceFragment(HomeFragment())
        }

        // Klik Bottom Navigation (id: bottom_nav_view)
        binding.bottomNavView.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.home -> {
                    Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show()
                    replaceFragment(HomeFragment())
                    true
                }

                R.id.message -> {
                    Toast.makeText(this, "Message Clicked", Toast.LENGTH_SHORT).show()
                    replaceFragment(MessageFragment())
                    true
                }

                R.id.more -> {
                    Toast.makeText(this, "More Clicked", Toast.LENGTH_SHORT).show()
                    replaceFragment(MoreFragment())
                    true
                }

                else -> false
            }
        }
    }

    // Mengganti Fragment di FrameLayout (id: fragment_container)
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .commit()
    }
}