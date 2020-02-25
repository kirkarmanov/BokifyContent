package ru.bookify.network.base

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
open class BaseResponseObject(
    @JsonField(name = ["code"]) var code: Int = -1,
    @JsonField(name = ["message"]) var message: String = ""
) {
    companion object {
        const val CODE_OK = 0
        const val CODE_SERVER_ERROR = 99
    }
}