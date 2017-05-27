package fnitcrafters.infniteinventoryitems

/**
 * Created by taikifnit on 2017/05/27.
 */

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.inventory.InventoryOpenEvent

class InventoryOpenListener : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        event.joinMessage = "Hello from FNit Plugin!"
    }

    @EventHandler
    fun onInventoryOpen(event: InventoryOpenEvent) {
        // eventオブジェクトにインベントリーを開いた人の情報, インベントリの情報等が格納されている

        event.player.sendMessage("inventory opened")

        // インベントリに入っているitem分だけfor loop
        for (i in event.inventory.contents.indices) {
            // アイテムの量 = アイテムのスタックできる最大量
            event.inventory.contents[i].amount = event.inventory.contents[i].maxStackSize
        }
    }


}