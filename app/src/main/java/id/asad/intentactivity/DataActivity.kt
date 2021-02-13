package id.asad.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        // terima data dari MainActivity
        val nama = intent.getStringExtra("NAMA")
        val umur = intent.getIntExtra("UMUR", 0)

        tv_nama.text = nama
        tv_umur.text = umur.toString()
    }
}