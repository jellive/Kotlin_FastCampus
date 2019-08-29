package kr.jell.fastcampus.kotlin.mystudy.step1

import kr.jell.fastcampus.kotlin.mystudy.TestClass
import java.util.*

class StringTest(p: (Any) -> Unit): TestClass(p){
    override fun doTest() {
        var sName = "박모씨"
        println(sName + " - The Gamer")
        var sLine = """
        1
        2
        3
        4
        5
        6
        7
    """

        println(sLine)

        var sFormatter = "$sName <-- sName의 값"
        println(sFormatter)

        var sBash = "${ "지금시각은 - " + Date()}"
        println(sBash)
    }
}