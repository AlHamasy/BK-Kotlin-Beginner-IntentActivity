package id.asad.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        btn_send_to_main_activity.setOnClickListener {

            val data = edt_input_data.text.toString()

            val intent = Intent()
            intent.putExtra("RESULT", data)
            setResult(200, intent)
            finish()
        }
    }
}