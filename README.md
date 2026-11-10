# MillionareMate 🎮

An Android application project organized around a game-style home and account flow.

## Features represented in the source

- Splash screen with a timed transition to the home screen
- Home activity
- Login activity
- Registration activity
- Android XML layouts and drawable resources for the app interface

## Tech Stack

- Java
- Android SDK (compile / target SDK 34; minimum SDK 24)
- AndroidX AppCompat
- Material Components
- ConstraintLayout
- JUnit and Espresso test dependencies

## Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/SRIKALYANBHAVANTHI/MillionareMate.git
   ```
2. Open the project in Android Studio.
3. Allow Gradle sync to complete.
4. Run the **app** configuration on an Android emulator or device.

Build a debug APK:

```bash
./gradlew assembleDebug
```

Windows:

```bat
gradlew.bat assembleDebug
```

## Project Structure

Java activities are under `app/src/main/java/com/example/millionaremate`; screen layouts and visual resources are under `app/src/main/res`.

## Notes

This README describes the structure visible in the repository. Confirm the complete gameplay flow and test the app in Android Studio before presenting it as a finished game.

---

Created by [Srikalyan Bhavanthi](https://github.com/SRIKALYANBHAVANTHI).
