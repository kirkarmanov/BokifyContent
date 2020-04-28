package ru.bookify.network.getReadContent

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import ru.bookify.network.base.BaseResponseObject
import ru.bookify.network.dto.Part
import ru.bookify.network.getReadContent.dto.BaseContent

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class ResponseGetReadContent(
    @JsonField(name = ["contentList"]) var contentList: List<BaseContent> = emptyList()
):BaseResponseObject()

