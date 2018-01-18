package com.aubergine

import com.aubergine.domain.Beer
import com.aubergine.repository.BeerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class BackendApplication

fun main(args: Array<String>) {
    SpringApplication.run(BackendApplication::class.java, *args)
}

@Component
class BeerLineRunner : CommandLineRunner{

    @Autowired
    var repository: BeerRepository? = null

    override fun run(vararg p0: String?) {


        listOf("Jupiler" , "Heinekken" , "La chouffe" , "Gordon").forEach { name -> repository!!.save(Beer(name)) }
        repository!!.findAll().forEach(::println)
    }

}
