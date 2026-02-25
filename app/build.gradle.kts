plugins {
    alias(libs.plugins.android.application)
}

android {
<<<<<<< HEAD
    namespace = "com.example.pancardnumber"
=======
<<<<<<< HEAD
    namespace = "com.example.celsiusandfahernheit"
=======
<<<<<<< HEAD
    namespace = "com.example.androidsimplecalculator"
=======
<<<<<<< HEAD
    namespace = "com.example.randomnumbergenerator"
=======
    namespace = "com.example.bmicalculator"
>>>>>>> 22e9640982f0449a330b10b01d6647833f11e5da
>>>>>>> 75c4b15cdaf5df64ab0c5308be4fdf58baa3abba
>>>>>>> ec63d121187640f9fdbb99299aaa902892bbfaa8
>>>>>>> aef43b6e9d43800ac36709fefd9762800fb427cf
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
<<<<<<< HEAD
        applicationId = "com.example.pancardnumber"
=======
<<<<<<< HEAD
        applicationId = "com.example.celsiusandfahernheit"
=======
<<<<<<< HEAD
        applicationId = "com.example.androidsimplecalculator"
=======
<<<<<<< HEAD
        applicationId = "com.example.randomnumbergenerator"
=======
        applicationId = "com.example.bmicalculator"
>>>>>>> 22e9640982f0449a330b10b01d6647833f11e5da
>>>>>>> 75c4b15cdaf5df64ab0c5308be4fdf58baa3abba
>>>>>>> ec63d121187640f9fdbb99299aaa902892bbfaa8
>>>>>>> aef43b6e9d43800ac36709fefd9762800fb427cf
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
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
}