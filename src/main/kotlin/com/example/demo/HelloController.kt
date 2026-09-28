package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

data class HelloRequest(val name: String)

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello() = mapOf("message" to "Hello, world")

    @PostMapping("/hello")
    fun hello(@RequestBody request: HelloRequest) = mapOf("message" to "Hello, ${request.name}")
}
