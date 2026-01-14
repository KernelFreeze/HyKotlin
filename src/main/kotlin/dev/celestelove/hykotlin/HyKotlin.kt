/*
 * Copyright 2026 Celeste Peláez <contact@celestelove.dev>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.celestelove.hykotlin

import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit

class HyKotlin(init: JavaPluginInit) : JavaPlugin(init) {
    companion object {
        private const val PLUGIN_NAME = "HyKotlin"
    }

    override fun setup() {
        logger.atInfo().log("Enabling $PLUGIN_NAME...")
    }
}