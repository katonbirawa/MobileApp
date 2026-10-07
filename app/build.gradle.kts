plugins {
    alias(libs.plugins.android.application) // Plugin untuk aplikasi Android
    alias(libs.plugins.kotlin.android) // Plugin Kotlin untuk Android
    alias(libs.plugins.kotlin.compose)  // Plugin Kotlin Compose (UI deklaratif)

}

android {
    namespace = "com.example.mobileadvapp"
    compileSdk {
        version = release(35) // Versi SDK untuk compile (sebaiknya langsung angka: compileSdk = 36)
    }

    defaultConfig {
        applicationId = "com.example.mobileadvapp" // ID unik aplikasi
        minSdk = 24 // Minimum versi Android yang didukung
        targetSdk = 35 // Target versi Android
        versionCode = 1 // Nomor versi internal (untuk update)
        versionName = "1.0" // Nama versi yang ditampilkan ke user

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

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