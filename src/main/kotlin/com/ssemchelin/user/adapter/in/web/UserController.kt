package com.ssemchelin.user.adapter.`in`.web

import com.ssemchelin.user.application.port.`in`.FindUsersPort
import com.ssemchelin.user.domain.Staff
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/users")
class UserController(val findUsersPort: FindUsersPort) {

    @GetMapping
    fun getUsers(): Flux<Staff> {
        return findUsersPort.findAllUsers();
    }
}