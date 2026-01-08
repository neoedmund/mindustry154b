package mindustry.gen;

import arc.graphics.g2d.TextureRegion;
import arc.math.geom.Position;
import arc.math.geom.Vec2;
import arc.scene.ui.layout.Table;
import arc.util.Nullable;
import mindustry.ai.types.CommandAI;
import mindustry.annotations.Annotations;
import mindustry.ctype.Content;
import mindustry.ctype.UnlockableContent;
import mindustry.entities.abilities.Ability;
import mindustry.entities.units.UnitController;
import mindustry.game.Team;
import mindustry.graphics.Trail;
import mindustry.logic.LAccess;
import mindustry.logic.Ranged;
import mindustry.logic.Senseable;
import mindustry.logic.Settable;
import mindustry.type.UnitType;
import mindustry.ui.Displayable;
import mindustry.world.blocks.environment.Floor;

/**
 * Interface for {@link mindustry.entities.comp.UnitComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface Unitc extends Builderc, Drawc, Entityc, Healthc, Hitboxc, Itemsc, Minerc, Physicsc, Posc, Rotc, Shieldc, Statusc, Syncc, Teamc, Velc, Weaponsc, Ranged, Senseable, Settable, Displayable {
  /**
   * @return a preview UI icon for this unit. 
   */
  TextureRegion icon();

  /**
   * @return approx. square size of the physical hitbox for physics 
   */
  float physicSize();

  /**
   * @return name of direct or indirect player controller. 
   */
  String getControllerName();

  /**
   * @return speed with boost & floor multipliers factored in. 
   */
  float speed();

  /**
   * @return the collision layer to use for unit physics. Returning anything outside of PhysicsProcess contents will crash the game. 
   */
  int collisionLayer();

  /**
   * @return where the unit wants to look at. 
   */
  float prefRotation();

  /**
   * @return whether the unit *can* be commanded, even if its controller is not currently CommandAI. 
   */
  boolean allowCommand();

  /**
   * @return whether the unit has a CommandAI controller 
   */
  boolean isCommandable();

  /**
   * @return whether there is solid, un-occupied ground under this unit. 
   */
  boolean canLand();

  /**
   * Actually destroys the unit, removing it and creating explosions. 
   */
  void destroy();

  /**
   * Called when this unit was unloaded from a factory or spawn point. 
   */
  void unloaded();

  /**
   * Move based on preferred unit movement type. 
   */
  void movePref(Vec2 movement);

  @Nullable
  Trail trail();

  @Nullable
  UnitType dockedType();

  @Nullable
  Floor lastDrownFloor();

  Player getPlayer();

  boolean canDrown();

  boolean canShoot();

  boolean canTarget(Teamc other);

  boolean checkTarget(boolean targetAir, boolean targetGround);

  boolean collides(Hitboxc other);

  boolean displayable();

  boolean hasWeapons();

  boolean hittable();

  boolean inFogTo(Team viewer);

  boolean inRange(Position other);

  boolean isAI();

  boolean isEnemy();

  boolean isFlying();

  boolean isGrounded();

  boolean isMissile();

  boolean isPathImpassable(int tileX, int tileY);

  boolean isPlayer();

  boolean isSyncHidden(Player player);

  boolean killable();

  boolean playerControllable();

  boolean shouldUpdateController();

  boolean spawnedByCore();

  boolean targetable(Team targeter);

  double flag();

  double sense(Content content);

  double sense(LAccess sensor);

  float bounds();

  float clipSize();

  float drownTime();

  float elevation();

  float floorSpeedMultiplier();

  float healTime();

  float range();

  float shadowAlpha();

  float splashTimer();

  int cap();

  int count();

  int itemCapacity();

  int lastFogPos();

  Object senseObject(LAccess sensor);

  String lastCommanded();

  String toString();

  CommandAI command();

  Ability[] abilities();

  UnitController controller();

  UnitType type();

  Floor drownFloor();

  void abilities(Ability[] abilities);

  void add();

  void afterRead();

  void afterReadAll();

  void afterSync();

  void aimLook(Position pos);

  void aimLook(float x, float y);

  void approach(Vec2 vector);

  void collision(Hitboxc other, float x, float y);

  void controller(UnitController next);

  void display(Table table);

  void dockedType(@Nullable UnitType dockedType);

  void draw();

  void drownTime(float drownTime);

  void elevation(float elevation);

  void flag(double flag);

  void handleSyncHidden();

  void heal(float amount);

  void healTime(float healTime);

  void kill();

  void killed();

  void landed();

  void lastCommanded(String lastCommanded);

  void lastDrownFloor(@Nullable Floor lastDrownFloor);

  void lastFogPos(int lastFogPos);

  void lookAt(Position pos);

  void lookAt(float angle);

  void lookAt(float x, float y);

  void moveAt(Vec2 vector);

  void moveAt(Vec2 vector, float acceleration);

  void remove();

  void resetController();

  void rotateMove(Vec2 vec);

  void set(UnitType def, UnitController controller);

  void setProp(UnlockableContent content, double value);

  void setProp(LAccess prop, double value);

  void setProp(LAccess prop, Object value);

  void setType(UnitType type);

  void shadowAlpha(float shadowAlpha);

  void spawnedByCore(boolean spawnedByCore);

  void splashTimer(float splashTimer);

  void trail(@Nullable Trail trail);

  void type(UnitType type);

  void update();

  void updateBoosting(boolean boost);

  void updateDrowning();

  void wobble();
}
