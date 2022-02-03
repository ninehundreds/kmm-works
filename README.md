<br />
<p align="left">
    <img src=".github/kmm.png" alt="kmm" width="140" height="140"/>
</p>
<h3 align="left">Kotlin Multiplatform Mobile - Intro & Workshops</h3>

---

### What is Kotlin Multiplatform Mobile?

* Kotlin Multiplatform is an SDK for cross-platform mobile development, which enables teams to use the same business logic in both Android and iOS client applications.
* Kotlin Multiplatform is written using Kotlin, an open source language from the [Jetbrains](https://www.jetbrains.com/) team.
* The shared code written in Kotlin is compiled to different formats depending on the target platform. For Android, it is compiled to Java bytecode, whereas on iOS it is compiled to a native binary.
* The user interface development remains in the hands of the respective platform.

### Benefits
* DRY (Don’t Repeat Yourself) - Reduced code and test duplication, while retaining the flexibility and benefits of native development.
* Code Consistency - Variations in business logic can be reduced or eliminated completely.
* Code Reuse - Existing Kotlin code has the potential to be migrated into the new project.

### Familiarity & Community Support
* Existing Languages - Developers can continue to write code natively using modern languages, and always have access to the latest APIs.
* Tooling - Long term Kotlin and KMM ecosystem support and updates from Jetbrains; an industry leader in development tools and technologies.

___

#### Requirements
* macOS machine running 10.14 (Mojave) or above.
* [Xcode 11.3 or higher](https://apps.apple.com/us/app/xcode/id497799835)
* [Android Studio 4.2 or 2020.3.1 Canary 8 or higher](https://developer.android.com/studio)
* [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile)
* [JDK 11+](https://www.oracle.com/java/technologies/javase-downloads.html)


#### Getting Started
Make sure you clone the repo in advance of the workshop:
  ```sh
  git clone https://github.com/ninehundreds/kmm-works.git
  ```

### Workshop 1 - Introduction and Basic Networking 

---
Enter the newly cloned project directory, and checkout the network starter branch:
  ```sh
  cd kmm-works
  git checkout workshop/network-starter
  ```

This workshop will introduce Kotlin Multiplatform Mobile, and review it's intended purpose and capabilities. We will also discuss its benefits, as well as drawbacks. Hands-on segments will consist of:
1. Project Creation / Dependency Management
2. Project Structure
3. Networking with [Ktor](https://ktor.io/) 
    * Model and interface definitions (CRUD)
    * Service and HTTP client functions / implementation 
    * Service interaction from the iOS client
    * Service interaction from the Android client
4. Hackathon Challenge


### Workshop 2 - Databases and Other Disappointments

---
This workshop will carry on from the previous workshop, and introduce options for persisting data locally using KMM. Hands-on segments will consist of:
1. Implementing local persistence with SQLDelight
2. Implementing local persistence with Realm
3. Interacting with local persistence in the clients

---

#### Branch Reference
* workshop/network-starter branch: consists of starter template, with ktor and serialization dependencies.
* workshop/network-final branch: consists of basic networking example with CRUD functions. 


