package ru.bookify.network.getReadContent.dto

import com.bluelinelabs.logansquare.annotation.JsonObject

open class ContentDto(var type: Int) {
    companion object {
        const val TYPE_UNKNOWN = -1
        const val TYPE_TEXT = 0
        const val TYPE_IMAGE = 1
        const val TYPE_EXTRA_LINK = 2
    }
}