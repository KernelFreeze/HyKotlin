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