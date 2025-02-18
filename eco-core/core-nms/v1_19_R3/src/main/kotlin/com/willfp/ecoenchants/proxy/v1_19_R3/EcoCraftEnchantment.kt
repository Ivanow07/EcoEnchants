package com.willfp.ecoenchants.proxy.v1_19_R3

import com.willfp.ecoenchants.enchants.EcoEnchant
import com.willfp.ecoenchants.enchants.EcoEnchants
import com.willfp.ecoenchants.vanilla.VanillaEnchantmentData
import net.minecraft.world.item.enchantment.Enchantment
import org.bukkit.craftbukkit.v1_19_R3.enchantments.CraftEnchantment

class EcoCraftEnchantment(
    target: Enchantment,
    private val data: VanillaEnchantmentData
) : CraftEnchantment(target) {
    override fun getMaxLevel(): Int = data.maxLevel ?: super.getMaxLevel()

    override fun conflictsWith(other: org.bukkit.enchantments.Enchantment): Boolean {
        if (other is EcoEnchant) {
            return other.conflictsWith(this)
        }

        return data.conflicts?.contains(other.key) ?: super.conflictsWith(other)
    }

    fun register() {
        EcoEnchants.register(this)
    }
}
