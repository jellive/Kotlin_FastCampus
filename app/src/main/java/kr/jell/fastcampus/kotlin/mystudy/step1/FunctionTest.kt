package kr.jell.fastcampus.kotlin.mystudy.step1

import kr.jell.fastcampus.kotlin.mystudy.TestClass

class FunctionTest(p: (Any) -> Unit): TestClass(p) {
    override fun doTest() {
        fun three(n: Int) = 3 * n
        println(three(3).toString())

        funByNoParam()
        funByParameter(31, " 숫자입니다.")
        println(funByReturn("Parameter"))
        println(funByInline(31, 10))

        funcVar("Function Variable 1")
        println(funcVarType("Function Variable 2"))

        higherFunc({ println("Higher Function") })
        higherFunc(::funByNoParam)
    }


    fun funByReturn(s: String): Any? {
        return s
    }

    fun funByParameter(i: Int, s: String) {
        println(i.toString() + s)
    }

    fun funByInline(i: Int, i1: Int) = i * i1

    fun funByNoParam() {
        println("funByNoParam")
    }

    fun higherFunc(f: () -> Unit) { // 고차함수. 파라미터를 함수로 받고, 결과값을 함수로 내보내는 함수.
        f()
    }

    // 함수를 정의한 변수
    val funcVar = { s: String -> println(s) }
    var funcVarType: (String) -> Any? = ::funByReturn // 콜론 두 개는 함수 주소값을 넘기겠다는 의미. 포인터와 같은 의미임.
}