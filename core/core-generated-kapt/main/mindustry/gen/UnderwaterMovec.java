package mindustry.gen;

import mindustry.annotations.Annotations;
import mindustry.game.Team;

/**
 * Interface for {@link mindustry.entities.comp.UnderwaterMoveComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface UnderwaterMovec extends Builderc, Drawc, Entityc, Healthc, Hitboxc, Itemsc, Minerc, Physicsc, Posc, Rotc, Shieldc, Statusc, Syncc, Teamc, Unitc, Velc, WaterMovec, Weaponsc {
  boolean hittable();

  boolean targetable(Team targeter);

  int collisionLayer();

  void draw();
}
