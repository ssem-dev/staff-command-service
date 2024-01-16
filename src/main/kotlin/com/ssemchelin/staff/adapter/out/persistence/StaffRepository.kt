package com.ssemchelin.staff.adapter.out.persistence

import com.ssemchelin.staff.application.port.out.FindStaffsOutputPort
import com.ssemchelin.staff.domain.model.Staff
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
class StaffRepository(val staffR2dbcRepository: StaffR2dbcRepository) : FindStaffsOutputPort {
    override fun findAllStaffs(): Flux<Staff> {
        return staffR2dbcRepository.findAll()
    }
}