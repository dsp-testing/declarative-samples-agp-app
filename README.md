# declarative-samples-android-app
A sample Android application written in the Declarative Gradle DSL, using the official Android Software Types Preview `androidApplication` and `androidLibrary` defined in the `com.android.ecosystem` ecosystem plugin.

## Building and Running

This sample shows the definition of a multiproject Android application implemented using Kotlin 2.0.21 source code.

To build the project without running, use:

```shell
  ./gradlew build
```

To run the application, first install it on a connected Android device using:

```shell
  :app:installDebug
```

Then search for "Sample Declarative Gradle Android App" and launch app to see a hello world message.
