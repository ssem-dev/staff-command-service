package com.ssemchelin.staff.adapter.out.persistence

import com.ssemchelin.staff.domain.model.Staff
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Flux

interface StaffR2dbcRepository : R2dbcRepository<Staff, Long> {
    @Query("""
        select 
            s.*,
            ss.*
        from staff s 
        inner join staff_social ss 
    """)
    override fun findAll(): Flux<Staff>
}