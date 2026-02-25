pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

<<<<<<< HEAD
rootProject.name = "Android(simple calculator"
include(":app")
=======
<<<<<<< HEAD
rootProject.name = "Random number generator"
=======
rootProject.name = "BMI CALCULATOR"
>>>>>>> 22e9640982f0449a330b10b01d6647833f11e5da
include(":app")
 
>>>>>>> 75c4b15cdaf5df64ab0c5308be4fdf58baa3abba
