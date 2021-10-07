package com.faridnia.imageloadingsample.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Result(
    val blur_hash: String = "",
    val color: String = "",
    val created_at: String = "",
    val description: String = "",
    val height: Int = 0,
    val id: String = "",
    val liked_by_user: Boolean = false,
    val likes: Int = 0,
    val links: Links = Links(),
    val urls: Urls = Urls(),
    val user: User = User(),
    val width: Int = 0
) : Parcelable