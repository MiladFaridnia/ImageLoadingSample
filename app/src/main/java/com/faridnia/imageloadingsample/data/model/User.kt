package com.faridnia.imageloadingsample.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val first_name: String = "",
    val id: String = "",
    val instagram_username: String = "",
    val last_name: String = "",
    val links: LinksX = LinksX(),
    val name: String = "",
    val portfolio_url: String = "",
    val profile_image: ProfileImage = ProfileImage(),
    val twitter_username: String = "",
    val username: String = ""
) : Parcelable {
    val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearchApp&utm_medium=referral"

}