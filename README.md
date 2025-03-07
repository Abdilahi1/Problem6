# Fitness Android App

## 📌 Overview

This is a **modern fitness tracking application** designed for Android. It includes features such as:

- A **custom App Bar (Top Navigation)** with profile, notifications, and settings.
- A **Bottom Navigation Bar** for quick access to key sections (Home, Workouts, Progress, and Profile).
- A **RecyclerView** displaying recommended workouts.

## 🚀 Features

### ✅ **App Bar (Top Navigation)**

- Displays user **profile icon**.
- Includes a **notifications** and **settings** menu.

### ✅ **Bottom Navigation Bar**

- Quick navigation between **Home, Workouts, Progress, and Profile**.
- Uses **Material BottomNavigationView** for a sleek design.

### ✅ **Workout List (RecyclerView)**

- Displays recommended workouts dynamically.
- Uses a **RecyclerView Adapter** for flexibility.

## 📱 Screenshots

(Include screenshots here if available)

## 🛠️ Tech Stack

- **Programming Language**: Java (Android)
- **UI Framework**: XML (Material Design Components)
- **Architecture**: MVVM (if applicable)

## 📂 Folder Structure

```
/fitness-app
│── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/fitnessapp/
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── adapters/WorkoutAdapter.java
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── drawable/
│   │   │   │   ├── menu/
│   │   │   │   │   ├── top_app_bar_menu.xml
│   │   │   │   │   ├── bottom_nav_menu.xml
```

## 🔧 Setup and Installation

### 1️⃣ **Clone the Repository**

```sh
git clone https://github.com/Abdilahi1/problem6.git
cd fitness-app
```

### 2️⃣ **Open in Android Studio**

- Open **Android Studio**
- Select **"Open an existing project"**
- Navigate to the cloned folder and select it.

### 3️⃣ **Run the App**

- Connect an **Android device** or start an **emulator**.
- Click **Run** ▶️ in Android Studio.

## 📜 Dependencies

Add the following dependencies in `build.gradle`:

```gradle
dependencies {
    implementation 'com.google.android.material:material:1.10.0'
    implementation 'androidx.recyclerview:recyclerview:1.2.1'
}
```

## 📧 Contact

For any queries or contributions, feel free to contact **[your.email@example.com](mailto\:your.email@example.com)** or open an **issue** in the repository.

---

💪 **Stay fit and keep coding!** 🚀

