package com.willfp.ecoenchants.enchantments.ecoenchants.normal;

import com.willfp.ecoenchants.enchantments.EcoEnchant;
import com.willfp.ecoenchants.enchantments.EcoEnchantBuilder;
import com.willfp.ecoenchants.enchantments.EcoEnchants;
import com.willfp.ecoenchants.enchantments.util.EnchantmentUtils;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public final class Blind extends EcoEnchant {
    public Blind() {
        super(
                new EcoEnchantBuilder("blind", EnchantmentType.NORMAL, 5.0)
        );
    }

    // START OF LISTENERS


    @Override
    public void onArrowDamage(LivingEntity attacker, LivingEntity victim, Arrow arrow, int level, EntityDamageByEntityEvent event) {

        if(!EnchantmentUtils.passedChance(this, level))
            return;

        int duration = this.getConfig().getInt(EcoEnchants.CONFIG_LOCATION + "duration-per-level");

        victim.setVelocity(new Vector(0, 0, 0));
        victim.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, duration * level, level));
    }
}
