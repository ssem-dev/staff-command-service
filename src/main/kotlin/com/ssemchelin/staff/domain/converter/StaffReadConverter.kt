package com.ssemchelin.staff.domain.converter

import com.ssemchelin.staff.domain.enumtype.SocialType
import com.ssemchelin.staff.domain.model.Staff
import com.ssemchelin.staff.domain.model.StaffSocial
import io.r2dbc.spi.Row
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import org.springframework.stereotype.Component

@Component
@ReadingConverter
class StaffReadConverter : Converter<Row, Staff> {
    override fun convert(source: Row): Staff {
        println("convert 실행")
        val staffSocial = StaffSocial(
                id = source.get("staffSocialId") as Long,
                socialKey = source.get("socialKey") as String,
                type = SocialType.GOOGLE,
                staffId = source.get("staffId") as Long
        )

        return Staff(
            id = source.get("id") as Long,
                email = source.get("email") as String,
                nickName = source.get("nickName") as String,
                staffSocial = staffSocial
        )
    }
}