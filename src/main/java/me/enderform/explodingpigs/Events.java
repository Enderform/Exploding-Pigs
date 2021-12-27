package me.enderform.explodingpigs;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Events implements Listener {

    @EventHandler
    private void onPlayerDamagePig(EntityDamageByEntityEvent event) {
        Entity entity = event.getEntity();

        if (entity.getType() != EntityType.PIG)
            return;

        Entity damager = event.getDamager();

        if (damager.getType() != EntityType.PLAYER)
            return;

        Location location = entity.getLocation();

        entity
            .getWorld()
            .createExplosion(location, 15.0f);
    }

}
