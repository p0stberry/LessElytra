package nsmp.lesselytra;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    static String warning;
    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();
        warning = this.getConfig().getString("warning");
        getServer().getPluginManager().registerEvents(new Cleaner(), this);
        Objects.requireNonNull(getPlugin().getCommand("elytra")).setExecutor(new CommandElytra());
    }

    public static Main getPlugin() {
        return plugin;
    }
}
