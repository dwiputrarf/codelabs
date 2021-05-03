package com.kodekita.codelabs.local.user

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val id: Int?,
    val email: String,
    val username: String,
    val avatar: String,
) : Parcelable