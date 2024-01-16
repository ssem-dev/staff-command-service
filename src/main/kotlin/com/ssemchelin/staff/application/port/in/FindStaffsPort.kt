package com.ssemchelin.staff.application.port.`in`

import com.ssemchelin.staff.application.port.out.FindStaffsOutputPort
import com.ssemchelin.staff.application.usecase.FindStaffsUseCase
import com.ssemchelin.staff.domain.model.Staff
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class FindStaffsPort(
        val findStaffsOutputPort: FindStaffsOutputPort
) : FindStaffsUseCase {
    override fun findAllStaffs(): Flux<Staff> {
        return findStaffsOutputPort.findAllStaffs()
    }
}