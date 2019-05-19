package com.lasta.studyspringbatch.hello

data class Person(
        var lastName: String = "",
        var firstName: String = ""
) {
    override fun toString(): String = "firstName: $firstName, lastName: $lastName"
}
