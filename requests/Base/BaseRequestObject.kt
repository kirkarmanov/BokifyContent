package ru.bookify.network.base

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
open class BaseRequestObject(
    @JsonField(name = ["type"]) var type: String = "",
    @JsonField(name = ["userId"]) var userId: String? = null
)