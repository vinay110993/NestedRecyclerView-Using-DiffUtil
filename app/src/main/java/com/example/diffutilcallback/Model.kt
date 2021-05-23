package com.example.diffutilcallback

data class ParentItem(
    var id: Int,
    var name: String,
    var list: List<ChildItem> = emptyList()
)

data class ChildItem(
    var id: Int,
    var name: String
)