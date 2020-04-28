package ru.bookify.network.getReadContent.dto

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class Text(
    @JsonField(name = ["text"]) var text: String = "",
    @JsonField(name = ["style"]) var style: String = ""
) : ContentDto(TYPE_TEXT)