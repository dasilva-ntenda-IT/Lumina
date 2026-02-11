package com.lumina.library.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val author: String,
    val description: String,
    val coverUrl: String,
    val pdfUrl: String,
    val category: String,
    val publicationYear: Int,
    val rating: Float = 0f,
    val isFavorite: Boolean = false,
    val isDownloaded: Boolean = false
)