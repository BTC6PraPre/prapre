package com.example.backend.dataclass

data class Presentation(
    val id: Long,
    val title: String,
    val startTime: Long,
    val userId: Long,
    val scoreEye: Int,
    val scoreVolume: Int,
    val scoreFiller: Int,
    val scoreSpeed: Int,
    val scoreTime: Int
)
