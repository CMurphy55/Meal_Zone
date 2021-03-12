package ie.wit.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TransferModel(var _id: String = "N/A",
                         val paymenttype: String = "N/A",
                         val amount: Int = 0,
                         val message: String = "a message") : Parcelable
