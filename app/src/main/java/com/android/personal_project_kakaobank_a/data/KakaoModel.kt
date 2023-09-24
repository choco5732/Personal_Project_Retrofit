package com.android.personal_project_kakaobank_a.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class KakaoModel(
    val id: Long? = -1,
    val thumbnail_url: String,
    val displaySiteName: String,
    val dateTime: String,
    var isAdd: Boolean
) : Parcelable
