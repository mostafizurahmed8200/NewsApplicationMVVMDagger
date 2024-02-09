@file:Suppress("DEPRECATION")

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.hilt)
    kotlin("kapt")

}

android {
    namespace = "com.example.newsapplicationmvvmdagger"
    compileSdk = 34
    buildFeatures {
        buildConfig = true
    }
    defaultConfig {
        applicationId = "com.example.newsapplicationmvvmdagger"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/LICENSE")
        exclude("META-INF/LICENSE.txt")
        exclude("META-INF/license.txt")
        exclude("META-INF/NOTICE")
        exclude("META-INF/NOTICE.txt")
        exclude("META-INF/notice.txt")
        exclude("META-INF/ASL2.0")
        exclude("META-INF/services/javax.annotation.processing.Processor")
        exclude("META-INF")
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)



    //Dagger Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)

// Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

// OkHttp
    implementation(libs.okhttp)

// Glide
    implementation(libs.glide)
//noinspection KaptUsageInsteadOfKsp
    kapt(libs.glide.compiler)

// ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

// Coroutine
    implementation(libs.kotlinx.coroutines.android)

// Lifecycle
    implementation(libs.androidx.lifecycle.extensions)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.runtime.ktx)
//Room DB
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.runtime) // Use the correct version
    //noinspection KaptUsageInsteadOfKsp
    kapt(libs.androidx.room.compiler)
}
kapt { correctErrorTypes = true }