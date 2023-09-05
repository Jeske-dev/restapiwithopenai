package de.jeske.restapiwithopenai.entities

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document("ideas")
data class Idea(
    @Id
    val id: ObjectId = ObjectId(),
    val processId: ObjectId,
    val requestId: ObjectId,
    val date: Date,
    val userId: ObjectId,
    val title: String,
    val description: String,
) : Response (
    _id = id,
    _processId = processId,
    _requestId = requestId,
    _date = date
)