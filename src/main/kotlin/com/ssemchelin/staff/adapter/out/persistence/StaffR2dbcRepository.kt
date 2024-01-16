package com.ssemchelin.staff.adapter.out.persistence

import com.ssemchelin.staff.domain.Staff
import org.springframework.data.r2dbc.repository.R2dbcRepository

interface StaffR2dbcRepository : R2dbcRepository<Staff, Long>