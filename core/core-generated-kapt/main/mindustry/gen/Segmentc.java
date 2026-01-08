package mindustry.gen;

import arc.util.Nullable;
import mindustry.annotations.Annotations;

/**
 * Interface for {@link mindustry.entities.comp.SegmentComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface Segmentc extends Builderc, Drawc, Entityc, Healthc, Hitboxc, Itemsc, Minerc, Physicsc, Posc, Rotc, Shieldc, Statusc, Syncc, Teamc, Unitc, Velc, Weaponsc {
  @Nullable
  Segmentc childSegment();

  @Nullable
  Segmentc headSegment();

  @Nullable
  Segmentc parentSegment();

  boolean ignoreSolids();

  boolean isCommandable();

  boolean isHead();

  boolean moving();

  boolean playerControllable();

  boolean shouldUpdateController();

  int collisionLayer();

  int parentId();

  int segmentIndex();

  void addChild(Unit other);

  void afterReadAll();

  void afterSync();

  void beforeWrite();

  void checkParent();

  void childSegment(@Nullable Segmentc childSegment);

  void headSegment(@Nullable Segmentc headSegment);

  void parentId(int parentId);

  void parentSegment(@Nullable Segmentc parentSegment);

  void segmentIndex(int segmentIndex);

  void update();

  void updateSegment(Segmentc head, Segmentc parent, int index);
}
