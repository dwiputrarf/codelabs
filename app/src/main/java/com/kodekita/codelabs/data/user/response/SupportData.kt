package com.kodekita.codelabs.data.user.response

import com.google.gson.annotations.SerializedName

data class SupportData(
    @SerializedName("url")
    val url: String?,
    @SerializedName("text")
    val text: String?,
)