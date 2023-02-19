package net.swade.javadingsound;

import cn.nukkit.Player;
import cn.nukkit.entity.projectile.EntityArrow;
import cn.nukkit.entity.projectile.EntityEgg;
import cn.nukkit.entity.projectile.EntitySnowball;
import cn.nukkit.entity.projectile.EntityThrownTrident;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageByChildEntityEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.level.Sound;

public class DingSoundListener implements Listener {

    @EventHandler(priority = EventPriority.LOW)
    @SuppressWarnings("unused")
    public void entityDamageEvent(EntityDamageEvent event){
        if (event.isCancelled()) return;
        if (!(event instanceof EntityDamageByChildEntityEvent)) return;
        EntityDamageByChildEntityEvent event1 = (EntityDamageByChildEntityEvent) event;
        if (!(event1.getEntity() instanceof Player)) return;
        if (!(event1.getDamager() instanceof Player)) return;
        if (event1.getChild() instanceof EntityArrow ||
                event1.getChild() instanceof EntitySnowball ||
                event1.getChild() instanceof EntityEgg ||
                event1.getChild() instanceof EntityThrownTrident){
            event1.getDamager().getLevel().addSound(event1.getDamager(), Sound.RANDOM_ORB, 1f, 1f, (Player) event1.getDamager());
        }
    }
}
