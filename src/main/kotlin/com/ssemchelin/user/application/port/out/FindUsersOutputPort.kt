package com.ssemchelin.user.application.port.out

import com.ssemchelin.user.domain.Staff
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
interface FindUsersOutputPort {
    fun findAllUsers(): Flux<Staff>
}