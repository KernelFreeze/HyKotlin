# Changelog for v0.2.4

## Version Format Change
- Version format changed from `0.2.2+kotlin.2.3.0` to `0.2.4+kt2v3v0` (as Hytale doesn't support build numbers with dots).

## Maven Repository
- **Breaking:** Moved from GitHub Packages to Eufonia Maven repository
  - New URL: `https://maven.eufonia.studio/public`

## Plugin Manifest
- **Breaking:** Dependency declaration format changed from `"HyKotlin"` to `"HyKotlin:HyKotlin"`

## Build System
- Upgraded Gradle from 8.11.1 to 9.2.1
- Replaced deprecated `org.gradle.util.VersionNumber` with `org.apache.maven.artifact.versioning.ComparableVersion` for library version updates

## CI/CD
- GitHub Actions workflow now ignores changes to `templates/**` and `README.md` (avoids unnecessary test runs)

## Documentation
- README now displays the Kotlin version separately from the plugin version

---

### Migration Guide

Update your `build.gradle.kts`:
```kotlin
repositories {
    maven {
        name = "eufoniaMavenPublic"
        url = uri("https://maven.eufonia.studio/public")
    }
}

dependencies {
    implementation("dev.celestelove:hykotlin:0.2.4+kt2v3v0")
}
```

Update your plugin manifest:
```json
{
  "Dependencies": {
    "HyKotlin:HyKotlin": ">=0.2.4+kt2v3v0"
  }
}
```
