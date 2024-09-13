plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.films"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.films"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    compileOnly("com.android.support:appcompat-v7:23.0.1")
    compileOnly("com.android.support:recyclerview-v7:23.0.1")
    compileOnly("com.squareup.retrofit:retrofit:1.9.0")
    compileOnly("com.squareup.picasso:picasso:2.5.2")
}