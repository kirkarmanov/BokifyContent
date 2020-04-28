package ru.bookify.network.getReadContent.dto

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class BaseContent(
    @JsonField(name = ["type"]) var type: Int = ContentDto.TYPE_UNKNOWN,
    @JsonField(name = ["params"]) var params: String = ""
)