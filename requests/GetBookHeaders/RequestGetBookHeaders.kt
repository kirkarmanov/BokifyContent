package ru.bookify.network.getBookHeaders

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import ru.bookify.network.base.BaseRequestObject
import ru.bookify.network.dto.Part

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class RequestGetBookHeaders(userId: String = "") : BaseRequestObject(TYPE, userId) {
    companion object {
        const val TYPE = "GetBookHeaders"
    }
}


