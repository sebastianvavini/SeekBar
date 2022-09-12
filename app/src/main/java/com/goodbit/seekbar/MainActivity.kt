package com.goodbit.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar

import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var slider: SeekBar
    lateinit var value: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        slider= findViewById(R.id.sb_slider) as SeekBar
        value= findViewById(R.id.tv_result) as TextView

        slider.max=50

        slider.setOnSeekBarChangeListener(object  :   SeekBar.OnSeekBarChangeListener   {

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
               value.text=progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

    }
}