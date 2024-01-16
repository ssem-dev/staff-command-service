package com.ssemchelin.staff.adapter.`in`.web

import com.ssemchelin.staff.application.usecase.FindStaffsUseCase
import com.ssemchelin.staff.domain.Staff
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/users")
class StaffController(val findStaffsUseCase: FindStaffsUseCase) {

    @GetMapping
    fun getStaffs(): Flux<Staff> {
        return findStaffsUseCase.findAllStaffs();
    }

}