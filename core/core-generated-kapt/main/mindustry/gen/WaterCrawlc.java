package mindustry.gen;

import mindustry.annotations.Annotations;
import mindustry.entities.EntityCollisions;

/**
 * Interface for {@link mindustry.entities.comp.WaterCrawlComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface WaterCrawlc extends Builderc, Crawlc, Drawc, Entityc, Healthc, Hitboxc, Itemsc, Minerc, Physicsc, Posc, Rotc, Shieldc, Statusc, Syncc, Teamc, Unitc, Velc, Weaponsc {
  boolean onLiquid();

  boolean onSolid();

  float floorSpeedMultiplier();

  EntityCollisions.SolidPred solidity();
}
