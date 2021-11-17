package com.app

fun main() {
    val users = listOf(
        User(1, "Denis"),
        User(1, "Denis"),
        User(2, "Denis2"),
        User(2, "Denis2"),
        User(2, "Vlad"),
        User(2, "Vlad"),
        User(3, "Kira"),
    )
    val mapCountingByName = users.sortedWith(compareBy(User::id, User::name))
        .distinct()
        .groupingBy { it.name }
        .eachCount()

    println(mapCountingByName)
}