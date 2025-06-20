plugins {
    kotlin("jvm") version "2.1.10"
}

group = "net.guneyilmaz0.riotapi"
version = "0.1.0"

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
}
