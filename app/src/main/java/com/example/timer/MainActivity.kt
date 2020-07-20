package com.example.timer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private var mTimer:Timer? =null
    private var mTimerSec =0.0
    private var mHandler =Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTimer = Timer()
        mTimer!!.schedule(object :TimerTask(){
            override fun run() {
                mTimerSec +=0.1
                mHandler.post {
                    timer.text = String.format("%.1f",mTimerSec)
                }

            }
        },100,100)
    }
}
