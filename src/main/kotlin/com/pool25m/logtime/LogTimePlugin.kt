package com.pool25m.logtime

import org.bukkit.plugin.java.JavaPlugin

class LogTimePlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("LogTime Plugin has been enabled!")

        getCommand("ranking")?.setExecutor(RankingCommand())
    }

    override fun onDisable() {
        logger.info("LogTime Plugin has been disabled.")
    }
}
