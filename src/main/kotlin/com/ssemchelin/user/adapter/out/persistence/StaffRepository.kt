package com.ssemchelin.user.adapter.out.persistence

import com.ssemchelin.user.domain.Staff
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository

@Repository
interface StaffRepository : R2dbcRepository<Staff, Long>