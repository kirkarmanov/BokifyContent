package ru.bookify.network.getBookHeaders

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import ru.bookify.network.dto.Part

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class ResponseGetBookHeaders(
    @JsonField(name = ["headers"]) var headers: List<BookHeaderDto> = emptyList()
) : BaseResponseObject()

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class BookHeaderDto(
    @JsonField(name = ["id"]) var id: String = "",
    @JsonField(name = ["parts"]) var parts: List<Part> = emptyList()
)

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)
class Part(
    @JsonField(name = ["title"]) var title: String = "",
    @JsonField(name = ["description"]) var description: String = "",
    @JsonField(name = ["timeDescription"]) var timeDescription: String = "",
    @JsonField(name = ["bookName"]) var bookName: String = "",
    @JsonField(name = ["partNumber"]) var partNumber: Int = -1
)
