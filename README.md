# HyKotlin

Kotlin support for Hytale plugins.

HyKotlin embeds the Kotlin Standard Library and other essential Kotlin libraries, allowing you to write Hytale plugins in Kotlin without bundling these dependencies yourself.

This project is adapted from [fabric-language-kotlin](https://github.com/FabricMC/fabric-language-kotlin). See the [license file](/LICENSE) for licensing details.

**Current version:** `0.2.1+kotlin.2.3.0`

## Installation

Add HyKotlin as a Gradle dependency:

```kotlin
dependencies {
    implementation("dev.celestelove:hykotlin:0.2.1+kotlin.2.3.0")
}
```

Then declare it in your plugin manifest:

```json
{
  "Name": "YourPlugin",
  "Dependencies": {
    "HyKotlin": ">=0.2.1+kotlin.2.3.0"
  }
}
```

## Bundled Libraries

### `org.jetbrains.kotlin`

| Library | Version | Links |
|---------|---------|-------|
| `kotlin-stdlib` | 2.3.0 | [Docs](https://kotlinlang.org/docs/home.html) · [API](https://kotlinlang.org/api/latest/jvm/stdlib/) · [GitHub](https://github.com/JetBrains/kotlin) |
| `kotlin-reflect` | 2.3.0 | [Docs](https://kotlinlang.org/docs/reflection.html) · [API](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/) |

### `org.jetbrains.kotlinx`

| Library | Version | Links |
|---------|---------|-------|
| `kotlinx-coroutines-core` | 1.10.2 | [Guide](https://kotlinlang.org/docs/coroutines-guide.html) · [API](https://kotlin.github.io/kotlinx.coroutines/) · [GitHub](https://github.com/Kotlin/kotlinx.coroutines) |
| `kotlinx-coroutines-jdk8` | 1.10.2 | [API](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-jdk8/index.html) |
| `kotlinx-serialization-core` | 1.9.0 | [Guide](https://github.com/Kotlin/kotlinx.serialization/blob/master/docs/serialization-guide.md) · [API](https://kotlin.github.io/kotlinx.serialization/kotlinx-serialization-core/index.html) · [GitHub](https://github.com/Kotlin/kotlinx.serialization) |
| `kotlinx-serialization-json` | 1.9.0 | [API](https://kotlin.github.io/kotlinx.serialization/kotlinx-serialization-json/index.html) |
| `kotlinx-serialization-cbor` | 1.9.0 | [API](https://kotlin.github.io/kotlinx.serialization/kotlinx-serialization-cbor/index.html) |
| `atomicfu` | 0.29.0 | [GitHub](https://github.com/Kotlin/kotlinx.atomicfu) |
| `kotlinx-datetime` | 0.7.1 | [GitHub](https://github.com/Kotlin/kotlinx-datetime) |
| `kotlinx-io-core` | 0.8.2 | [API](https://kotlin.github.io/kotlinx-io/kotlinx-io-core/index.html) · [GitHub](https://github.com/Kotlin/kotlinx-io) |
| `kotlinx-io-bytestring` | 0.8.2 | [API](https://kotlin.github.io/kotlinx-io/kotlinx-io-bytestring/index.html) |

## Development

To update this README, edit `templates/README.template.md` and run:

```sh
./gradlew processMDTemplates
```
