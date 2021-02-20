package id.asad.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_object.*

class ObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object)

        // terima data
        val mobil = intent.getParcelableExtra<Mobil>("MOBIL")

        // tampilkan
        tv_merek.text = mobil?.merek
        if (mobil?.kondisi == true){
            tv_kondisi.text = "Baru"
        }
        else{
            tv_kondisi.text = "Bekas"
        }
        tv_tahun.text = mobil?.tahun.toString()
        tv_bahan_bakar.text = mobil?.bahanBakar
        tv_plat_nomor.text = mobil?.platNomor

    }
}