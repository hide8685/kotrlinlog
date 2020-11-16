package jp.techacademy.hideyuki.kotrlinlog

import android.util.Log

open class Human: Animal,Thinkable {
    // 引数付きコンストラクタ
    var hobby : String
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }


    //私の名前は〜〜です。年は〜〜歳です。
    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name + "です。" + this.age + "歳です。")
    }
    //「私は〜〜について考える。」
    override fun think() {
        Log.d("kotlintest", "私は"+this.hobby + "について考える。")
    }
}
