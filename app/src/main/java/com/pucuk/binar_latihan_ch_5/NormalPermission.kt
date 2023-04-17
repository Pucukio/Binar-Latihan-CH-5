package com.pucuk.binar_latihan_ch_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.pucuk.binar_latihan_ch_5.databinding.ActivityNormalPermissionBinding

class NormalPermission : AppCompatActivity() {
    lateinit var binding: ActivityNormalPermissionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNormalPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoadImg.setOnClickListener {
            Glide.with(this).load("https://images.glints.com/unsafe/1200x0/glints-dashboard.s3.amazonaws.com/company-logo/34c1b122c72cca526859e66cf01dc0d9.png")
                .circleCrop()
                .into(binding.ivImg)
        }

    }
}