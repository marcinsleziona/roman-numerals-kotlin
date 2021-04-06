import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.31"
    application
}

group = "pl.ims.romannumerals"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
}

dependencies {
    testImplementation(kotlin("test-junit"))

    // Spek
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.15")
    testImplementation("org.spekframework.spek2:spek-runner-junit5:2.0.15")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}
