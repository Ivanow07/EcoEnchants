package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import org.bukkit.Particle;
public final class SparkleArtifact extends Artifact {
    public SparkleArtifact() {
        super(
                "sparkle_artifact",
                5.0,
                Particle.FIREWORKS_SPARK
        );
    }
}