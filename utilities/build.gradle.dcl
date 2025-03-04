androidLibrary {
    namespace = "org.gradle.experimental.android.utilities"
    dependenciesDcl {
        api(project(":list"))

        testImplementation("junit:junit:4.13")
    }
}
