package mindustry.gen;

import arc.graphics.Color;
import arc.struct.Bits;
import mindustry.annotations.Annotations;
import mindustry.entities.units.StatusEntry;
import mindustry.type.StatusEffect;

/**
 * Interface for {@link mindustry.entities.comp.StatusComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface Statusc extends Entityc, Posc {
  /**
   *  Applies a dynamic status effect, with stat multipliers that can be customized.
   *  @return the entry to write multipliers to. If the dynamic status was already applied, returns the previous entry.
   *  
   */
  StatusEntry applyDynamicStatus();

  /**
   * Adds a status effect to this unit. 
   */
  void apply(StatusEffect effect, float duration);

  /**
   * Apply a status effect for 1 tick (for permanent effects) 
   */
  void apply(StatusEffect effect);

  /**
   * Removes a status effect. 
   */
  void unapply(StatusEffect effect);

  /**
   * Uses a dynamic status effect to change damage. 
   */
  void statusDamageMultiplier(float damageMultiplier);

  /**
   * Uses a dynamic status effect to change reload. 
   */
  void statusReloadMultiplier(float reloadMultiplier);

  /**
   * Uses a dynamic status effect to override armor. 
   */
  void statusArmor(float armor);

  /**
   * Uses a dynamic status effect to override build speed. 
   */
  void statusBuildSpeed(float buildSpeed);

  /**
   * Uses a dynamic status effect to override drag. 
   */
  void statusDrag(float drag);

  /**
   * Uses a dynamic status effect to override max health. 
   */
  void statusMaxHealth(float health);

  /**
   * Uses a dynamic status effect to override speed (in tiles/second). 
   */
  void statusSpeed(float speed);

  Color statusColor();

  Bits statusBits();

  boolean disarmed();

  boolean hasEffect(StatusEffect effect);

  boolean isBoss();

  boolean isGrounded();

  boolean isImmune(StatusEffect effect);

  float armorOverride();

  float buildSpeedMultiplier();

  float damageMultiplier();

  float dragMultiplier();

  float getDuration(StatusEffect effect);

  float healthMultiplier();

  float reloadMultiplier();

  float speedMultiplier();

  void armorOverride(float armorOverride);

  void buildSpeedMultiplier(float buildSpeedMultiplier);

  void clearStatuses();

  void damageMultiplier(float damageMultiplier);

  void disarmed(boolean disarmed);

  void dragMultiplier(float dragMultiplier);

  void draw();

  void healthMultiplier(float healthMultiplier);

  void reloadMultiplier(float reloadMultiplier);

  void speedMultiplier(float speedMultiplier);

  void update();
}
