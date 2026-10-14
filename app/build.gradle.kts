
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.mobileadvapp"
    compileSdk = 35  // Ubah dari format blok menjadi penugasan langsung

    defaultConfig {
        applicationId = "com.example.mobileadvapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    // ... sisa kode di bawahnya tetap sama

    buildTypes {
        release {
            isMinifyEnabled = false // Tidak melakukan minify saat rilis
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17" // Target JVM untuk Kotlin adalah versi 11
    }
    buildFeatures {
        viewBinding = true // Mengaktifkan View Binding untuk akses view lebih aman dan mudah
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Navigation Component & SafeArgs
    implementation("androidx.navigation:navigation-fragment-ktx:2.8.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.8.0")
}

dependencies { //mendeklarasikan pustaka/library eksternal yang dibutuhkan oleh aplikasi agar
               // fungsi-fungsi tertentu dapat berjalan.
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.appcompat)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    dependencies {
        // Downgrade core-ktx ke versi stabil yang cocok dengan SDK 35
        implementation("androidx.core:core-ktx:1.13.1")

        // Downgrade activity & activity-ktx
        implementation("androidx.activity:activity-ktx:1.9.3")

        // Jika kamu menggunakan lifecycle / compose
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")


    }
}