package id.asad.intentactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mobil(
    var merek : String,
    var kondisi : Boolean,
    var tahun : Int,
    var bahanBakar : String,
    var platNomor : String
) : Parcelable