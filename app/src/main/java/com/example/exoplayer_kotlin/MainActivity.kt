package com.example.exoplayer_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val mp4Url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
    private val m3u8Url = "http://devimages.apple.com/iphone/samples/bipbop/bipbopall.m3u8"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMp4 = findViewById<Button>(R.id.btn_mp4)
        val btnM3u8 = findViewById<Button>(R.id.btn_m3u8)

        btnMp4.setOnClickListener {
            startPlayer(mp4Url)
        }

        btnM3u8.setOnClickListener {
            startPlayer(m3u8Url)
        }
    }

    private fun startPlayer(url: String) {
        val intent = Intent(this, VideoPlayerActivity::class.java)
        val bundle = Bundle()
        bundle.putString("videoUrl", url)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}