package com.example.keypad.model

data class Keypad(
    val rows: List<Row>
)

data class Row(
    val keys: List<Key>
)

data class Key(
    val label: String,
    val value: String,
    val imageUrl: String
)
