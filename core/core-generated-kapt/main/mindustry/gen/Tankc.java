package mindustry.gen;

import arc.math.geom.Vec2;
import mindustry.annotations.Annotations;
import mindustry.world.blocks.environment.Floor;

/**
 * Interface for {@link mindustry.entities.comp.TankComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface Tankc extends Builderc, Drawc, ElevationMovec, Entityc, Healthc, Hitboxc, Itemsc, Minerc, Physicsc, Posc, Rotc, Shieldc, Statusc, Syncc, Teamc, Unitc, Velc, Weaponsc {
  boolean walked();

  float floorSpeedMultiplier();

  float treadTime();

  Floor drownFloor();

  Floor lastDeepFloor();

  void approach(Vec2 vector);

  void lastDeepFloor(Floor lastDeepFloor);

  void moveAt(Vec2 vector, float acceleration);

  void treadTime(float treadTime);

  void update();

  void walked(boolean walked);
}
