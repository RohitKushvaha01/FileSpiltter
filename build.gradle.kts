plugins {
    id("com.android.application") version "8.6.0" apply false
    id("com.android.library") version "8.6.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.1.0" apply false
    autowire(libs.plugins.kotlin.android) apply false

}