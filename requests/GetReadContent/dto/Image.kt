package ru.bookify.network.getReadContent.dto

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class Image(
    @JsonField(name = ["imageLink"]) var imageLink: String = "",
    @JsonField(name = ["imageDescription"]) var imageDescription: String = ""
) : ContentDto(TYPE_IMAGE)