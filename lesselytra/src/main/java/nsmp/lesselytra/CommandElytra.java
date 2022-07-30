package nsmp.lesselytra;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class CommandElytra implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            return false;
        } else {
            Player target = Bukkit.getPlayerExact(args[0]);
            if (target instanceof Player) {
                List<String> list = Main.getPlugin().getConfig().getStringList("players");
                if(list.contains(target.getName())){
                    list.remove(args[0]);
                    if(sender instanceof Player){
                        sender.sendMessage(target.getName() + " " + Main.getPlugin().getConfig().getString("info-off"));
                    } else {
                        Main.getPlugin().getLogger().info(target.getName() + " " + Main.getPlugin().getConfig().getString("info-off"));
                    }
                }else {
                    list.add(args[0]);
                    if(sender instanceof Player){
                        sender.sendMessage(target.getName() + " " + Main.getPlugin().getConfig().getString("info-on"));
                    } else {
                        Main.getPlugin().getLogger().info(target.getName() + " " + Main.getPlugin().getConfig().getString("info-on"));
                    }
                }
                Main.getPlugin().getConfig().set("players", list);
                Main.getPlugin().saveConfig();
            }
            return false;
        }
    }
}
