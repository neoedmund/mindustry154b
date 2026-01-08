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

import arc.func.Cons;
import arc.math.Mathf;
import arc.math.geom.Position;
import arc.math.geom.Rect;
import arc.util.Nullable;
import arc.util.Time;
import arc.util.io.Reads;
import arc.util.io.Writes;
import arc.util.pooling.Pool;
import java.nio.FloatBuffer;
import mindustry.annotations.Annotations;
import mindustry.type.Liquid;
import mindustry.world.Block;
import mindustry.world.Tile;
import mindustry.world.blocks.environment.Floor;

@SuppressWarnings("deprecation")
public class Puddle implements Pool.Poolable, Drawc, Entityc, IndexableEntity__all, IndexableEntity__draw, IndexableEntity__puddle, IndexableEntity__sync, Posc, Puddlec, Syncc {
  protected static Puddle paramPuddle;

  protected static final Rect rect = new Rect();

  protected static final Rect rect2 = new Rect();

  protected static Cons<Unit> unitCons = (unit)->{
      if (unit.isGrounded() && !unit.type.hovering) {
          unit.hitbox(rect2);
          if (rect.overlaps(rect2)) {
              unit.apply(paramPuddle.liquid.effect, 60 * 2);
              if (unit.vel.len2() > 0.1F * 0.1F) {
                  Fx.ripple.at(unit.x, unit.y, unit.type.rippleScale, paramPuddle.liquid.color);
              }
          }
      }
  };

  public transient float accepting;

  protected transient boolean added;

  public float amount;

  public transient float effectTime = Mathf.random(50.0F);

  public transient int id = EntityGroup.nextId();

  protected transient int index__all = -1;

  protected transient int index__draw = -1;

  protected transient int index__puddle = -1;

  protected transient int index__sync = -1;

  public transient float lastRipple = Time.time + Mathf.random(40.0F);

  public transient long lastUpdated;

  public Liquid liquid;

  public Tile tile;

  public transient long updateSpacing;

  public transient float updateTime;

  @Annotations.SyncField(true)
  @Annotations.SyncLocal
  public float x;

  private transient float x_LAST_;

  private transient float x_TARGET_;

  @Annotations.SyncField(true)
  @Annotations.SyncLocal
  public float y;

  private transient float y_LAST_;

  private transient float y_TARGET_;

  protected Puddle() {
  }

  @Nullable
  public Building buildOn() {
        return world.buildWorld(x, y);
  }

  @Nullable
  public Tile tileOn() {
        return world.tileWorld(x, y);
  }

  @Override
  public float x() {
    return x;
  }

  @Override
  public float y() {
    return y;
  }

  @Override
  public int classId() {
    return 13;
  }

  @Override
  public int id() {
    return id;
  }

  @Override
  public String toString() {
    return "Puddle#" + id;
  }

  @Override
  public long lastUpdated() {
    return lastUpdated;
  }

  @Override
  public long updateSpacing() {
    return updateSpacing;
  }

  @Override
  public void id(int id) {
    this.id = id;
  }

  @Override
  public void lastUpdated(long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public void setIndex__all(int index) {
    index__all = index;
  }

  @Override
  public void setIndex__draw(int index) {
    index__draw = index;
  }

  @Override
  public void setIndex__puddle(int index) {
    index__puddle = index;
  }

  @Override
  public void setIndex__sync(int index) {
    index__sync = index;
  }

  @Override
  public void updateSpacing(long updateSpacing) {
    this.updateSpacing = updateSpacing;
  }

  @Override
  public void x(float x) {
    this.x = x;
  }

  @Override
  public void y(float y) {
    this.y = y;
  }

  @Annotations.CallSuper
  public void read(Reads read) {
    short REV = read.s();
    if(REV == 0) {
      this.amount = read.f();
      read.i();
      this.liquid = mindustry.Vars.content.getByID(mindustry.ctype.ContentType.liquid, read.s());
      this.tile = mindustry.io.TypeIO.readTile(read);
      this.x = read.f();
      this.y = read.f();
    } else if(REV == 1) {
      this.amount = read.f();
      this.liquid = mindustry.Vars.content.getByID(mindustry.ctype.ContentType.liquid, read.s());
      this.tile = mindustry.io.TypeIO.readTile(read);
      this.x = read.f();
      this.y = read.f();
    } else {
      throw new IllegalArgumentException("Unknown revision '" + REV + "' for entity type 'PuddleComp'");
    }
        afterRead();
  }

  @Annotations.CallSuper
  public void write(Writes write) {
    write.s(1);
    write.f(this.amount);
    write.s(this.liquid.id);
    mindustry.io.TypeIO.writeTile(write, this.tile);
    write.f(this.x);
    write.f(this.y);
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

  public boolean isSyncHidden(Player player) {
        return false;
  }

  public boolean onSolid() {
        Tile tile = tileOn();
        return tile == null || tile.solid();
  }

  public boolean serialize() {
    return true;
  }

  public float clipSize() {
        return 50;
  }

  public float getFlammability() {
        return liquid.flammability * amount;
  }

  public float getX() {
        return x;
  }

  public float getY() {
        return y;
  }

  public int tileX() {
        return World.toTile(x);
  }

  public int tileY() {
        return World.toTile(y);
  }

  public Block blockOn() {
        Tile tile = tileOn();
        return tile == null ? Blocks.air : tile.block();
  }

  public Floor floorOn() {
        Tile tile = tileOn();
        return tile == null || tile.block() != Blocks.air ? (Floor)Blocks.air : tile.floor();
  }

  public static Puddle create() {
    return Pools.obtain(Puddle.class, Puddle::new);
  }

  public void add() {
    if(added == true) return;
    index__all = Groups.all.addIndex(this);
    index__sync = Groups.sync.addIndex(this);
    index__draw = Groups.draw.addIndex(this);
    index__puddle = Groups.puddle.addIndex(this);
        added = true;
  }

  public void afterRead() {
    puddle: {
        Puddles.register(this);
    }
  }

  public void afterReadAll() {
  }

  public void afterSync() {
    puddle: {
        if (liquid != null) {
            Puddles.register(this);
        }
    }
  }

  public void beforeWrite() {
  }

  public void draw() {
    puddle: {
        Draw.z(Layer.debris - 1);
        liquid.drawPuddle(this);
    }
  }

  public void handleSyncHidden() {
  }

  public void interpolate() {
    if(lastUpdated != 0 && updateSpacing != 0) {
      float timeSinceUpdate = Time.timeSinceMillis(lastUpdated);
      float alpha = Math.min(timeSinceUpdate / updateSpacing, 2f);
      x = (Mathf.lerp(x_LAST_, x_TARGET_, alpha));
      y = (Mathf.lerp(y_LAST_, y_TARGET_, alpha));
    } else if(lastUpdated != 0) {
      x = x_TARGET_;
      y = y_TARGET_;
    }
  }

  public void readSync(Reads read) {
    if(lastUpdated != 0) updateSpacing = Time.timeSinceMillis(lastUpdated);
    lastUpdated = Time.millis();
    boolean islocal = isLocal();
    this.amount = read.f();
    this.liquid = mindustry.Vars.content.getByID(mindustry.ctype.ContentType.liquid, read.s());
    this.tile = mindustry.io.TypeIO.readTile(read);
    if(!islocal) {
      x_LAST_ = this.x;
      this.x_TARGET_ = read.f();
    } else {
      read.f();
      x_LAST_ = this.x;
      x_TARGET_ = this.x;
    }
    if(!islocal) {
      y_LAST_ = this.y;
      this.y_TARGET_ = read.f();
    } else {
      read.f();
      y_LAST_ = this.y;
      y_TARGET_ = this.y;
    }
    afterSync();
  }

  public void readSyncManual(FloatBuffer buffer) {
    if(lastUpdated != 0) updateSpacing = Time.timeSinceMillis(lastUpdated);
    lastUpdated = Time.millis();
    this.x_LAST_ = this.x;
    this.x_TARGET_ = buffer.get();
    this.y_LAST_ = this.y;
    this.y_TARGET_ = buffer.get();
  }

  public void remove() {
    if(added == false) return;
    Groups.all.removeIndex(this, index__all);;
    index__all = -1;
    Groups.sync.removeIndex(this, index__sync);;
    index__sync = -1;
    Groups.draw.removeIndex(this, index__draw);;
    index__draw = -1;
    Groups.puddle.removeIndex(this, index__puddle);;
    index__puddle = -1;
    entity: {
        added = false;
    }
    puddle: {
        Puddles.remove(tile);
    }
    sync: {
        if (Vars.net.client()) {
            Vars.netClient.addRemovedEntity(id());
        }
    }
    mindustry.gen.Groups.queueFree((Pool.Poolable)this);
  }

  public void reset() {
    accepting = 0;
    added = false;
    amount = 0;
    effectTime = Mathf.random(50.0F);
    id = EntityGroup.nextId();
    lastRipple = Time.time + Mathf.random(40.0F);
    lastUpdated = 0;
    liquid = null;
    tile = null;
    updateSpacing = 0;
    updateTime = 0;
    x = 0;
    y = 0;
  }

  public void set(Position pos) {
        set(pos.getX(), pos.getY());
  }

  public void set(float x, float y) {
        this.x = x;
        this.y = y;
  }

  public void snapInterpolation() {
    updateSpacing = 16;
    lastUpdated = Time.millis();
    x_LAST_ = x;
    x_TARGET_ = x;
    y_LAST_ = y;
    y_TARGET_ = y;
  }

  public void snapSync() {
    updateSpacing = 16;
    lastUpdated = Time.millis();
    x_LAST_ = x_TARGET_;
    x = x_TARGET_;
    y_LAST_ = y_TARGET_;
    y = y_TARGET_;
  }

  public void trns(Position pos) {
        trns(pos.getX(), pos.getY());
  }

  public void trns(float x, float y) {
        set(this.x + x, this.y + y);
  }

  public void update() {
    puddle: {
        if (liquid == null || tile == null) {
            remove();
            break puddle;
        }
        float addSpeed = accepting > 0 ? 3.0F : 0.0F;
        amount -= Time.delta * (1.0F - liquid.viscosity) / (5.0F + addSpeed);
        amount += accepting;
        amount = Math.min(amount, maxLiquid);
        accepting = 0.0F;
        if (amount >= maxLiquid / 1.5F) {
            float deposited = Math.min((amount - maxLiquid / 1.5F) / 4.0F, 0.3F * Time.delta);
            int targets = 0;
            for (Point2 point : Geometry.d4) {
                Tile other = world.tile(tile.x + point.x, tile.y + point.y);
                if (other != null && (other.block() == Blocks.air || liquid.moveThroughBlocks)) {
                    targets++;
                    Puddles.deposit(other, tile, liquid, deposited, false);
                }
            }
            amount -= deposited * targets;
        }
        if (liquid.capPuddles) {
            amount = Mathf.clamp(amount, 0, maxLiquid);
        }
        if (amount <= 0.0F) {
            remove();
            break puddle;
        }
        if (Puddles.get(tile) != this && added) {
            Groups.all.remove(this);
            Groups.draw.remove(this);
            Groups.puddle.remove(this);
            added = false;
            break puddle;
        }
        if (amount >= maxLiquid / 2.0F && updateTime <= 0.0F) {
            paramPuddle = this;
            Units.nearby(rect.setSize(Mathf.clamp(amount / (maxLiquid / 1.5F)) * 10.0F).setCenter(x, y), unitCons);
            if (liquid.temperature > 0.7F && tile.build != null && Mathf.chance(0.5)) {
                Fires.create(tile);
            }
            updateTime = 40.0F;
            if (tile.build != null) {
                tile.build.puddleOn(this);
            }
        }
        if (!headless && liquid.particleEffect != Fx.none) {
            if ((effectTime += Time.delta) >= liquid.particleSpacing) {
                float size = Mathf.clamp(amount / (maxLiquid / 1.5F)) * 4.0F;
                liquid.particleEffect.at(x + Mathf.range(size), y + Mathf.range(size));
                effectTime = 0.0F;
            }
        }
        updateTime -= Time.delta;
        liquid.update(this);
    }
    sync: {
        if ((Vars.net.client() && !isLocal()) || isRemote()) {
            interpolate();
        }
    }
  }

  public void writeSync(Writes write) {
    write.f(this.amount);
    write.s(this.liquid.id);
    mindustry.io.TypeIO.writeTile(write, this.tile);
    write.f(this.x);
    write.f(this.y);
  }

  public void writeSyncManual(FloatBuffer buffer) {
    buffer.put(this.x);
    buffer.put(this.y);
  }
}
