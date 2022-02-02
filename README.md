<br />
<p align="left">
    <img src=".github/kmm.png" alt="kmm" width="140" height="140"/>
</p>
<h3 align="left">Kotlin Multiplatform Mobile - Intro & Workshops</h3>

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
This workshop will introduce Kotlin Multiplatform Mobile, and review it's intended purpose and capabilities. We will also discuss its benefits, as well as drawbacks.
1. Project Creation
2. Dependency Management
3. Networking with [Ktor](https://ktor.io/) 
<ul>
<li>Model and interface definitions</li>
<li>Repositories and CRUD</li>
<li>Service interaction from the iOS client</li>
<li>Service interaction from the Android client</li>
</ul>
4. Hackathon Challenge


### Workshop 2 - Databases and Other Disappointments
This workshop will carry on from the previous workshop, and introduce options for persisting data locally using KMM. 
1. Choosing a database or ORM
2. Local persistence with SQLDelight
3. Local persistence with Realm

### Branch Reference
* workshop/network-starter branch: consists of starter template, with ktor and serialization dependencies. 
* workshop/network-final branch: consists of basic networking example with CRUD functions. 



