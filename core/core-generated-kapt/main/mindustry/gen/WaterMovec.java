package mindustry.gen;

import mindustry.annotations.Annotations;
import mindustry.entities.EntityCollisions;

/**
 * Interface for {@link mindustry.entities.comp.WaterMoveComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface WaterMovec extends Builderc, Drawc, Entityc, Healthc, Hitboxc, Itemsc, Minerc, Physicsc, Posc, Rotc, Shieldc, Statusc, Syncc, Teamc, Unitc, Velc, Weaponsc {
  boolean onLiquid();

  boolean onSolid();

  float floorSpeedMultiplier();

  EntityCollisions.SolidPred solidity();

  void add();

  void draw();

  void update();
}
