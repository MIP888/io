pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = ("io")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
    "app",
    "library-android",
    "library-kotlin"
)
