package net.swade.javadingsound;

import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

    @Override
    public void onEnable() {
        getLogger().info("\n§cJava Ding Sound §aEnabled\nAuthor: §bGuneyYilmaz0\n§aDiscord: §bGüney#1282");
        getServer().getPluginManager().registerEvents(new DingSoundListener(), this);
    }
}
