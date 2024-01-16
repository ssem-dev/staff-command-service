package com.ssemchelin.staff.application.usecase

import com.ssemchelin.staff.domain.Staff
import reactor.core.publisher.Flux

interface FindStaffsUseCase {
    fun findAllStaffs(): Flux<Staff>
}