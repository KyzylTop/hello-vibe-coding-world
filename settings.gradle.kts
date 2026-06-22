pluginManagement {
    repositories {
        //阿里云镜像（覆盖MavenCentral、GoogLe、JCenter等）
        maven { setUrl("https://maven.aliyun.com/repository/public/") }
        maven { setUrl("https://maven.aliyun.com/repository/google/") }
        maven { setUrl("https://maven.aliyun.com/repository/jcenter/") }
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin/") }
        //华为云镜像
        maven { setUrl("https://repo.huaweicloud.com/repository/maven/") }
        //腾讯云镜像
        maven { setUrl("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/") }
        //网易镜像
        maven { setUrl("https://mirrors.163.com/maven/repository/maven-public/") }
        //Gradle插件仓库（官方）
        google()
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
        //阿里云镜像（覆盖MavenCentral、GoogLe、JCenter等）
        maven { setUrl("https://maven.aliyun.com/repository/public/") }
        maven { setUrl("https://maven.aliyun.com/repository/google/") }
        maven { setUrl("https://maven.aliyun.com/repository/jcenter/") }
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin/") }
        //华为云镜像
        maven { setUrl("https://repo.huaweicloud.com/repository/maven/") }
        //腾讯云镜像
        maven { setUrl("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/") }
        //网易镜像
        maven { setUrl("https://mirrors.163.com/maven/repository/maven-public/") }
        //Gradle插件仓库（官方）
        google()
        mavenCentral()
    }
}

rootProject.name = "定位权限测试"
include(":app")
