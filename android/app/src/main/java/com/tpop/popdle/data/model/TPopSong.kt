package com.tpop.popdle.data.model

data class TPopSong(
    val id: String,
    val title: String,
    val group: String,
    val year: Int,
    val lyrics: String,
    val clue: String,
    val lyricsUrl: String = ""
)
