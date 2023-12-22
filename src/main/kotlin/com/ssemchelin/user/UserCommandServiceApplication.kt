package com.ssemchelin.user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserCommandServiceApplication

fun main(args: Array<String>) {
    runApplication<UserCommandServiceApplication>(*args)
}
