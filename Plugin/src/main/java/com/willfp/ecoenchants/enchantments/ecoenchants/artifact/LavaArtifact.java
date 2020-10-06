package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import org.bukkit.Particle;
public final class LavaArtifact extends Artifact {
    public LavaArtifact() {
        super(
                "lava_artifact",
                5.0,
                Particle.DRIP_LAVA
        );
    }
}