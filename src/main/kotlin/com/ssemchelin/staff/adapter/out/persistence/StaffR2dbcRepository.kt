package com.ssemchelin.staff.adapter.out.persistence

import com.ssemchelin.staff.domain.model.Staff
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Flux

interface StaffR2dbcRepository : R2dbcRepository<Staff, Long> {
    @Query("""
    select 
        s.id as staffId,
        s.email,
        s.nick_name as nickName,
        ss.id as staffSocialId,
        ss.social_key as socialKey,
        ss.type,
        ss.staff_id as staffId
    from staff s 
    left outer join staff_social ss on s.id = ss.staff_id
"""
    )
    override fun findAll(): Flux<Staff>
}