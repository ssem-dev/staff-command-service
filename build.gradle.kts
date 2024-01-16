import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.20"
    kotlin("plugin.spring") version "1.9.20"
}

val kotestVersion: String = "5.8.0"

group = "com.ssemchelin"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.kafka:spring-kafka")

    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    implementation("com.github.jasync-sql:jasync-r2dbc-mysql:2.2.4")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    testImplementation("org.springframework.kafka:spring-kafka-test")

    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion") // kotlin junit 처럼 쓸 수 있는 Spec 들이 정의 됨
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion") // shouldBe... etc 와같이 Assertions 의 기능을 제공
    testImplementation("io.kotest.extensions:kotest-extensions-spring:1.1.3") // spring boot test 를 위해서 추가
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
