package com.olieng.branch_assessment.Model

import java.sql.Timestamp

data class MessagesData(
    val thread_id:Int,
    val user_id:Int,
    val agent_id:Int,
    val body:String,
    val timestamp:Timestamp
)
