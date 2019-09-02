package kr.jell.fastcampus.kotlin.mystudy.step1

import kr.jell.fastcampus.kotlin.mystudy.TestClass
import java.util.*

class AnyTest(p: (Any) -> Unit): TestClass(p) {
    override fun doTest() {

        var everybody: Any
        everybody = 1111
        everybody = "문자열테스트"
        everybody = 221.01010
        everybody = 12.00f

        if (everybody !is String) { // is는 자료형을 판별해주는 구호. 자바의 instanceof와 비슷하다.
            if (everybody is Float) {
                println("float입니다.")
            }
        }

        //    everybody = null // 얘는 안됨. 옵셔널을 넣던지..

        println(everybody == 12.00f)
        println(everybody.equals(12.00f))

        allPrint(123123123)
        allPrint("Hi")
        allPrint(Date())

        // Unit형은 값이 없음을 정의하는 형
        var pFunc: (Unit) -> Unit = {println(it)} // 입력값에는 없으면 그냥 지워도 됨. var pFunc: () -> Unit 처럼... 또한 it은 매개변수가 하나일 떄 그걸 가리킴.
        // Nothing형은 미래가 없음을 알리는 형
        TODO("이거 구현해야 해요.. 일단 실행했으니 종료합니다.")

    }
    fun allPrint (a: Any) = println(a.toString())
}