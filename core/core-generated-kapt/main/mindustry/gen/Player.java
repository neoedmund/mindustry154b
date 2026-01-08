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

import arc.graphics.Color;
import arc.graphics.g2d.TextureRegion;
import arc.math.Mathf;
import arc.math.geom.Position;
import arc.util.Interval;
import arc.util.Nullable;
import arc.util.Ratekeeper;
import arc.util.Time;
import arc.util.io.Reads;
import arc.util.io.Writes;
import java.nio.FloatBuffer;
import mindustry.ai.UnitCommand;
import mindustry.annotations.Annotations;
import mindustry.game.Team;
import mindustry.net.Administration;
import mindustry.net.NetConnection;
import mindustry.net.Packets;
import mindustry.world.Block;
import mindustry.world.Tile;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.storage.CoreBlock;

@SuppressWarnings("deprecation")
public class Player implements Drawc, Entityc, IndexableEntity__all, IndexableEntity__draw, IndexableEntity__player, IndexableEntity__sync, Playerc, Posc, Syncc, Timerc {
  public static final float deathDelay = 60.0F;

  protected transient boolean added;

  public boolean admin;

  @Annotations.SyncLocal
  public boolean boosting;

  public Color color = new Color();

  @Nullable
  public transient NetConnection con;

  public transient float deathTimer;

  public transient int id = EntityGroup.nextId();

  protected transient int index__all = -1;

  protected transient int index__draw = -1;

  protected transient int index__player = -1;

  protected transient int index__sync = -1;

  public transient Ratekeeper itemDepositRate = new Ratekeeper();

  @Nullable
  public transient Unit justSwitchFrom;

  @Nullable
  public transient Unit justSwitchTo;

  @Nullable
  @Annotations.NoSync
  public UnitCommand lastCommand;

  @Nullable
  protected transient Unit lastReadUnit;

  public transient String lastText = "";

  public transient long lastUpdated;

  public transient String locale = "en";

  @Annotations.SyncLocal
  public float mouseX;

  @Annotations.SyncLocal
  public float mouseY;

  public String name = "frog";

  @Annotations.SyncLocal
  public boolean shooting;

  @Annotations.ReadOnly
  protected Team team = Team.sharded;

  public transient float textFadeTime;

  public transient Interval timer = new Interval(6);

  @Annotations.SyncLocal
  public boolean typing;

  @Annotations.ReadOnly
  @Nullable
  protected Unit unit;

  public transient long updateSpacing;

  protected transient int wrongReadUnits;

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

  protected Player() {
  }

  @Nullable
  public Building buildOn() {
        return world.buildWorld(x, y);
  }

  @Nullable
  public Unit unit() {
        return unit;
  }

  @Nullable
  public Tile tileOn() {
        return world.tileWorld(x, y);
  }

  @Nullable
  public CoreBlock.CoreBuild bestCore() {
        var cores = team.cores();
        return cores.min((b)->cores.size == 1 || ((CoreBlock)b.block).unitType.supportsEnv(state.rules.env), Structs.comps(Structs.comparingInt((c)->-c.block.size), Structs.comparingFloat((c)->c.dst2(x, y))));
  }

  @Nullable
  public CoreBlock.CoreBuild closestCore() {
        return state.teams.closestCore(x, y, team);
  }

  @Nullable
  public CoreBlock.CoreBuild core() {
        return team.core();
  }

  @Override
  public Unit justSwitchFrom() {
    return justSwitchFrom;
  }

  @Override
  public Unit justSwitchTo() {
    return justSwitchTo;
  }

  @Override
  public Color color() {
    return color;
  }

  @Override
  public Interval timer() {
    return timer;
  }

  @Override
  public Ratekeeper itemDepositRate() {
    return itemDepositRate;
  }

  @Override
  public boolean admin() {
    return admin;
  }

  @Override
  public boolean boosting() {
    return boosting;
  }

  @Override
  public boolean shooting() {
    return shooting;
  }

  @Override
  public boolean typing() {
    return typing;
  }

  @Override
  public float deathTimer() {
    return deathTimer;
  }

  @Override
  public float mouseX() {
    return mouseX;
  }

  @Override
  public float mouseY() {
    return mouseY;
  }

  @Override
  public float textFadeTime() {
    return textFadeTime;
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
    return 12;
  }

  @Override
  public int id() {
    return id;
  }

  @Override
  public String lastText() {
    return lastText;
  }

  @Override
  public String locale() {
    return locale;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return "Player#" + id;
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
  public UnitCommand lastCommand() {
    return lastCommand;
  }

  @Override
  public Team team() {
    return team;
  }

  @Override
  public NetConnection con() {
    return con;
  }

  @Override
  public void admin(boolean admin) {
    this.admin = admin;
  }

  @Override
  public void boosting(boolean boosting) {
    this.boosting = boosting;
  }

  @Override
  public void color(Color color) {
    this.color = color;
  }

  @Override
  public void con(NetConnection con) {
    this.con = con;
  }

  @Override
  public void deathTimer(float deathTimer) {
    this.deathTimer = deathTimer;
  }

  @Override
  public void id(int id) {
    this.id = id;
  }

  @Override
  public void itemDepositRate(Ratekeeper itemDepositRate) {
    this.itemDepositRate = itemDepositRate;
  }

  @Override
  public void justSwitchFrom(Unit justSwitchFrom) {
    this.justSwitchFrom = justSwitchFrom;
  }

  @Override
  public void justSwitchTo(Unit justSwitchTo) {
    this.justSwitchTo = justSwitchTo;
  }

  @Override
  public void lastCommand(UnitCommand lastCommand) {
    this.lastCommand = lastCommand;
  }

  @Override
  public void lastText(String lastText) {
    this.lastText = lastText;
  }

  @Override
  public void lastUpdated(long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public void locale(String locale) {
    this.locale = locale;
  }

  @Override
  public void mouseX(float mouseX) {
    this.mouseX = mouseX;
  }

  @Override
  public void mouseY(float mouseY) {
    this.mouseY = mouseY;
  }

  @Override
  public void name(String name) {
    this.name = name;
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
  public void setIndex__player(int index) {
    index__player = index;
  }

  @Override
  public void setIndex__sync(int index) {
    index__sync = index;
  }

  @Override
  public void shooting(boolean shooting) {
    this.shooting = shooting;
  }

  @Override
  public void textFadeTime(float textFadeTime) {
    this.textFadeTime = textFadeTime;
  }

  @Override
  public void timer(Interval timer) {
    this.timer = timer;
  }

  @Override
  public void typing(boolean typing) {
    this.typing = typing;
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
      this.admin = read.bool();
      this.boosting = read.bool();
      this.color = mindustry.io.TypeIO.readColor(read, this.color);
      this.mouseX = read.f();
      this.mouseY = read.f();
      this.name = mindustry.io.TypeIO.readString(read);
      this.shooting = read.bool();
      this.team = mindustry.io.TypeIO.readTeam(read);
      this.typing = read.bool();
      this.unit = mindustry.io.TypeIO.readUnit(read);
      this.x = read.f();
      this.y = read.f();
    } else if(REV == 1) {
      this.admin = read.bool();
      this.boosting = read.bool();
      this.color = mindustry.io.TypeIO.readColor(read, this.color);
      this.lastCommand = mindustry.io.TypeIO.readCommand(read);
      this.mouseX = read.f();
      this.mouseY = read.f();
      this.name = mindustry.io.TypeIO.readString(read);
      this.shooting = read.bool();
      this.team = mindustry.io.TypeIO.readTeam(read);
      this.typing = read.bool();
      this.unit = mindustry.io.TypeIO.readUnit(read);
      this.x = read.f();
      this.y = read.f();
    } else {
      throw new IllegalArgumentException("Unknown revision '" + REV + "' for entity type 'PlayerComp'");
    }
        afterRead();
  }

  @Annotations.CallSuper
  public void write(Writes write) {
    write.s(1);
    write.bool(this.admin);
    write.bool(this.boosting);
    mindustry.io.TypeIO.writeColor(write, this.color);
    mindustry.io.TypeIO.writeCommand(write, this.lastCommand);
    write.f(this.mouseX);
    write.f(this.mouseY);
    mindustry.io.TypeIO.writeString(write, this.name);
    write.bool(this.shooting);
    mindustry.io.TypeIO.writeTeam(write, this.team);
    write.bool(this.typing);
    mindustry.io.TypeIO.writeUnit(write, this.unit);
    write.f(this.x);
    write.f(this.y);
  }

  public <T extends Entityc> T self() {
        return (T)this;
  }

  public <T> T as() {
        return (T)this;
  }

  public TextureRegion icon() {
        if (dead()) {
            if (core() == null) {
                return UnitTypes.alpha.uiIcon;
            }
            var bestCore = (CoreBuild)bestCore();
            if (bestCore == null) {
                return UnitTypes.alpha.uiIcon;
            }
            return ((CoreBlock)bestCore.block).unitType.uiIcon;
        }
        return unit.icon();
  }

  public boolean dead() {
        return unit == null || !unit.isValid();
  }

  public boolean displayAmmo() {
        return unit instanceof BlockUnitc || state.rules.unitAmmo;
  }

  public boolean isAdded() {
        return added;
  }

  public boolean isBuilder() {
        return unit != null && unit.canBuild();
  }

  public boolean isLocal() {
        return ((Object)this) == player || ((Object)this) instanceof Unitc u && u.controller() == player;
  }

  public boolean isLogicControllable() {
        return false;
  }

  public boolean isRemote() {
        return ((Object)this) instanceof Unitc u && u.isPlayer() && !isLocal();
  }

  public boolean isSyncHidden(Player player) {
        return false;
  }

  public boolean isValidController() {
        return isAdded();
  }

  public boolean onSolid() {
        Tile tile = tileOn();
        return tile == null || tile.solid();
  }

  public boolean serialize() {
    return false;
  }

  public boolean timer(int index, float time) {
        if (Float.isInfinite(time)) return false;
        return timer.get(index, time);
  }

  public float clipSize() {
        return unit == null ? 20 : unit.type.hitSize * 2.0F;
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

  public String coloredName() {
        return "[#" + color.toString().toUpperCase() + "]" + name;
  }

  public String ip() {
        return con == null ? "localhost" : con.address;
  }

  public String plainName() {
        return Strings.stripColors(name);
  }

  public String usid() {
        return con == null ? "[LOCAL]" : con.usid;
  }

  public String uuid() {
        return con == null ? "[LOCAL]" : con.uuid;
  }

  public Administration.PlayerInfo getInfo() {
        if (isLocal()) {
            throw new IllegalArgumentException("Local players cannot be traced and do not have info.");
        } else {
            return netServer.admins.getInfo(uuid());
        }
  }

  public Block blockOn() {
        Tile tile = tileOn();
        return tile == null ? Blocks.air : tile.block();
  }

  public Floor floorOn() {
        Tile tile = tileOn();
        return tile == null || tile.block() != Blocks.air ? (Floor)Blocks.air : tile.floor();
  }

  public static Player create() {
    return new Player();
  }

  public void add() {
    if(added == true) return;
    index__all = Groups.all.addIndex(this);
    index__player = Groups.player.addIndex(this);
    index__sync = Groups.sync.addIndex(this);
    index__draw = Groups.draw.addIndex(this);
        added = true;
  }

  public void afterRead() {
  }

  public void afterReadAll() {
  }

  public void afterSync() {
    player: {
        if (isLocal() && unit == justSwitchFrom && justSwitchFrom != null && justSwitchTo != null) {
            unit = justSwitchTo;
            if (++wrongReadUnits >= 2) {
                justSwitchFrom = null;
                wrongReadUnits = 0;
            }
        } else {
            justSwitchFrom = null;
            justSwitchTo = null;
            wrongReadUnits = 0;
        }
        Unit set = unit;
        unit = lastReadUnit;
        unit(set);
        lastReadUnit = unit;
        if (unit != null) {
            unit.aim(mouseX, mouseY);
            unit.controlWeapons(shooting, shooting);
            unit.controller(this);
        }
    }
  }

  public void beforeWrite() {
  }

  public void checkSpawn() {
        CoreBuild core = bestCore();
        if (core != null) {
            core.requestSpawn(this);
        }
  }

  public void clearUnit() {
        unit(null);
  }

  public void draw() {
    player: {
        if (unit == null || name == null || unit.inFogTo(Vars.player.team())) break player;
        Draw.z(Layer.playerName);
        float z = Drawf.text();
        Font font = Fonts.outline;
        GlyphLayout layout = Pools.obtain(GlyphLayout.class, GlyphLayout::new);
        final float nameHeight = 11;
        final float textHeight = 15;
        boolean ints = font.usesIntegerPositions();
        font.setUseIntegerPositions(false);
        font.getData().setScale(0.25F / Scl.scl(1.0F));
        layout.setText(font, name);
        if (!isLocal()) {
            Draw.color(0.0F, 0.0F, 0.0F, 0.3F);
            Fill.rect(unit.x, unit.y + nameHeight - layout.height / 2, layout.width + 2, layout.height + 3);
            Draw.color();
            font.setColor(color);
            font.draw(name, unit.x, unit.y + nameHeight, 0, Align.center, false);
            if (admin) {
                float s = 3.0F;
                Draw.color(color.r * 0.5F, color.g * 0.5F, color.b * 0.5F, 1.0F);
                Draw.rect(Icon.adminSmall.getRegion(), unit.x + layout.width / 2.0F + 2 + 1, unit.y + nameHeight - 1.5F, s, s);
                Draw.color(color);
                Draw.rect(Icon.adminSmall.getRegion(), unit.x + layout.width / 2.0F + 2 + 1, unit.y + nameHeight - 1.0F, s, s);
            }
        }
        if (Core.settings.getBool("playerchat") && ((textFadeTime > 0 && lastText != null) || typing)) {
            String text = textFadeTime <= 0 || lastText == null ? "[lightgray]" + Strings.animated(Time.time, 4, 15.0F, ".") : lastText;
            float width = 100.0F;
            float visualFadeTime = 1.0F - Mathf.curve(1.0F - textFadeTime, 0.9F);
            font.setColor(1.0F, 1.0F, 1.0F, textFadeTime <= 0 || lastText == null ? 1.0F : visualFadeTime);
            layout.setText(font, text, Color.white, width, Align.bottom, true);
            Draw.color(0.0F, 0.0F, 0.0F, 0.3F * (textFadeTime <= 0 || lastText == null ? 1.0F : visualFadeTime));
            Fill.rect(unit.x, unit.y + textHeight + layout.height - layout.height / 2.0F, layout.width + 2, layout.height + 3);
            font.draw(text, unit.x - width / 2.0F, unit.y + textHeight + layout.height, width, Align.center, true);
        }
        Draw.reset();
        Pools.free(layout);
        font.getData().setScale(1.0F);
        font.setColor(Color.white);
        font.setUseIntegerPositions(ints);
        Draw.z(z);
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

  public void kick(String reason) {
        con.kick(reason);
  }

  public void kick(String reason, long duration) {
        con.kick(reason, duration);
  }

  public void kick(Packets.KickReason reason) {
        con.kick(reason);
  }

  public void kick(Packets.KickReason reason, long duration) {
        con.kick(reason, duration);
  }

  public void readSync(Reads read) {
    if(lastUpdated != 0) updateSpacing = Time.timeSinceMillis(lastUpdated);
    lastUpdated = Time.millis();
    boolean islocal = isLocal();
    this.admin = read.bool();
    if(!islocal) {
      this.boosting = read.bool();
    } else {
      read.bool();
    }
    this.color = mindustry.io.TypeIO.readColor(read, this.color);
    if(!islocal) {
      this.mouseX = read.f();
    } else {
      read.f();
    }
    if(!islocal) {
      this.mouseY = read.f();
    } else {
      read.f();
    }
    this.name = mindustry.io.TypeIO.readString(read);
    if(!islocal) {
      this.shooting = read.bool();
    } else {
      read.bool();
    }
    this.team = mindustry.io.TypeIO.readTeam(read);
    if(!islocal) {
      this.typing = read.bool();
    } else {
      read.bool();
    }
    this.unit = mindustry.io.TypeIO.readUnit(read);
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
    Groups.player.removeIndex(this, index__player);;
    index__player = -1;
    Groups.sync.removeIndex(this, index__sync);;
    index__sync = -1;
    Groups.draw.removeIndex(this, index__draw);;
    index__draw = -1;
    entity: {
        added = false;
    }
    player: {
        if (unit != null) {
            clearUnit();
        }
        lastReadUnit = null;
        justSwitchTo = justSwitchFrom = null;
    }
    sync: {
        if (Vars.net.client()) {
            Vars.netClient.addRemovedEntity(id());
        }
    }
  }

  public void reset() {
        team = state.rules.defaultTeam;
        admin = typing = false;
        textFadeTime = 0.0F;
        x = y = 0.0F;
        if (!dead()) {
            unit.resetController();
            unit = null;
        }
  }

  public void sendMessage(String text) {
        sendMessage(text, null, null);
  }

  public void sendMessage(String text, Player from) {
        sendMessage(text, from, null);
  }

  public void sendMessage(String text, Player from, String unformatted) {
        if (isLocal()) {
            if (ui != null) {
                ui.chatfrag.addMessage(text);
            }
        } else {
            Call.sendMessage(con, text, unformatted, from);
        }
  }

  public void sendUnformatted(Player from, String unformatted) {
        sendMessage(netServer.chatFormatter.format(from, unformatted), from, unformatted);
  }

  public void sendUnformatted(String unformatted) {
        sendUnformatted(null, unformatted);
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

  public void team(Team team) {
        this.team = team;
        if (unit != null) {
            unit.team(team);
        }
  }

  public void trns(Position pos) {
        trns(pos.getX(), pos.getY());
  }

  public void trns(float x, float y) {
        set(this.x + x, this.y + y);
  }

  public void unit(Unit unit) {
        if (isLocal() && unit == justSwitchFrom && justSwitchFrom != null && justSwitchTo != null) {
            return;
        }
        if (this.unit == unit) return;
        if (unit != null && unit.controller() instanceof CommandAI ai) {
            lastCommand = ai.command;
        }
        if (this.unit != null) {
            this.unit.resetController();
            if (lastCommand != null && this.unit.controller() instanceof CommandAI ai) {
                ai.command(lastCommand);
            }
        }
        this.unit = unit;
        if (unit != null) {
            unit.team(team);
            unit.controller(this);
            if (unit.isRemote()) {
                unit.snapInterpolation();
            }
            if (!headless && isLocal()) {
                control.input.block = null;
            }
        }
        Events.fire(new UnitChangeEvent(this, unit));
  }

  public void update() {
    player: {
        if (unit != null && !unit.isValid()) {
            clearUnit();
        }
        CoreBuild core;
        if (!dead()) {
            set(unit);
            unit.team(team);
            deathTimer = 0;
            if (unit.type.canBoost) {
                unit.elevation = Mathf.approachDelta(unit.elevation, unit.onSolid() || boosting || (unit.isFlying() && !unit.canLand()) ? 1.0F : 0.0F, unit.type.riseSpeed);
            }
        } else if ((core = bestCore()) != null) {
            deathTimer += Time.delta;
            if (deathTimer >= deathDelay) {
                core.requestSpawn(this);
                deathTimer = 0;
            }
        }
        textFadeTime -= Time.delta / (60 * 5);
    }
    sync: {
        if ((Vars.net.client() && !isLocal()) || isRemote()) {
            interpolate();
        }
    }
  }

  public void writeSync(Writes write) {
    write.bool(this.admin);
    write.bool(this.boosting);
    mindustry.io.TypeIO.writeColor(write, this.color);
    write.f(this.mouseX);
    write.f(this.mouseY);
    mindustry.io.TypeIO.writeString(write, this.name);
    write.bool(this.shooting);
    mindustry.io.TypeIO.writeTeam(write, this.team);
    write.bool(this.typing);
    mindustry.io.TypeIO.writeUnit(write, this.unit);
    write.f(this.x);
    write.f(this.y);
  }

  public void writeSyncManual(FloatBuffer buffer) {
    buffer.put(this.x);
    buffer.put(this.y);
  }
}
