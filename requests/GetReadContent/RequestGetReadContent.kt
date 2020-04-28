package ru.bookify.network.getReadContent

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import ru.bookify.network.base.BaseRequestObject

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class RequestGetReadContent(
    @JsonField(name = ["id"]) var id: String = "",
    userId: String = ""
) : BaseRequestObject(TYPE, userId) {
    companion object {
        const val TYPE = "GetReadContent"
    }
}


