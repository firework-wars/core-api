plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.paper)
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(kotlin("stdlib"))
    paperweight.paperDevBundle("1.21.11-R0.1-SNAPSHOT")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

group = "xyz.fireworkwars"
version = "0.1.0"
