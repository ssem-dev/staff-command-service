package com.ssemchelin.staff.domain

import org.springframework.data.annotation.*
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("staff")
data class Staff(
        @Id
        val id: Long? = null,
        val email: String? = null,
        val nickName: String? = null,
        @CreatedBy
        val createBy: Long? = null,
        @CreatedDate
        val createAt: LocalDateTime = LocalDateTime.now(),
        @LastModifiedBy
        val updateBy: Long? = null,
        @LastModifiedDate
        val updateAt: LocalDateTime = LocalDateTime.now(),
        @Transient
        val staffSocial: StaffSocial? = null
) {

}
