package com.kodekita.codelabs.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val id: Int?,
    val email: String,
    val username: String,
    val avatar: String,
) : Parcelable