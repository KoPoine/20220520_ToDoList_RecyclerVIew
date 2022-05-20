package com.neppplus.a20220520_todolist_recyclerview.models

import java.io.Serializable

class TodoData (
    val rating : Double,
    val todoTitle : String,
    val place : String,
    var isFinished : Boolean,
        ) : Serializable {
}