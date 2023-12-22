package com.ssemchelin.user.application.port.`in`

import com.ssemchelin.user.application.port.out.FindUsersOutputPort
import com.ssemchelin.user.application.usecase.FindUsersUseCase
import com.ssemchelin.user.domain.Staff
import reactor.core.publisher.Flux

class FindUsersPort(
        val findUsersOutputPort: FindUsersOutputPort
) : FindUsersUseCase {
    override fun findAllUsers(): Flux<Staff> {
        return findUsersOutputPort.findAllUsers()
    }
}