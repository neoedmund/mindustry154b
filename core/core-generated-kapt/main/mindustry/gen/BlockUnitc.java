package mindustry.gen;

import arc.graphics.g2d.TextureRegion;
import mindustry.annotations.Annotations;
import mindustry.game.Team;

/**
 * Interface for {@link mindustry.entities.comp.BlockUnitComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface BlockUnitc extends Builderc, Drawc, Entityc, Healthc, Hitboxc, Itemsc, Minerc, Physicsc, Posc, Rotc, Shieldc, Statusc, Syncc, Teamc, Unitc, Velc, Weaponsc {
  Building tile();

  TextureRegion icon();

  boolean dead();

  boolean isAdded();

  boolean isValid();

  void add();

  void damage(float v, boolean b);

  void killed();

  void team(Team team);

  void tile(Building tile);

  void update();
}
