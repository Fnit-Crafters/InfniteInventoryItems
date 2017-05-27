package fnitcrafters.infniteinventoryitems

import org.bukkit.plugin.java.JavaPlugin

class InfniteInventoryItems : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello from InfniteInventoryItems Plugin!")
        server.pluginManager.registerEvents( InventoryOpenListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
