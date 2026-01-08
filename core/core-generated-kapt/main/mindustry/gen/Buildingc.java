package mindustry.gen;

import arc.math.geom.QuadTree.QuadTreeObject;
import mindustry.annotations.Annotations;
import mindustry.entities.Sized;
import mindustry.logic.Controllable;
import mindustry.logic.Senseable;
import mindustry.logic.Settable;
import mindustry.ui.Displayable;

/**
 * Interface for {@link mindustry.entities.comp.BuildingComp}
 */
@Annotations.EntityInterface
@SuppressWarnings("deprecation")
public interface Buildingc extends QuadTreeObject, Sized, Entityc, Healthc, Posc, Teamc, Timerc, Controllable, Senseable, Settable, Displayable {
}
