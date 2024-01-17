package com.ssemchelin.staff.domain.model

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
        val staffSocial: StaffSocial? = null
) {
    constructor(
        id: Long?,
        email: String?,
        nickName: String?,
        createBy: Long?,
        createAt: LocalDateTime,
        updateBy: Long?,
        updateAt: LocalDateTime
    ) : this(id, email, nickName, createBy, createAt, updateBy, updateAt, null)
}
