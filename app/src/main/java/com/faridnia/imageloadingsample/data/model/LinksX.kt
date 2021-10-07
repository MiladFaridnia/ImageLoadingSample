package com.faridnia.imageloadingsample.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LinksX(
    val html: String = "",
    val likes: String = "",
    val photos: String = "",
    val self: String = ""
) : Parcelable