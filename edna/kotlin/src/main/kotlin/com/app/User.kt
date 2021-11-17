package com.app

class User(val id: Long, var name: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (id != other.id) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int = "$id $name".hashCode()

    override fun toString(): String = "User(id=$id, name='$name')"
}