package com.ssemchelin.user.adapter.out.persistence

import com.ssemchelin.user.application.port.out.FindUsersOutputPort
import com.ssemchelin.user.domain.Staff
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
class StaffRepository(val staffR2dbcRepository: StaffR2dbcRepository) : FindUsersOutputPort {
    override fun findAllUsers(): Flux<Staff> {
        return staffR2dbcRepository.findAll()
    }
}