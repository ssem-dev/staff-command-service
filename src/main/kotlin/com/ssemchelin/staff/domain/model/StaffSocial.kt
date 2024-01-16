package com.ssemchelin.staff.domain.model

import com.ssemchelin.staff.domain.enumtype.SocialType
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("staff_social")
data class StaffSocial(
        @Id
        val id: Long? = null,
        val socialKey: String? = null,
        val type: SocialType,
        val staffId: Long,
        @CreatedBy
        val createBy: Long? = null,
        @CreatedDate
        val createAt: LocalDateTime = LocalDateTime.now(),
        @Transient
        val staff: Staff? = null
) {

}
