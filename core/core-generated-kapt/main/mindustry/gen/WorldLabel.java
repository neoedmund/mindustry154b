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

import arc.math.Mathf;
import arc.math.geom.Position;
import arc.util.Nullable;
import arc.util.Time;
import arc.util.io.Reads;
import arc.util.io.Writes;
import java.nio.FloatBuffer;
import mindustry.annotations.Annotations;
import mindustry.world.Block;
import mindustry.world.Tile;
import mindustry.world.blocks.environment.Floor;

@SuppressWarnings("deprecation")
public class WorldLabel implements Drawc, Entityc, IndexableEntity__all, IndexableEntity__draw, IndexableEntity__label, IndexableEntity__sync, Posc, Syncc, WorldLabelc {
  public static final byte flagAlignLeft = 4;

  public static final byte flagAlignRight = 8;

  public static final byte flagAutoscale = 16;

  public static final byte flagBackground = 1;

  public static final byte flagOutline = 2;

  protected transient boolean added;

  public byte flags = flagBackground | flagOutline;

  public float fontSize = 1.0F;

  public transient int id = EntityGroup.nextId();

  protected transient int index__all = -1;

  protected transient int index__draw = -1;

  protected transient int index__label = -1;

  protected transient int index__sync = -1;

  public transient long lastUpdated;

  public String text = "sample text";

  public transient long updateSpacing;

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

  public float z = Layer.playerName + 1;

  protected WorldLabel() {
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
    return 35;
  }

  @Override
  public int id() {
    return id;
  }

  @Override
  public String toString() {
    return "WorldLabel#" + id;
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
  public void setIndex__label(int index) {
    index__label = index;
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
      this.flags = read.b();
      this.fontSize = read.f();
      this.text = mindustry.io.TypeIO.readString(read);
      this.x = read.f();
      this.y = read.f();
      this.z = read.f();
    } else {
      throw new IllegalArgumentException("Unknown revision '" + REV + "' for entity type 'WorldLabelComp'");
    }
        afterRead();
  }

  @Annotations.CallSuper
  public void write(Writes write) {
    write.s(0);
    write.b(this.flags);
    write.f(this.fontSize);
    mindustry.io.TypeIO.writeString(write, this.text);
    write.f(this.x);
    write.f(this.y);
    write.f(this.z);
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
    return false;
  }

  public float clipSize() {
        return text.length() * 10.0F * fontSize;
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

  public static WorldLabel create() {
    return new WorldLabel();
  }

  public static void drawAt(String text, float x, float y, float layer, int flags, float fontSize,
      int align, int lineAlign) {
        Draw.z(layer);
        float z = Drawf.text();
        Font font = (flags & flagOutline) != 0 ? Fonts.outline : Fonts.def;
        GlyphLayout layout = Pools.obtain(GlyphLayout.class, GlyphLayout::new);
        boolean ints = font.usesIntegerPositions();
        font.setUseIntegerPositions(false);
        font.getData().setScale(0.25F * fontSize / Scl.scl(1.0F) / ((flags & flagAutoscale) != 0 ? 0.2F * Vars.renderer.camerascale + 0.05F : 1.0F));
        layout.setText(font, text);
        int border = (flags & flagBackground) != 0 ? 1 : 0;
        if (Align.isBottom(align)) {
            y += layout.height + border * 1.5F;
        } else if (Align.isTop(align)) {
            y -= border * 1.5F;
        } else {
            y += layout.height / 2;
        }
        if (Align.isLeft(align)) {
            x += layout.width / 2 + border;
        } else if (Align.isRight(align)) {
            x -= layout.width / 2 + border;
        }
        if ((flags & flagBackground) != 0) {
            Draw.color(0.0F, 0.0F, 0.0F, 0.3F);
            Fill.rect(x, y - layout.height / 2, layout.width + 2, layout.height + 3);
            Draw.color();
        }
        float tx = Align.isLeft(lineAlign) ? -layout.width * 0.5F : Align.isRight(lineAlign) ? layout.width * 0.5F : 0;
        font.setColor(Color.white);
        font.draw(text, x + tx, y, 0, lineAlign, false);
        Draw.reset();
        Pools.free(layout);
        font.getData().setScale(1.0F);
        font.setColor(Color.white);
        font.setUseIntegerPositions(ints);
        Draw.z(z);
  }

  public void add() {
    if(added == true) return;
    index__all = Groups.all.addIndex(this);
    index__sync = Groups.sync.addIndex(this);
    index__draw = Groups.draw.addIndex(this);
    index__label = Groups.label.addIndex(this);
        added = true;
  }

  public void afterRead() {
  }

  public void afterReadAll() {
  }

  public void afterSync() {
  }

  public void beforeWrite() {
  }

  public void draw() {
    worldlabel: {
        drawAt(text, x, y, z, flags, fontSize, Align.center, (flags & flagAlignLeft) != 0 ? Align.left : (flags & flagAlignRight) != 0 ? Align.right : Align.center);
    }
  }

  public void handleSyncHidden() {
  }

  public void hide() {
        remove();
        Call.removeWorldLabel(id);
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
    this.flags = read.b();
    this.fontSize = read.f();
    this.text = mindustry.io.TypeIO.readString(read);
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
    this.z = read.f();
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
    Groups.label.removeIndex(this, index__label);;
    index__label = -1;
    entity: {
        added = false;
    }
    sync: {
        if (Vars.net.client()) {
            Vars.netClient.addRemovedEntity(id());
        }
    }
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
    sync: {
        if ((Vars.net.client() && !isLocal()) || isRemote()) {
            interpolate();
        }
    }
  }

  public void writeSync(Writes write) {
    write.b(this.flags);
    write.f(this.fontSize);
    mindustry.io.TypeIO.writeString(write, this.text);
    write.f(this.x);
    write.f(this.y);
    write.f(this.z);
  }

  public void writeSyncManual(FloatBuffer buffer) {
    buffer.put(this.x);
    buffer.put(this.y);
  }
}
