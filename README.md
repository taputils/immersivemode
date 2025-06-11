# ImmersiveMode

`ImmersiveMode` is a lightweight Android library that makes it easy to enable full immersive mode (hide status and navigation bars) for your app with just one line of code.

---

## 📦 Installation (via JitPack)

Add this to your **project-level** `build.gradle` (or `settings.gradle.kts`):

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Then add the dependency to your **module-level** `build.gradle`:

```gradle
dependencies {
    implementation 'com.github.taputils:immersivemode:v1.0'
}
```
---

## 🚀 Usage

Call the following method from your Activity or Fragment to enable immersive mode:

```java
ImmersiveMode.enable(this); // For Activity
```

OR

```java
ImmersiveMode.enable(getActivity()); // For Fragment
```

---

## 📋 Features

- Hides both **status bar** and **navigation bar**
- Supports Android **API 19+**
- Automatically re-applies immersive mode on focus change
- Small, fast, and easy to integrate

---

## 📱 Minimum SDK

```
minSdkVersion 19
```

---

## 📂 AAR Contents

- Java class files under `com.taputils.immersivemode`
- Manifest included
- No external dependencies

---

## 🛠 ProGuard (if needed)

No rules are required for this library.

---

## 🧑‍💻 Author

**Ali Ahmad (TapUtils)**  
🔗 [https://github.com/taputils](https://github.com/taputils)

---

## ☕ License

This project is licensed under the MIT License.  
See [`LICENSE`](LICENSE) for details.
