package com.ssemchelin.staff.config

import com.ssemchelin.staff.domain.converter.StaffReadConverter
import io.r2dbc.spi.ConnectionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import org.springframework.data.convert.CustomConversions
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing
import org.springframework.data.r2dbc.convert.R2dbcCustomConversions
import org.springframework.data.r2dbc.dialect.DialectResolver
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator
import org.springframework.r2dbc.core.DatabaseClient

@Configuration
@EnableR2dbcAuditing
@EnableR2dbcRepositories
class DatabaseConfig @Autowired constructor(private val staffReadConverter: StaffReadConverter) {

    @Bean
    fun initializer(connectionFactory: ConnectionFactory): ConnectionFactoryInitializer {
        val initializer = ConnectionFactoryInitializer()
        initializer.setConnectionFactory(connectionFactory)
        val populator = ResourceDatabasePopulator(ClassPathResource("sql/schema.sql"))
        initializer.setDatabasePopulator(populator)

        return initializer
    }

    @Bean
    fun r2dbcCustomConversions(databaseClient: DatabaseClient): R2dbcCustomConversions {
        val dialect = DialectResolver.getDialect(databaseClient.connectionFactory)
        val converters = mutableListOf<Any>()
        converters.addAll(dialect.converters)
        converters.addAll(R2dbcCustomConversions.STORE_CONVERTERS)
        converters.add(staffReadConverter)

        return R2dbcCustomConversions(
            CustomConversions.StoreConversions.of(
                dialect.simpleTypeHolder,
                converters
            ), listOf<Any>()
        )
    }
}
