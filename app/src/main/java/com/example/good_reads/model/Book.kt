package com.example.good_reads.model

data class Book(
    val items: List<Item>,
    val kind: String,
    val totalItems: Int
)