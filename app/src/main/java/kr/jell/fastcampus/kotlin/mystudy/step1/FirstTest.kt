package kr.jell.fastcampus.kotlin.mystudy.step1

import kr.jell.fastcampus.kotlin.mystudy.TestClass

class FirstTest (p: (Any) -> Unit) : TestClass(p) {
    override fun doTest() {
//        println("Hi")

        println("종결자(;)가 없어도 된다.")

        println("var는 읽기쓰기. val은 읽기 전용")
        var nCount: Int = 0
        nCount = 1
        var name = "psw"

        val age = 0
        // age++ 하는 순간 에러가 남.

        var MyMoney: Int? = null
        var message = "위에서는 액세스 불가함."
        println(hiMessage)
    }

    val hiMessage: String = "Hi"
}