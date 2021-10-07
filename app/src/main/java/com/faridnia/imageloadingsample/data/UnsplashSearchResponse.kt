package com.faridnia.imageloadingsample.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashSearchResponse(
    val results: List<Result> = listOf(),
    val total: Int = 0,
    val total_pages: Int = 0
) : Parcelable