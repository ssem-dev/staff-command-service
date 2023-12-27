package com.ssemchelin.user.adapter.out.persistence

import com.ssemchelin.user.domain.Staff
import org.springframework.data.r2dbc.repository.R2dbcRepository

interface StaffR2dbcRepository : R2dbcRepository<Staff, Long>