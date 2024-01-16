package com.ssemchelin.staff.application.port.out

import com.ssemchelin.staff.domain.model.Staff
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
interface FindStaffsOutputPort {
    fun findAllStaffs(): Flux<Staff>
}