package com.example.hhh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hhh.databinding.ActivityMainBinding
import com.example.hhh.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    lateinit var activity1: ActivityMainBinding //Превратили xml в класс


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity1 = ActivityMainBinding.inflate(layoutInflater) //Поместили класс в память
        val rnd = (0..10).random()

        setContentView(activity1.root)//соединяем с активити

        //--------------- 3 дз ---------------
        activity1.buttonChangeTT.setOnClickListener {
            val titleInp = activity1.titleInput.text.toString()
            val textInp = activity1.textInput.text.toString()

            if(titleInp != "") activity1.titleOutput.text = titleInp
            else activity1.titleOutput.text = "EMPTY"

            if(textInp != "")  activity1.textOutput.text = textInp
            else activity1.textOutput.text = "EMPTY"

            activity1.titleOutput.visibility = View.VISIBLE
            activity1.textOutput.visibility = View.VISIBLE
        }

        //--------------- 3 дз ---------------


        var counter = 0
        val num = activity1.tv1
        val btn1 = activity1.button
        val btn2 = activity1.button2

        btn1.setOnClickListener {
            counter -= 1
            num.text = counter.toString()
        }

        btn2.setOnClickListener {
            counter += 1
            num.text = counter.toString()
        }

    }

    fun onClickGoSecondAct (view : View){
        val intentToSecondAct = Intent(this, SecondActivity::class.java)//создали сообщение
        startActivity(intentToSecondAct)
    }
}























//package com.example.hhh
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
//
//class MainActivity : AppCompatActivity() {
//    lateinit var num : TextView
//    lateinit var btn1 : Button
//    lateinit var btn2 : Button
//
//    var counter = 0
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        num = findViewById(R.id.tv1)
//
//        btn1 = findViewById(R.id.button)
//        btn1.setOnClickListener {
//            counter -= 1
//            num.text = counter.toString()
//        }
//
//        btn2 = findViewById(R.id.button2)
//        btn2.setOnClickListener {
//            counter += 1
//            num.text = counter.toString()
//        }
//    }
//}
