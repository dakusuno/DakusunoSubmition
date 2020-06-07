package com.dakusuno.dakusunosubmition.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Fruit(
    val name: String,
    val look: String,
    val store: String,
    val img: String
): Parcelable