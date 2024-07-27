package com.example.keypad.controller

import com.example.keypad.model.Keypad
import com.example.keypad.model.Row
import com.example.keypad.model.Key
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/keypad")
class KeypadController {

    @GetMapping
    fun getKeypad(): Keypad {
        val baseUrl = "http://localhost:8080/images" // 이미지가 저장된 기본 URL
        val keysRow1 = listOf(
            Key(label = "1", value = "1", imageUrl = "$baseUrl/_1.png"),
            Key(label = "2", value = "2", imageUrl = "$baseUrl/_2.png"),
            Key(label = "3", value = "3", imageUrl = "$baseUrl/_3.png")
        )
        val keysRow2 = listOf(
            Key(label = "4", value = "4", imageUrl = "$baseUrl/_4.png"),
            Key(label = "5", value = "5", imageUrl = "$baseUrl/_5.png"),
            Key(label = "6", value = "6", imageUrl = "$baseUrl/_6.png")
        )
        val keysRow3 = listOf(
            Key(label = "7", value = "7", imageUrl = "$baseUrl/_7.png"),
            Key(label = "8", value = "8", imageUrl = "$baseUrl/_8.png"),
            Key(label = "9", value = "9", imageUrl = "$baseUrl/_9.png")
        )
        val keysRow4 = listOf(
            Key(label = "*", value = "*", imageUrl = "$baseUrl/_blank.png"),
            Key(label = "0", value = "0", imageUrl = "$baseUrl/_0.png"),
            Key(label = "#", value = "#", imageUrl = "$baseUrl/_blank.png")
        )

        val rows = listOf(
            Row(keys = keysRow1),
            Row(keys = keysRow2),
            Row(keys = keysRow3),
            Row(keys = keysRow4)
        )

        return Keypad(rows = rows)
    }
}
