package com.aboubakergb.foodapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Food (
    val foodImg : Int ,
    val foodName : String ,
    val foodDesc : String
) : Parcelable
