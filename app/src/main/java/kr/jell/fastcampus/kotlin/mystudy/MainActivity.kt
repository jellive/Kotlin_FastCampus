package kr.jell.fastcampus.kotlin.mystudy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.jell.fastcampus.kotlin.mystudy.step1.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 우리가 만든 예제들을 이곳에서 실행시킨다.
//        doTest(FirstTest(::WriteLn))
//        doTest(NumberTest(::WriteLn))
//        doTest(StringTest(::WriteLn))
//        doTest(AnyTest(::WriteLn))
//        doTest(FunctionTest(::WriteLn))
//        doTest(ConditionTest(::WriteLn))
        doTest(LabelTest(::WriteLn))
    }

    private fun doTest(o: TestClass) {
        o.doTest()
    }

    fun WriteLn(any: Any) {
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }
}
