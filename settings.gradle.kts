pluginManagement {
    repositories {
        mavenLocal()

        gradlePluginPortal()

        maven {
            name = "Forge Release Maven"
            url = uri("https://maven.minecraftforge.net/releases")
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

include("neoforge")
