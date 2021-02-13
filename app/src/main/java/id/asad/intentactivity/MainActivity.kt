package id.asad.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_move_activity.setOnClickListener {

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

        btn_data_activity.setOnClickListener {

            val nama = edt_nama.text.toString()
            val umur = edt_umur.text.toString().toInt()

            val intent = Intent(this@MainActivity, DataActivity::class.java)
            intent.putExtra("NAMA", nama)
            intent.putExtra("UMUR", umur)
            startActivity(intent)
        }

        btn_object_activity.setOnClickListener {

            // ambil data dari user
            val merek = edt_merek.text.toString()
            val kondisi : Boolean
            if (rb_baru.isChecked){
                kondisi = true
            }else{
                kondisi = false
            }
            val tahun = edt_tahun.text.toString().toInt()
            val bahanBakar = edt_bahan_bakar.text.toString()
            val platNomor = edt_plat_nomor.text.toString()

            // jadikan object
            val mobil = Mobil(merek, kondisi, tahun, bahanBakar, platNomor)

            val intent = Intent(this@MainActivity, ObjectActivity::class.java)
            intent.putExtra("MOBIL", mobil)
            startActivity(intent)

        }
    }
}

// key & value

// pengirim = key & value
// penerima = key u/ value