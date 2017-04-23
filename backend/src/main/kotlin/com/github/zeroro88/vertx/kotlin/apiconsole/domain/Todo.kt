package com.github.zeroro88.vertx.kotlin.apiconsole.domain

import com.github.zeroro88.vertx.kotlin.apiconsole.env.HOST
import com.github.zeroro88.vertx.kotlin.apiconsole.env.PORT

data class Todo(
    var id: String?,
    val title: String?,
    var order: Int?,
    val completed: Boolean = false
) {
    var url : String = ""
    get() { return "http://${HOST}:${PORT}/todos/${id}" }
}
