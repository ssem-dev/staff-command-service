package com.ssemchelin.user.application.usecase

import com.ssemchelin.user.domain.Staff
import reactor.core.publisher.Flux

interface FindUsersUseCase {
    fun findAllUsers(): Flux<Staff>
}