package jp.techacademy.hideyuki.kotrlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human01 = Human("田中", 19, "")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human02 = Human("吉田",11,"テニス")

        human01.say()
        human02.think()
    }
}