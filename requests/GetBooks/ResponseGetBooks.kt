package ru.bookify.network.getBooks

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import ru.bookify.network.base.BaseResponseObject
import ru.bookify.network.dto.BookDto

@JsonObject(fieldDetectionPolicy = JsonObject.FieldDetectionPolicy.ANNOTATIONS_ONLY)

class ResponseGetBooks(
    @JsonField(name=["userBooks"])  var userBooks: List<BookDto> = emptyList(),
    @JsonField(name=["recommendBooks"])  var recommendBooks: List<BookDto> = emptyList()
) : BaseResponseObject()