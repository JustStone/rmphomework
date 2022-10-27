package com.example.hhh

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hhh.databinding.ActivityMainBinding
import com.example.hhh.databinding.ActivitySecondBinding
import kotlin.random.Random.Default.nextInt

class SecondActivity : AppCompatActivity() {
    lateinit var activity2: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity2 = ActivitySecondBinding.inflate(layoutInflater)
        activity2.act2Tv1.setTextColor((Color.argb(255, nextInt(255), nextInt(255), nextInt(255))))
        activity2.root.setBackgroundColor(Color.argb(255, nextInt(255), nextInt(255), nextInt(255)));
        setContentView(activity2.root)
    }

    fun onClickGoMainAct (view : View){
        val intentToMainAct = Intent(this, MainActivity::class.java)//создали сообщение
        startActivity(intentToMainAct)
    }

}

