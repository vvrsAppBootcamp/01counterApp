package com.wolf.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var upCnt: Button = findViewById(R.id.countUp)
        var dwnCnt: Button = findViewById(R.id.countDown)
        var resetBtn: Button = findViewById(R.id.rst)
        upCnt.setOnClickListener {
            incTV(it)
        }
        dwnCnt.setOnClickListener {
            decTV(it)
        }
        resetBtn.setOnClickListener {
            rstCnt(it)
        }
    }

    private fun decTV(view: View) {
        var curTV: TextView = findViewById(R.id.curVal)
//        Toast.makeText(this, curTV.text.toString(), Toast.LENGTH_SHORT).show()
        var curVal = Integer.parseInt(curTV.text.toString())
        curVal--
        curTV.text = Integer(curVal).toString()
    }

    private fun incTV(view: View) {
        var curTV: TextView = findViewById(R.id.curVal)
        var curVal = Integer.parseInt(curTV.text.toString())
        curVal++
        curTV.text = Integer(curVal).toString()
    }

    private fun rstCnt(view: View) {
        var curTV: TextView = findViewById(R.id.curVal)
        curTV.text = "0"
    }


}