package com.lasta.studyspringbatch.hello

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.batch.item.ItemProcessor

class PersonItemProcessor : ItemProcessor<Person, Person> {
    override fun process(person: Person): Person? {
        val firstName = person.firstName.toUpperCase()
        val lastName = person.lastName.toUpperCase()

        val transformedPerson = Person(firstName, lastName)

        LOGGER.info("Converting ($person) into ($transformedPerson)")

        return transformedPerson
    }

    companion object {
        private val LOGGER: Logger = LoggerFactory.getLogger(PersonItemProcessor::class.java)
    }
}