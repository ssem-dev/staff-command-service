package com.ssemchelin.staff.application.port.out

import com.ssemchelin.staff.domain.Staff
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
interface FindStaffsOutputPort {
    fun findAllStaffs(): Flux<Staff>
}