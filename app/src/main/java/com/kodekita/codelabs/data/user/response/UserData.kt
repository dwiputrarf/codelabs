package com.kodekita.codelabs.data.user.response

import com.google.gson.annotations.SerializedName
import com.kodekita.codelabs.domain.User
import com.kodekita.codelabs.utils.common.addSpace

data class UserData(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("first_name")
    val firstName: String?,
    @SerializedName("last_name")
    val lastName: String?,
    @SerializedName("avatar")
    val avatar: String?,
) {
    fun toUserData() = User(
        id = id,
        email = email.orEmpty(),
        username = firstName.orEmpty() + addSpace() + lastName.orEmpty(),
        avatar = avatar.orEmpty()
    )
}