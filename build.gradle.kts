plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.paper)
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(kotlin("stdlib"))
    paperweight.paperDevBundle("26.1.2.build.66-stable")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

group = "xyz.fireworkwars"
version = "0.1.0"
