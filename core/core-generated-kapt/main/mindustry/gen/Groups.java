package mindustry.gen;

import arc.struct.Seq;
import arc.util.pooling.Pool;
import arc.util.pooling.Pools;
import mindustry.entities.EntityGroup;

public class Groups {
  public static EntityGroup<Entityc> all;

  public static EntityGroup<Building> build;

  public static EntityGroup<Bullet> bullet;

  public static EntityGroup<Drawc> draw;

  public static EntityGroup<Fire> fire;

  private static Seq<Pool.Poolable> freeQueue = new Seq<>();

  public static boolean isClearing;

  public static EntityGroup<WorldLabel> label;

  public static EntityGroup<Player> player;

  public static EntityGroup<PowerGraphUpdaterc> powerGraph;

  public static EntityGroup<Puddle> puddle;

  public static EntityGroup<Syncc> sync;

  public static EntityGroup<Unit> unit;

  public static EntityGroup<WeatherState> weather;

  public static void clear() {
    isClearing = true;
    all.clear();
    player.clear();
    bullet.clear();
    unit.clear();
    build.clear();
    sync.clear();
    draw.clear();
    fire.clear();
    puddle.clear();
    weather.clear();
    label.clear();
    powerGraph.clear();
    isClearing = false;
  }

  public static void init() {
    all = new EntityGroup<>(mindustry.gen.Entityc.class, false, false, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__all ix) ix.setIndex__all(pos); });
    player = new EntityGroup<>(mindustry.gen.Player.class, false, true, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__player ix) ix.setIndex__player(pos); });
    bullet = new EntityGroup<>(mindustry.gen.Bullet.class, true, false, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__bullet ix) ix.setIndex__bullet(pos); });
    unit = new EntityGroup<>(mindustry.gen.Unit.class, true, true, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__unit ix) ix.setIndex__unit(pos); });
    build = new EntityGroup<>(mindustry.gen.Building.class, false, false, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__build ix) ix.setIndex__build(pos); });
    sync = new EntityGroup<>(mindustry.gen.Syncc.class, false, true, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__sync ix) ix.setIndex__sync(pos); });
    draw = new EntityGroup<>(mindustry.gen.Drawc.class, false, false, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__draw ix) ix.setIndex__draw(pos); });
    fire = new EntityGroup<>(mindustry.gen.Fire.class, false, false, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__fire ix) ix.setIndex__fire(pos); });
    puddle = new EntityGroup<>(mindustry.gen.Puddle.class, false, false, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__puddle ix) ix.setIndex__puddle(pos); });
    weather = new EntityGroup<>(mindustry.gen.WeatherState.class, false, false, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__weather ix) ix.setIndex__weather(pos); });
    label = new EntityGroup<>(mindustry.gen.WorldLabel.class, false, true, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__label ix) ix.setIndex__label(pos); });
    powerGraph = new EntityGroup<>(mindustry.gen.PowerGraphUpdaterc.class, false, false, (e, pos) -> { if(e instanceof mindustry.gen.IndexableEntity__powerGraph ix) ix.setIndex__powerGraph(pos); });
  }

  public static void queueFree(Pool.Poolable obj) {
    freeQueue.add(obj);
  }

  public static void resize(float x, float y, float w, float h) {
    bullet.resize(x, y, w, h);
    unit.resize(x, y, w, h);
  }

  public static void update() {
    for(Pool.Poolable p : freeQueue) Pools.free(p);
    freeQueue.clear();
    bullet.updatePhysics();
    unit.updatePhysics();
    all.update();
    bullet.collide();
  }
}
