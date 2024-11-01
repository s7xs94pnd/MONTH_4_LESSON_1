package com.example.month_4_lesson_1.ui.classes

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AcData(
    val name: String,
    val email: String,
    var password: Int
) : Parcelable