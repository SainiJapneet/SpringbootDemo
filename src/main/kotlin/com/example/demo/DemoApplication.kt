package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

data class Photo(
	val id: String? = null,
	val uri: String? = null,
	val labal: String? = null
)

@RestController
class DemoController(){
	@GetMapping
	fun greeting()="Hello, Have a nice day!"
}