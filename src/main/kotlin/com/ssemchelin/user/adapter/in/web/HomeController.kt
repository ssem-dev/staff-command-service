package com.ssemchelin.user.adapter.`in`.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController

@GetMapping("/health-check")
fun healthCheck(): String {
    return "OK";
}