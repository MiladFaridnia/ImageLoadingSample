package com.faridnia.imageloadingsample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashSearchResult(
    val results: List<Result> = listOf(),
    val total: Int = 0,
    val total_pages: Int = 0
) : Parcelable