package com.example.taskapp.model
import java.io.Serializable

data class Task(
    val title: String?= null,
    val desc: String?= null
): Serializable