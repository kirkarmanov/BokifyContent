package ru.bookify.network.getBooks

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import ru.bookify.network.base.BaseRequestObject

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class RequestGetBooks(userId: String = "") : BaseRequestObject(TYPE, userId) {
    companion object {
        private const val TYPE = "GetBooks"
    }
}