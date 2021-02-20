package id.asad.intentactivity

import android.content.Intent
import android.net.Uri
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


        btn_result_activity.setOnClickListener {

            val intent = Intent(this@MainActivity, ResultActivity::class.java)
            startActivityForResult(intent, 100)
        }

        btn_to_dial_phone.setOnClickListener {

            val telp = "01234566789"

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$telp")
            startActivity(intent)
        }

        btn_to_sms.setOnClickListener {

            val telp = "01234566789"
            val text = "Halo, ada yang bisa dibantu?"

            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("sms:$telp")
            intent.putExtra("sms_body", text)
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 100){
            if(resultCode == 200){

                val data = data?.getStringExtra("RESULT")
                tv_data_from_result.text = data
            }
        }
    }
}

// key & value

// pengirim = key & value
// penerima = key u/ value

// Intent
// Intent Explicit -> jelas tujuannya
// Intent Implicit -> belum jelas tujuannya