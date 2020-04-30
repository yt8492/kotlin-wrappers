plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-react"))
    implementation(project(":kotlin-react-dom"))
    implementation(project(":kotlin-styled"))
    implementation(kotlinxHtml("js"))
}

kotlin {
    target {
        browser {
            webpackTask {
                outputFileName = "main.js"
            }
            runTask {
                outputFileName = "main.js"
            }
        }
    }
}

