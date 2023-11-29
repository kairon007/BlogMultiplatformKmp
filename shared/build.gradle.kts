plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

group = "com.example.blogmultiplatform"
version = "1.0-SNAPSHOT"

kotlin {
    js(IR) { browser() }
    jvm()

    @Suppress("UNUSED_VARIABLE") // Suppress spurious warnings about sourceset variables not being used
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.googlecloud.storage)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(libs.googlecloud.storage)
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(libs.googlecloud.storage)
            }
        }
    }
}
