pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven(url = "https://jitpack.io")
        maven(url = "https://devrepo.kakao.com/nexus/content/groups/public/")
    }
}

rootProject.name = "MadcampWeek2"
include(":app")
