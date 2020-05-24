package kr.co.tjoeun.androidbasic01_intent_20200524

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        okBtn.setOnClickLister{

            val inputNickName = nickNameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra(name:"nick",inputNickName)

            setResult(Activity.RESULT_OK,resultIntent)

            finish()


        }
    }
}
