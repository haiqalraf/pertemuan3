package com.ravesian.pertemuan3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val image: String = "",
    val name: String = "",
    val age: Int = 0,
): Parcelable
