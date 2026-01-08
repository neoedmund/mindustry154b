package mindustry.gen;

import arc.*;
import arc.Graphics.*;
import arc.Graphics.Cursor.*;
import arc.audio.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.math.geom.QuadTree.*;
import arc.scene.ui.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.struct.Queue;
import arc.util.*;
import arc.util.io.*;
import arc.util.noise.*;
import arc.util.pooling.*;
import java.nio.*;
import java.util.*;
import mindustry.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
import mindustry.async.*;
import mindustry.async.PhysicsProcess.*;
import mindustry.content.*;
import mindustry.core.*;
import mindustry.ctype.*;
import mindustry.editor.*;
import mindustry.entities.*;
import mindustry.entities.EntityCollisions.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.units.*;
import mindustry.game.*;
import mindustry.game.EventType.*;
import mindustry.game.Teams.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.input.*;
import mindustry.logic.*;
import mindustry.net.*;
import mindustry.net.Administration.*;
import mindustry.net.Packets.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.ConstructBlock.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.heat.HeatConductor.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.LogicBlock.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.storage.CoreBlock.*;
import mindustry.world.consumers.*;
import mindustry.world.meta.*;
import mindustry.world.modules.*;
import static mindustry.Vars.*;
import static mindustry.entities.Puddles.*;
import static mindustry.logic.GlobalVars.*;

import arc.util.io.Reads;
import arc.util.io.Writes;
import mindustry.world.blocks.power.PowerGraph;

@SuppressWarnings("deprecation")
public class PowerGraphUpdater implements Entityc, IndexableEntity__all, IndexableEntity__powerGraph, PowerGraphUpdaterc {
  protected transient boolean added;

  public transient PowerGraph graph;

  public transient int id = EntityGroup.nextId();

  protected transient int index__all = -1;

  protected transient int index__powerGraph = -1;

  protected PowerGraphUpdater() {
  }

  @Override
  public int classId() {
    return 42;
  }

  @Override
  public int id() {
    return id;
  }

  @Override
  public String toString() {
    return "PowerGraphUpdater#" + id;
  }

  @Override
  public PowerGraph graph() {
    return graph;
  }

  @Override
  public void graph(PowerGraph graph) {
    this.graph = graph;
  }

  @Override
  public void id(int id) {
    this.id = id;
  }

  @Override
  public void setIndex__all(int index) {
    index__all = index;
  }

  @Override
  public void setIndex__powerGraph(int index) {
    index__powerGraph = index;
  }

  public <T extends Entityc> T self() {
        return (T)this;
  }

  public <T> T as() {
        return (T)this;
  }

  public boolean isAdded() {
        return added;
  }

  public boolean isLocal() {
        return ((Object)this) == player || ((Object)this) instanceof Unitc u && u.controller() == player;
  }

  public boolean isRemote() {
        return ((Object)this) instanceof Unitc u && u.isPlayer() && !isLocal();
  }

  public boolean serialize() {
    return false;
  }

  public static PowerGraphUpdater create() {
    return new PowerGraphUpdater();
  }

  public void add() {
    if(added == true) return;
    index__all = Groups.all.addIndex(this);
    index__powerGraph = Groups.powerGraph.addIndex(this);
        added = true;
  }

  public void afterRead() {
  }

  public void afterReadAll() {
  }

  public void beforeWrite() {
  }

  public void read(Reads read) {
        afterRead();
  }

  public void remove() {
    if(added == false) return;
    Groups.all.removeIndex(this, index__all);;
    index__all = -1;
    Groups.powerGraph.removeIndex(this, index__powerGraph);;
    index__powerGraph = -1;
        added = false;
  }

  public void update() {
    powergraphupdater: {
        graph.update();
    }
  }

  public void write(Writes write) {
  }
}
