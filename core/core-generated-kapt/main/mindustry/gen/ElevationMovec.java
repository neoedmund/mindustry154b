package mindustry.gen;

import mindustry.annotations.Annotations;
import mindustry.entities.EntityCollisions;

/**
 * Interface for {@link mindustry.entities.comp.ElevationMoveComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface ElevationMovec extends Builderc, Drawc, Entityc, Healthc, Hitboxc, Itemsc, Minerc, Physicsc, Posc, Rotc, Shieldc, Statusc, Syncc, Teamc, Unitc, Velc, Weaponsc {
  EntityCollisions.SolidPred solidity();
}
