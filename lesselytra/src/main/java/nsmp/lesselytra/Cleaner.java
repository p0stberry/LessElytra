package nsmp.lesselytra;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;

import java.util.List;

public class Cleaner implements Listener {
	@EventHandler
	public void OnElytraFly(EntityToggleGlideEvent e) {
		if(e.getEntity() instanceof Player){
			Player p = (Player) e.getEntity();
			List<String> list = Main.getPlugin().getConfig().getStringList("players");
			if(!(list.contains(p.getName()))){
				e.setCancelled(true);
				p.getInventory().setChestplate(null);
				p.sendMessage(Main.warning);
			}
		}
	}
	
}
