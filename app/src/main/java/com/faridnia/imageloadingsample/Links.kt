package com.faridnia.imageloadingsample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Links(
    val download: String = "",
    val html: String = "",
    val self: String = ""
) : Parcelable