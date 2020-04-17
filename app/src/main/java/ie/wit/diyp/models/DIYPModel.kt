package ie.wit.diyp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DIYPModel(var id: Long = 0,
                     val orderMethod: String = "N/A",
                     val amount: Int = 0) : Parcelable