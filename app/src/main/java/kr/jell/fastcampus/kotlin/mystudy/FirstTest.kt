package kr.jell.fastcampus.kotlin.mystudy

class FirstTest (p: (Any) -> Unit) : TestClass(p) {
    override fun doTest() {
        println("Hi")
    }
}