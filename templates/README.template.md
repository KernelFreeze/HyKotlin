# HyKotlin

Kotlin support for Hytale plugins.

HyKotlin embeds the Kotlin Standard Library and other essential Kotlin libraries, allowing you to write Hytale plugins in Kotlin without bundling these dependencies yourself.

This project is adapted from [fabric-language-kotlin](https://github.com/FabricMC/fabric-language-kotlin). See the [license file](/LICENSE) for licensing details.

**Current version:** `${PLUGIN_VERSION}`

## Installation
-Add the repository to Gradle:

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/KernelFreeze/HyKotlin")
   }
}
```

Add HyKotlin as a Gradle dependency:

```kotlin
dependencies {
    implementation("dev.celestelove:hykotlin:${PLUGIN_VERSION}")
}
```

Then declare it in your plugin manifest:

```json
{
  "Name": "YourPlugin",
  "Dependencies": {
    "HyKotlin": ">=${PLUGIN_VERSION}"
  }
}
```

## Bundled Libraries

### `org.jetbrains.kotlin`

| Library | Version | Links |
|---------|---------|-------|
| `kotlin-stdlib` | ${KOTLIN_STDLIB_VERSION} | [Docs](https://kotlinlang.org/docs/home.html) · [API](https://kotlinlang.org/api/latest/jvm/stdlib/) · [GitHub](https://github.com/JetBrains/kotlin) |
| `kotlin-reflect` | ${KOTLIN_REFLECT_VERSION} | [Docs](https://kotlinlang.org/docs/reflection.html) · [API](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/) |

### `org.jetbrains.kotlinx`

| Library | Version | Links |
|---------|---------|-------|
| `kotlinx-coroutines-core` | ${KOTLINX_COROUTINES_CORE_VERSION} | [Guide](https://kotlinlang.org/docs/coroutines-guide.html) · [API](https://kotlin.github.io/kotlinx.coroutines/) · [GitHub](https://github.com/Kotlin/kotlinx.coroutines) |
| `kotlinx-coroutines-jdk8` | ${KOTLINX_COROUTINES_CORE_VERSION} | [API](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-jdk8/index.html) |
| `kotlinx-serialization-core` | ${KOTLINX_SERIALIZATION_CORE_JVM_VERSION} | [Guide](https://github.com/Kotlin/kotlinx.serialization/blob/master/docs/serialization-guide.md) · [API](https://kotlin.github.io/kotlinx.serialization/kotlinx-serialization-core/index.html) · [GitHub](https://github.com/Kotlin/kotlinx.serialization) |
| `kotlinx-serialization-json` | ${KOTLINX_SERIALIZATION_JSON_JVM_VERSION} | [API](https://kotlin.github.io/kotlinx.serialization/kotlinx-serialization-json/index.html) |
| `kotlinx-serialization-cbor` | ${KOTLINX_SERIALIZATION_CBOR_JVM_VERSION} | [API](https://kotlin.github.io/kotlinx.serialization/kotlinx-serialization-cbor/index.html) |
| `atomicfu` | ${ATOMICFU_JVM_VERSION} | [GitHub](https://github.com/Kotlin/kotlinx.atomicfu) |
| `kotlinx-datetime` | ${KOTLINX_DATETIME_JVM_VERSION} | [GitHub](https://github.com/Kotlin/kotlinx-datetime) |
| `kotlinx-io-core` | ${KOTLINX_IO_CORE_JVM_VERSION} | [API](https://kotlin.github.io/kotlinx-io/kotlinx-io-core/index.html) · [GitHub](https://github.com/Kotlin/kotlinx-io) |
| `kotlinx-io-bytestring` | ${KOTLINX_IO_BYTESTRING_JVM_VERSION} | [API](https://kotlin.github.io/kotlinx-io/kotlinx-io-bytestring/index.html) |

## Development

To update this README, edit `templates/README.template.md` and run:

```sh
./gradlew processMDTemplates
```
