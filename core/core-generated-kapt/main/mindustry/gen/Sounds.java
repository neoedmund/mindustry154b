package mindustry.gen;

import arc.Core;
import arc.audio.Sound;
import arc.struct.IntMap;
import arc.struct.ObjectIntMap;

public class Sounds {
  private static IntMap idToSound = new IntMap();

  private static ObjectIntMap soundToId = new ObjectIntMap();

  public static Sound acceleratorCharge = new arc.audio.Sound();

  public static Sound acceleratorConstruct = new arc.audio.Sound();

  public static Sound acceleratorLaunch = new arc.audio.Sound();

  public static Sound acceleratorLightning1 = new arc.audio.Sound();

  public static Sound acceleratorLightning2 = new arc.audio.Sound();

  public static Sound beamHeal = new arc.audio.Sound();

  public static Sound beamLustre = new arc.audio.Sound();

  public static Sound beamMeltdown = new arc.audio.Sound();

  public static Sound beamParallax = new arc.audio.Sound();

  public static Sound beamPlasma = new arc.audio.Sound();

  public static Sound beamPlasmaSmall = new arc.audio.Sound();

  public static Sound blockBreak1 = new arc.audio.Sound();

  public static Sound blockBreak2 = new arc.audio.Sound();

  public static Sound blockBreak3 = new arc.audio.Sound();

  public static Sound blockExplode1 = new arc.audio.Sound();

  public static Sound blockExplode1Alt = new arc.audio.Sound();

  public static Sound blockExplode2 = new arc.audio.Sound();

  public static Sound blockExplode2Alt = new arc.audio.Sound();

  public static Sound blockExplode3 = new arc.audio.Sound();

  public static Sound blockExplodeElectric = new arc.audio.Sound();

  public static Sound blockExplodeElectricBig = new arc.audio.Sound();

  public static Sound blockExplodeExplosive = new arc.audio.Sound();

  public static Sound blockExplodeExplosiveAlt = new arc.audio.Sound();

  public static Sound blockExplodeFlammable = new arc.audio.Sound();

  public static Sound blockExplodeWall = new arc.audio.Sound();

  public static Sound blockHeal = new arc.audio.Sound();

  public static Sound blockPlace1 = new arc.audio.Sound();

  public static Sound blockPlace2 = new arc.audio.Sound();

  public static Sound blockPlace3 = new arc.audio.Sound();

  public static Sound blockRepair = new arc.audio.Sound();

  public static Sound blockRotate = new arc.audio.Sound();

  public static Sound chargeCorvus = new arc.audio.Sound();

  public static Sound chargeLancer = new arc.audio.Sound();

  public static Sound chargeVela = new arc.audio.Sound();

  public static Sound click = new arc.audio.Sound();

  public static Sound coreLand = new arc.audio.Sound();

  public static Sound coreLaunch = new arc.audio.Sound();

  public static Sound door = new arc.audio.Sound();

  public static Sound drillCharge = new arc.audio.Sound();

  public static Sound drillImpact = new arc.audio.Sound();

  public static Sound explosion = new arc.audio.Sound();

  public static Sound explosionAfflict = new arc.audio.Sound();

  public static Sound explosionArtillery = new arc.audio.Sound();

  public static Sound explosionArtilleryShock = new arc.audio.Sound();

  public static Sound explosionArtilleryShockBig = new arc.audio.Sound();

  public static Sound explosionCleroi = new arc.audio.Sound();

  public static Sound explosionCore = new arc.audio.Sound();

  public static Sound explosionCrawler = new arc.audio.Sound();

  public static Sound explosionDull = new arc.audio.Sound();

  public static Sound explosionMissile = new arc.audio.Sound();

  public static Sound explosionNavanax = new arc.audio.Sound();

  public static Sound explosionObviate = new arc.audio.Sound();

  public static Sound explosionPlasmaSmall = new arc.audio.Sound();

  public static Sound explosionQuad = new arc.audio.Sound();

  public static Sound explosionReactor = new arc.audio.Sound();

  public static Sound explosionReactor2 = new arc.audio.Sound();

  public static Sound explosionReactorNeoplasm = new arc.audio.Sound();

  public static Sound explosionTitan = new arc.audio.Sound();

  public static Sound healWave = new arc.audio.Sound();

  public static Sound loopBio = new arc.audio.Sound();

  public static Sound loopBuild = new arc.audio.Sound();

  public static Sound loopCircuit = new arc.audio.Sound();

  public static Sound loopCombustion = new arc.audio.Sound();

  public static Sound loopConveyor = new arc.audio.Sound();

  public static Sound loopCultivator = new arc.audio.Sound();

  public static Sound loopCutter = new arc.audio.Sound();

  public static Sound loopDifferential = new arc.audio.Sound();

  public static Sound loopDrill = new arc.audio.Sound();

  public static Sound loopElectricHum = new arc.audio.Sound();

  public static Sound loopExtract = new arc.audio.Sound();

  public static Sound loopFire = new arc.audio.Sound();

  public static Sound loopFlux = new arc.audio.Sound();

  public static Sound loopGlow = new arc.audio.Sound();

  public static Sound loopGrind = new arc.audio.Sound();

  public static Sound loopHover = new arc.audio.Sound();

  public static Sound loopHover2 = new arc.audio.Sound();

  public static Sound loopHum = new arc.audio.Sound();

  public static Sound loopMachine = new arc.audio.Sound();

  public static Sound loopMachine2 = new arc.audio.Sound();

  public static Sound loopMachineSpin = new arc.audio.Sound();

  public static Sound loopMalign = new arc.audio.Sound();

  public static Sound loopMineBeam = new arc.audio.Sound();

  public static Sound loopMissileTrail = new arc.audio.Sound();

  public static Sound loopPulse = new arc.audio.Sound();

  public static Sound loopRegen = new arc.audio.Sound();

  public static Sound loopShield = new arc.audio.Sound();

  public static Sound loopSmelter = new arc.audio.Sound();

  public static Sound loopSpray = new arc.audio.Sound();

  public static Sound loopSteam = new arc.audio.Sound();

  public static Sound loopTech = new arc.audio.Sound();

  public static Sound loopThoriumReactor = new arc.audio.Sound();

  public static Sound loopThruster = new arc.audio.Sound();

  public static Sound loopUnitBuilding = new arc.audio.Sound();

  public static Sound massdriver = new arc.audio.Sound();

  public static Sound massdriverReceive = new arc.audio.Sound();

  public static Sound mechStep = new arc.audio.Sound();

  public static Sound mechStepHeavy = new arc.audio.Sound();

  public static Sound mechStepSmall = new arc.audio.Sound();

  public static Sound padLand = new arc.audio.Sound();

  public static Sound padLaunch = new arc.audio.Sound();

  public static Sound plantBreak = new arc.audio.Sound();

  public static Sound rain = new arc.audio.Sound();

  public static Sound rockBreak = new arc.audio.Sound();

  public static Sound shieldBreak = new arc.audio.Sound();

  public static Sound shieldBreakSmall = new arc.audio.Sound();

  public static Sound shieldHit = new arc.audio.Sound();

  public static Sound shieldWave = new arc.audio.Sound();

  public static Sound shipMove = new arc.audio.Sound();

  public static Sound shipMoveBig = new arc.audio.Sound();

  public static Sound shockBullet = new arc.audio.Sound();

  public static Sound shockwaveTower = new arc.audio.Sound();

  public static Sound shoot = new arc.audio.Sound();

  public static Sound shootAfflict = new arc.audio.Sound();

  public static Sound shootAlpha = new arc.audio.Sound();

  public static Sound shootArc = new arc.audio.Sound();

  public static Sound shootArtillery = new arc.audio.Sound();

  public static Sound shootArtillerySap = new arc.audio.Sound();

  public static Sound shootArtillerySapBig = new arc.audio.Sound();

  public static Sound shootArtillerySmall = new arc.audio.Sound();

  public static Sound shootAtrax = new arc.audio.Sound();

  public static Sound shootAvert = new arc.audio.Sound();

  public static Sound shootBeamPlasma = new arc.audio.Sound();

  public static Sound shootBeamPlasmaSmall = new arc.audio.Sound();

  public static Sound shootBreach = new arc.audio.Sound();

  public static Sound shootBreachCarbide = new arc.audio.Sound();

  public static Sound shootCleroi = new arc.audio.Sound();

  public static Sound shootCollaris = new arc.audio.Sound();

  public static Sound shootConquer = new arc.audio.Sound();

  public static Sound shootCorvus = new arc.audio.Sound();

  public static Sound shootCyclone = new arc.audio.Sound();

  public static Sound shootDiffuse = new arc.audio.Sound();

  public static Sound shootDisperse = new arc.audio.Sound();

  public static Sound shootDuo = new arc.audio.Sound();

  public static Sound shootEclipse = new arc.audio.Sound();

  public static Sound shootElude = new arc.audio.Sound();

  public static Sound shootEnergyField = new arc.audio.Sound();

  public static Sound shootFlame = new arc.audio.Sound();

  public static Sound shootFlamePlasma = new arc.audio.Sound();

  public static Sound shootForeshadow = new arc.audio.Sound();

  public static Sound shootFuse = new arc.audio.Sound();

  public static Sound shootHorizon = new arc.audio.Sound();

  public static Sound shootLancer = new arc.audio.Sound();

  public static Sound shootLaser = new arc.audio.Sound();

  public static Sound shootLocus = new arc.audio.Sound();

  public static Sound shootMalign = new arc.audio.Sound();

  public static Sound shootMeltdown = new arc.audio.Sound();

  public static Sound shootMerui = new arc.audio.Sound();

  public static Sound shootMissile = new arc.audio.Sound();

  public static Sound shootMissileLarge = new arc.audio.Sound();

  public static Sound shootMissileLong = new arc.audio.Sound();

  public static Sound shootMissilePlasma = new arc.audio.Sound();

  public static Sound shootMissilePlasmaShort = new arc.audio.Sound();

  public static Sound shootMissileShort = new arc.audio.Sound();

  public static Sound shootMissileSmall = new arc.audio.Sound();

  public static Sound shootNavanax = new arc.audio.Sound();

  public static Sound shootOmura = new arc.audio.Sound();

  public static Sound shootPayload = new arc.audio.Sound();

  public static Sound shootPulsar = new arc.audio.Sound();

  public static Sound shootQuad = new arc.audio.Sound();

  public static Sound shootReign = new arc.audio.Sound();

  public static Sound shootRetusa = new arc.audio.Sound();

  public static Sound shootRipple = new arc.audio.Sound();

  public static Sound shootSalvo = new arc.audio.Sound();

  public static Sound shootSap = new arc.audio.Sound();

  public static Sound shootScathe = new arc.audio.Sound();

  public static Sound shootScatter = new arc.audio.Sound();

  public static Sound shootScepter = new arc.audio.Sound();

  public static Sound shootScepterSecondary = new arc.audio.Sound();

  public static Sound shootSegment = new arc.audio.Sound();

  public static Sound shootSmite = new arc.audio.Sound();

  public static Sound shootSpectre = new arc.audio.Sound();

  public static Sound shootStell = new arc.audio.Sound();

  public static Sound shootSublimate = new arc.audio.Sound();

  public static Sound shootTank = new arc.audio.Sound();

  public static Sound shootToxopidShotgun = new arc.audio.Sound();

  public static Sound stepMud = new arc.audio.Sound();

  public static Sound stepWater = new arc.audio.Sound();

  public static Sound tankMove = new arc.audio.Sound();

  public static Sound tankMoveHeavy = new arc.audio.Sound();

  public static Sound tankMoveSmall = new arc.audio.Sound();

  public static Sound uiBack = new arc.audio.Sound();

  public static Sound uiButton = new arc.audio.Sound();

  public static Sound uiChat = new arc.audio.Sound();

  public static Sound uiNotify = new arc.audio.Sound();

  public static Sound uiUnlock = new arc.audio.Sound();

  public static Sound unitCreate = new arc.audio.Sound();

  public static Sound unitCreateBig = new arc.audio.Sound();

  public static Sound unitExplode1 = new arc.audio.Sound();

  public static Sound unitExplode2 = new arc.audio.Sound();

  public static Sound unitExplode3 = new arc.audio.Sound();

  public static Sound walkerStep = new arc.audio.Sound();

  public static Sound walkerStepSmall = new arc.audio.Sound();

  public static Sound walkerStepTiny = new arc.audio.Sound();

  public static Sound waveSpawn = new arc.audio.Sound();

  public static Sound wind = new arc.audio.Sound();

  public static Sound wind2 = new arc.audio.Sound();

  public static Sound wind3 = new arc.audio.Sound();

  public static Sound windHowl = new arc.audio.Sound();

  public static Sound wreckFall = new arc.audio.Sound();

  public static Sound wreckFallBig = new arc.audio.Sound();

  /**
   * Does not play anything.
   */
  public static Sound none = new arc.audio.Sound();

  /**
   * Used a placeholder value for unset default values. This is usually reassigned in init() of the relevant block or unit. Does not play anything.
   */
  public static Sound unset = new arc.audio.Sound();

  static {
    soundToId.put(acceleratorCharge, 0);
    soundToId.put(acceleratorConstruct, 1);
    soundToId.put(acceleratorLaunch, 2);
    soundToId.put(acceleratorLightning1, 3);
    soundToId.put(acceleratorLightning2, 4);
    soundToId.put(beamHeal, 5);
    soundToId.put(beamLustre, 6);
    soundToId.put(beamMeltdown, 7);
    soundToId.put(beamParallax, 8);
    soundToId.put(beamPlasma, 9);
    soundToId.put(beamPlasmaSmall, 10);
    soundToId.put(blockBreak1, 11);
    soundToId.put(blockBreak2, 12);
    soundToId.put(blockBreak3, 13);
    soundToId.put(blockExplode1, 14);
    soundToId.put(blockExplode1Alt, 15);
    soundToId.put(blockExplode2, 16);
    soundToId.put(blockExplode2Alt, 17);
    soundToId.put(blockExplode3, 18);
    soundToId.put(blockExplodeElectric, 19);
    soundToId.put(blockExplodeElectricBig, 20);
    soundToId.put(blockExplodeExplosive, 21);
    soundToId.put(blockExplodeExplosiveAlt, 22);
    soundToId.put(blockExplodeFlammable, 23);
    soundToId.put(blockExplodeWall, 24);
    soundToId.put(blockHeal, 25);
    soundToId.put(blockPlace1, 26);
    soundToId.put(blockPlace2, 27);
    soundToId.put(blockPlace3, 28);
    soundToId.put(blockRepair, 29);
    soundToId.put(blockRotate, 30);
    soundToId.put(chargeCorvus, 31);
    soundToId.put(chargeLancer, 32);
    soundToId.put(chargeVela, 33);
    soundToId.put(click, 34);
    soundToId.put(coreLand, 35);
    soundToId.put(coreLaunch, 36);
    soundToId.put(door, 37);
    soundToId.put(drillCharge, 38);
    soundToId.put(drillImpact, 39);
    soundToId.put(explosion, 40);
    soundToId.put(explosionAfflict, 41);
    soundToId.put(explosionArtillery, 42);
    soundToId.put(explosionArtilleryShock, 43);
    soundToId.put(explosionArtilleryShockBig, 44);
    soundToId.put(explosionCleroi, 45);
    soundToId.put(explosionCore, 46);
    soundToId.put(explosionCrawler, 47);
    soundToId.put(explosionDull, 48);
    soundToId.put(explosionMissile, 49);
    soundToId.put(explosionNavanax, 50);
    soundToId.put(explosionObviate, 51);
    soundToId.put(explosionPlasmaSmall, 52);
    soundToId.put(explosionQuad, 53);
    soundToId.put(explosionReactor, 54);
    soundToId.put(explosionReactor2, 55);
    soundToId.put(explosionReactorNeoplasm, 56);
    soundToId.put(explosionTitan, 57);
    soundToId.put(healWave, 58);
    soundToId.put(loopBio, 59);
    soundToId.put(loopBuild, 60);
    soundToId.put(loopCircuit, 61);
    soundToId.put(loopCombustion, 62);
    soundToId.put(loopConveyor, 63);
    soundToId.put(loopCultivator, 64);
    soundToId.put(loopCutter, 65);
    soundToId.put(loopDifferential, 66);
    soundToId.put(loopDrill, 67);
    soundToId.put(loopElectricHum, 68);
    soundToId.put(loopExtract, 69);
    soundToId.put(loopFire, 70);
    soundToId.put(loopFlux, 71);
    soundToId.put(loopGlow, 72);
    soundToId.put(loopGrind, 73);
    soundToId.put(loopHover, 74);
    soundToId.put(loopHover2, 75);
    soundToId.put(loopHum, 76);
    soundToId.put(loopMachine, 77);
    soundToId.put(loopMachine2, 78);
    soundToId.put(loopMachineSpin, 79);
    soundToId.put(loopMalign, 80);
    soundToId.put(loopMineBeam, 81);
    soundToId.put(loopMissileTrail, 82);
    soundToId.put(loopPulse, 83);
    soundToId.put(loopRegen, 84);
    soundToId.put(loopShield, 85);
    soundToId.put(loopSmelter, 86);
    soundToId.put(loopSpray, 87);
    soundToId.put(loopSteam, 88);
    soundToId.put(loopTech, 89);
    soundToId.put(loopThoriumReactor, 90);
    soundToId.put(loopThruster, 91);
    soundToId.put(loopUnitBuilding, 92);
    soundToId.put(massdriver, 93);
    soundToId.put(massdriverReceive, 94);
    soundToId.put(mechStep, 95);
    soundToId.put(mechStepHeavy, 96);
    soundToId.put(mechStepSmall, 97);
    soundToId.put(padLand, 98);
    soundToId.put(padLaunch, 99);
    soundToId.put(plantBreak, 100);
    soundToId.put(rain, 101);
    soundToId.put(rockBreak, 102);
    soundToId.put(shieldBreak, 103);
    soundToId.put(shieldBreakSmall, 104);
    soundToId.put(shieldHit, 105);
    soundToId.put(shieldWave, 106);
    soundToId.put(shipMove, 107);
    soundToId.put(shipMoveBig, 108);
    soundToId.put(shockBullet, 109);
    soundToId.put(shockwaveTower, 110);
    soundToId.put(shoot, 111);
    soundToId.put(shootAfflict, 112);
    soundToId.put(shootAlpha, 113);
    soundToId.put(shootArc, 114);
    soundToId.put(shootArtillery, 115);
    soundToId.put(shootArtillerySap, 116);
    soundToId.put(shootArtillerySapBig, 117);
    soundToId.put(shootArtillerySmall, 118);
    soundToId.put(shootAtrax, 119);
    soundToId.put(shootAvert, 120);
    soundToId.put(shootBeamPlasma, 121);
    soundToId.put(shootBeamPlasmaSmall, 122);
    soundToId.put(shootBreach, 123);
    soundToId.put(shootBreachCarbide, 124);
    soundToId.put(shootCleroi, 125);
    soundToId.put(shootCollaris, 126);
    soundToId.put(shootConquer, 127);
    soundToId.put(shootCorvus, 128);
    soundToId.put(shootCyclone, 129);
    soundToId.put(shootDiffuse, 130);
    soundToId.put(shootDisperse, 131);
    soundToId.put(shootDuo, 132);
    soundToId.put(shootEclipse, 133);
    soundToId.put(shootElude, 134);
    soundToId.put(shootEnergyField, 135);
    soundToId.put(shootFlame, 136);
    soundToId.put(shootFlamePlasma, 137);
    soundToId.put(shootForeshadow, 138);
    soundToId.put(shootFuse, 139);
    soundToId.put(shootHorizon, 140);
    soundToId.put(shootLancer, 141);
    soundToId.put(shootLaser, 142);
    soundToId.put(shootLocus, 143);
    soundToId.put(shootMalign, 144);
    soundToId.put(shootMeltdown, 145);
    soundToId.put(shootMerui, 146);
    soundToId.put(shootMissile, 147);
    soundToId.put(shootMissileLarge, 148);
    soundToId.put(shootMissileLong, 149);
    soundToId.put(shootMissilePlasma, 150);
    soundToId.put(shootMissilePlasmaShort, 151);
    soundToId.put(shootMissileShort, 152);
    soundToId.put(shootMissileSmall, 153);
    soundToId.put(shootNavanax, 154);
    soundToId.put(shootOmura, 155);
    soundToId.put(shootPayload, 156);
    soundToId.put(shootPulsar, 157);
    soundToId.put(shootQuad, 158);
    soundToId.put(shootReign, 159);
    soundToId.put(shootRetusa, 160);
    soundToId.put(shootRipple, 161);
    soundToId.put(shootSalvo, 162);
    soundToId.put(shootSap, 163);
    soundToId.put(shootScathe, 164);
    soundToId.put(shootScatter, 165);
    soundToId.put(shootScepter, 166);
    soundToId.put(shootScepterSecondary, 167);
    soundToId.put(shootSegment, 168);
    soundToId.put(shootSmite, 169);
    soundToId.put(shootSpectre, 170);
    soundToId.put(shootStell, 171);
    soundToId.put(shootSublimate, 172);
    soundToId.put(shootTank, 173);
    soundToId.put(shootToxopidShotgun, 174);
    soundToId.put(stepMud, 175);
    soundToId.put(stepWater, 176);
    soundToId.put(tankMove, 177);
    soundToId.put(tankMoveHeavy, 178);
    soundToId.put(tankMoveSmall, 179);
    soundToId.put(uiBack, 180);
    soundToId.put(uiButton, 181);
    soundToId.put(uiChat, 182);
    soundToId.put(uiNotify, 183);
    soundToId.put(uiUnlock, 184);
    soundToId.put(unitCreate, 185);
    soundToId.put(unitCreateBig, 186);
    soundToId.put(unitExplode1, 187);
    soundToId.put(unitExplode2, 188);
    soundToId.put(unitExplode3, 189);
    soundToId.put(walkerStep, 190);
    soundToId.put(walkerStepSmall, 191);
    soundToId.put(walkerStepTiny, 192);
    soundToId.put(waveSpawn, 193);
    soundToId.put(wind, 194);
    soundToId.put(wind2, 195);
    soundToId.put(wind3, 196);
    soundToId.put(windHowl, 197);
    soundToId.put(wreckFall, 198);
    soundToId.put(wreckFallBig, 199);
  }

  public static int getSoundId(Sound sound) {
    return soundToId.get(sound, -1);
  }

  public static Sound getSound(int id) {
    return (Sound)idToSound.get(id, () -> Sounds.none);
  }

  public static void load() {
    Core.assets.load("sounds/block/acceleratorCharge.ogg", arc.audio.Sound.class).loaded = a -> { acceleratorCharge = (arc.audio.Sound)a; soundToId.put(a, 0); idToSound.put(0, a); };
    Core.assets.load("sounds/block/acceleratorConstruct.ogg", arc.audio.Sound.class).loaded = a -> { acceleratorConstruct = (arc.audio.Sound)a; soundToId.put(a, 1); idToSound.put(1, a); };
    Core.assets.load("sounds/block/acceleratorLaunch.ogg", arc.audio.Sound.class).loaded = a -> { acceleratorLaunch = (arc.audio.Sound)a; soundToId.put(a, 2); idToSound.put(2, a); };
    Core.assets.load("sounds/block/acceleratorLightning1.ogg", arc.audio.Sound.class).loaded = a -> { acceleratorLightning1 = (arc.audio.Sound)a; soundToId.put(a, 3); idToSound.put(3, a); };
    Core.assets.load("sounds/block/acceleratorLightning2.ogg", arc.audio.Sound.class).loaded = a -> { acceleratorLightning2 = (arc.audio.Sound)a; soundToId.put(a, 4); idToSound.put(4, a); };
    Core.assets.load("sounds/beams/beamHeal.ogg", arc.audio.Sound.class).loaded = a -> { beamHeal = (arc.audio.Sound)a; soundToId.put(a, 5); idToSound.put(5, a); };
    Core.assets.load("sounds/beams/beamLustre.ogg", arc.audio.Sound.class).loaded = a -> { beamLustre = (arc.audio.Sound)a; soundToId.put(a, 6); idToSound.put(6, a); };
    Core.assets.load("sounds/beams/beamMeltdown.ogg", arc.audio.Sound.class).loaded = a -> { beamMeltdown = (arc.audio.Sound)a; soundToId.put(a, 7); idToSound.put(7, a); };
    Core.assets.load("sounds/beams/beamParallax.ogg", arc.audio.Sound.class).loaded = a -> { beamParallax = (arc.audio.Sound)a; soundToId.put(a, 8); idToSound.put(8, a); };
    Core.assets.load("sounds/beams/beamPlasma.ogg", arc.audio.Sound.class).loaded = a -> { beamPlasma = (arc.audio.Sound)a; soundToId.put(a, 9); idToSound.put(9, a); };
    Core.assets.load("sounds/beams/beamPlasmaSmall.ogg", arc.audio.Sound.class).loaded = a -> { beamPlasmaSmall = (arc.audio.Sound)a; soundToId.put(a, 10); idToSound.put(10, a); };
    Core.assets.load("sounds/block/blockBreak1.ogg", arc.audio.Sound.class).loaded = a -> { blockBreak1 = (arc.audio.Sound)a; soundToId.put(a, 11); idToSound.put(11, a); };
    Core.assets.load("sounds/block/blockBreak2.ogg", arc.audio.Sound.class).loaded = a -> { blockBreak2 = (arc.audio.Sound)a; soundToId.put(a, 12); idToSound.put(12, a); };
    Core.assets.load("sounds/block/blockBreak3.ogg", arc.audio.Sound.class).loaded = a -> { blockBreak3 = (arc.audio.Sound)a; soundToId.put(a, 13); idToSound.put(13, a); };
    Core.assets.load("sounds/explosions/blockExplode1.ogg", arc.audio.Sound.class).loaded = a -> { blockExplode1 = (arc.audio.Sound)a; soundToId.put(a, 14); idToSound.put(14, a); };
    Core.assets.load("sounds/explosions/blockExplode1Alt.ogg", arc.audio.Sound.class).loaded = a -> { blockExplode1Alt = (arc.audio.Sound)a; soundToId.put(a, 15); idToSound.put(15, a); };
    Core.assets.load("sounds/explosions/blockExplode2.ogg", arc.audio.Sound.class).loaded = a -> { blockExplode2 = (arc.audio.Sound)a; soundToId.put(a, 16); idToSound.put(16, a); };
    Core.assets.load("sounds/explosions/blockExplode2Alt.ogg", arc.audio.Sound.class).loaded = a -> { blockExplode2Alt = (arc.audio.Sound)a; soundToId.put(a, 17); idToSound.put(17, a); };
    Core.assets.load("sounds/explosions/blockExplode3.ogg", arc.audio.Sound.class).loaded = a -> { blockExplode3 = (arc.audio.Sound)a; soundToId.put(a, 18); idToSound.put(18, a); };
    Core.assets.load("sounds/explosions/blockExplodeElectric.ogg", arc.audio.Sound.class).loaded = a -> { blockExplodeElectric = (arc.audio.Sound)a; soundToId.put(a, 19); idToSound.put(19, a); };
    Core.assets.load("sounds/explosions/blockExplodeElectricBig.ogg", arc.audio.Sound.class).loaded = a -> { blockExplodeElectricBig = (arc.audio.Sound)a; soundToId.put(a, 20); idToSound.put(20, a); };
    Core.assets.load("sounds/explosions/blockExplodeExplosive.ogg", arc.audio.Sound.class).loaded = a -> { blockExplodeExplosive = (arc.audio.Sound)a; soundToId.put(a, 21); idToSound.put(21, a); };
    Core.assets.load("sounds/explosions/blockExplodeExplosiveAlt.ogg", arc.audio.Sound.class).loaded = a -> { blockExplodeExplosiveAlt = (arc.audio.Sound)a; soundToId.put(a, 22); idToSound.put(22, a); };
    Core.assets.load("sounds/explosions/blockExplodeFlammable.ogg", arc.audio.Sound.class).loaded = a -> { blockExplodeFlammable = (arc.audio.Sound)a; soundToId.put(a, 23); idToSound.put(23, a); };
    Core.assets.load("sounds/explosions/blockExplodeWall.ogg", arc.audio.Sound.class).loaded = a -> { blockExplodeWall = (arc.audio.Sound)a; soundToId.put(a, 24); idToSound.put(24, a); };
    Core.assets.load("sounds/block/blockHeal.ogg", arc.audio.Sound.class).loaded = a -> { blockHeal = (arc.audio.Sound)a; soundToId.put(a, 25); idToSound.put(25, a); };
    Core.assets.load("sounds/block/blockPlace1.ogg", arc.audio.Sound.class).loaded = a -> { blockPlace1 = (arc.audio.Sound)a; soundToId.put(a, 26); idToSound.put(26, a); };
    Core.assets.load("sounds/block/blockPlace2.ogg", arc.audio.Sound.class).loaded = a -> { blockPlace2 = (arc.audio.Sound)a; soundToId.put(a, 27); idToSound.put(27, a); };
    Core.assets.load("sounds/block/blockPlace3.ogg", arc.audio.Sound.class).loaded = a -> { blockPlace3 = (arc.audio.Sound)a; soundToId.put(a, 28); idToSound.put(28, a); };
    Core.assets.load("sounds/block/blockRepair.ogg", arc.audio.Sound.class).loaded = a -> { blockRepair = (arc.audio.Sound)a; soundToId.put(a, 29); idToSound.put(29, a); };
    Core.assets.load("sounds/block/blockRotate.ogg", arc.audio.Sound.class).loaded = a -> { blockRotate = (arc.audio.Sound)a; soundToId.put(a, 30); idToSound.put(30, a); };
    Core.assets.load("sounds/charge/chargeCorvus.ogg", arc.audio.Sound.class).loaded = a -> { chargeCorvus = (arc.audio.Sound)a; soundToId.put(a, 31); idToSound.put(31, a); };
    Core.assets.load("sounds/charge/chargeLancer.ogg", arc.audio.Sound.class).loaded = a -> { chargeLancer = (arc.audio.Sound)a; soundToId.put(a, 32); idToSound.put(32, a); };
    Core.assets.load("sounds/charge/chargeVela.ogg", arc.audio.Sound.class).loaded = a -> { chargeVela = (arc.audio.Sound)a; soundToId.put(a, 33); idToSound.put(33, a); };
    Core.assets.load("sounds/block/click.ogg", arc.audio.Sound.class).loaded = a -> { click = (arc.audio.Sound)a; soundToId.put(a, 34); idToSound.put(34, a); };
    Core.assets.load("sounds/block/coreLand.ogg", arc.audio.Sound.class).loaded = a -> { coreLand = (arc.audio.Sound)a; soundToId.put(a, 35); idToSound.put(35, a); };
    Core.assets.load("sounds/block/coreLaunch.ogg", arc.audio.Sound.class).loaded = a -> { coreLaunch = (arc.audio.Sound)a; soundToId.put(a, 36); idToSound.put(36, a); };
    Core.assets.load("sounds/block/door.ogg", arc.audio.Sound.class).loaded = a -> { door = (arc.audio.Sound)a; soundToId.put(a, 37); idToSound.put(37, a); };
    Core.assets.load("sounds/block/drillCharge.ogg", arc.audio.Sound.class).loaded = a -> { drillCharge = (arc.audio.Sound)a; soundToId.put(a, 38); idToSound.put(38, a); };
    Core.assets.load("sounds/block/drillImpact.ogg", arc.audio.Sound.class).loaded = a -> { drillImpact = (arc.audio.Sound)a; soundToId.put(a, 39); idToSound.put(39, a); };
    Core.assets.load("sounds/explosions/explosion.ogg", arc.audio.Sound.class).loaded = a -> { explosion = (arc.audio.Sound)a; soundToId.put(a, 40); idToSound.put(40, a); };
    Core.assets.load("sounds/explosions/explosionAfflict.ogg", arc.audio.Sound.class).loaded = a -> { explosionAfflict = (arc.audio.Sound)a; soundToId.put(a, 41); idToSound.put(41, a); };
    Core.assets.load("sounds/explosions/explosionArtillery.ogg", arc.audio.Sound.class).loaded = a -> { explosionArtillery = (arc.audio.Sound)a; soundToId.put(a, 42); idToSound.put(42, a); };
    Core.assets.load("sounds/explosions/explosionArtilleryShock.ogg", arc.audio.Sound.class).loaded = a -> { explosionArtilleryShock = (arc.audio.Sound)a; soundToId.put(a, 43); idToSound.put(43, a); };
    Core.assets.load("sounds/explosions/explosionArtilleryShockBig.ogg", arc.audio.Sound.class).loaded = a -> { explosionArtilleryShockBig = (arc.audio.Sound)a; soundToId.put(a, 44); idToSound.put(44, a); };
    Core.assets.load("sounds/explosions/explosionCleroi.ogg", arc.audio.Sound.class).loaded = a -> { explosionCleroi = (arc.audio.Sound)a; soundToId.put(a, 45); idToSound.put(45, a); };
    Core.assets.load("sounds/explosions/explosionCore.ogg", arc.audio.Sound.class).loaded = a -> { explosionCore = (arc.audio.Sound)a; soundToId.put(a, 46); idToSound.put(46, a); };
    Core.assets.load("sounds/explosions/explosionCrawler.ogg", arc.audio.Sound.class).loaded = a -> { explosionCrawler = (arc.audio.Sound)a; soundToId.put(a, 47); idToSound.put(47, a); };
    Core.assets.load("sounds/explosions/explosionDull.ogg", arc.audio.Sound.class).loaded = a -> { explosionDull = (arc.audio.Sound)a; soundToId.put(a, 48); idToSound.put(48, a); };
    Core.assets.load("sounds/explosions/explosionMissile.ogg", arc.audio.Sound.class).loaded = a -> { explosionMissile = (arc.audio.Sound)a; soundToId.put(a, 49); idToSound.put(49, a); };
    Core.assets.load("sounds/explosions/explosionNavanax.ogg", arc.audio.Sound.class).loaded = a -> { explosionNavanax = (arc.audio.Sound)a; soundToId.put(a, 50); idToSound.put(50, a); };
    Core.assets.load("sounds/explosions/explosionObviate.ogg", arc.audio.Sound.class).loaded = a -> { explosionObviate = (arc.audio.Sound)a; soundToId.put(a, 51); idToSound.put(51, a); };
    Core.assets.load("sounds/explosions/explosionPlasmaSmall.ogg", arc.audio.Sound.class).loaded = a -> { explosionPlasmaSmall = (arc.audio.Sound)a; soundToId.put(a, 52); idToSound.put(52, a); };
    Core.assets.load("sounds/explosions/explosionQuad.ogg", arc.audio.Sound.class).loaded = a -> { explosionQuad = (arc.audio.Sound)a; soundToId.put(a, 53); idToSound.put(53, a); };
    Core.assets.load("sounds/explosions/explosionReactor.ogg", arc.audio.Sound.class).loaded = a -> { explosionReactor = (arc.audio.Sound)a; soundToId.put(a, 54); idToSound.put(54, a); };
    Core.assets.load("sounds/explosions/explosionReactor2.ogg", arc.audio.Sound.class).loaded = a -> { explosionReactor2 = (arc.audio.Sound)a; soundToId.put(a, 55); idToSound.put(55, a); };
    Core.assets.load("sounds/explosions/explosionReactorNeoplasm.ogg", arc.audio.Sound.class).loaded = a -> { explosionReactorNeoplasm = (arc.audio.Sound)a; soundToId.put(a, 56); idToSound.put(56, a); };
    Core.assets.load("sounds/explosions/explosionTitan.ogg", arc.audio.Sound.class).loaded = a -> { explosionTitan = (arc.audio.Sound)a; soundToId.put(a, 57); idToSound.put(57, a); };
    Core.assets.load("sounds/block/healWave.ogg", arc.audio.Sound.class).loaded = a -> { healWave = (arc.audio.Sound)a; soundToId.put(a, 58); idToSound.put(58, a); };
    Core.assets.load("sounds/loops/loopBio.ogg", arc.audio.Sound.class).loaded = a -> { loopBio = (arc.audio.Sound)a; soundToId.put(a, 59); idToSound.put(59, a); };
    Core.assets.load("sounds/loops/loopBuild.ogg", arc.audio.Sound.class).loaded = a -> { loopBuild = (arc.audio.Sound)a; soundToId.put(a, 60); idToSound.put(60, a); };
    Core.assets.load("sounds/loops/loopCircuit.ogg", arc.audio.Sound.class).loaded = a -> { loopCircuit = (arc.audio.Sound)a; soundToId.put(a, 61); idToSound.put(61, a); };
    Core.assets.load("sounds/loops/loopCombustion.ogg", arc.audio.Sound.class).loaded = a -> { loopCombustion = (arc.audio.Sound)a; soundToId.put(a, 62); idToSound.put(62, a); };
    Core.assets.load("sounds/loops/loopConveyor.ogg", arc.audio.Sound.class).loaded = a -> { loopConveyor = (arc.audio.Sound)a; soundToId.put(a, 63); idToSound.put(63, a); };
    Core.assets.load("sounds/loops/loopCultivator.ogg", arc.audio.Sound.class).loaded = a -> { loopCultivator = (arc.audio.Sound)a; soundToId.put(a, 64); idToSound.put(64, a); };
    Core.assets.load("sounds/loops/loopCutter.ogg", arc.audio.Sound.class).loaded = a -> { loopCutter = (arc.audio.Sound)a; soundToId.put(a, 65); idToSound.put(65, a); };
    Core.assets.load("sounds/loops/loopDifferential.ogg", arc.audio.Sound.class).loaded = a -> { loopDifferential = (arc.audio.Sound)a; soundToId.put(a, 66); idToSound.put(66, a); };
    Core.assets.load("sounds/loops/loopDrill.ogg", arc.audio.Sound.class).loaded = a -> { loopDrill = (arc.audio.Sound)a; soundToId.put(a, 67); idToSound.put(67, a); };
    Core.assets.load("sounds/loops/loopElectricHum.ogg", arc.audio.Sound.class).loaded = a -> { loopElectricHum = (arc.audio.Sound)a; soundToId.put(a, 68); idToSound.put(68, a); };
    Core.assets.load("sounds/loops/loopExtract.ogg", arc.audio.Sound.class).loaded = a -> { loopExtract = (arc.audio.Sound)a; soundToId.put(a, 69); idToSound.put(69, a); };
    Core.assets.load("sounds/loops/loopFire.ogg", arc.audio.Sound.class).loaded = a -> { loopFire = (arc.audio.Sound)a; soundToId.put(a, 70); idToSound.put(70, a); };
    Core.assets.load("sounds/loops/loopFlux.ogg", arc.audio.Sound.class).loaded = a -> { loopFlux = (arc.audio.Sound)a; soundToId.put(a, 71); idToSound.put(71, a); };
    Core.assets.load("sounds/loops/loopGlow.ogg", arc.audio.Sound.class).loaded = a -> { loopGlow = (arc.audio.Sound)a; soundToId.put(a, 72); idToSound.put(72, a); };
    Core.assets.load("sounds/loops/loopGrind.ogg", arc.audio.Sound.class).loaded = a -> { loopGrind = (arc.audio.Sound)a; soundToId.put(a, 73); idToSound.put(73, a); };
    Core.assets.load("sounds/loops/loopHover.ogg", arc.audio.Sound.class).loaded = a -> { loopHover = (arc.audio.Sound)a; soundToId.put(a, 74); idToSound.put(74, a); };
    Core.assets.load("sounds/loops/loopHover2.ogg", arc.audio.Sound.class).loaded = a -> { loopHover2 = (arc.audio.Sound)a; soundToId.put(a, 75); idToSound.put(75, a); };
    Core.assets.load("sounds/loops/loopHum.ogg", arc.audio.Sound.class).loaded = a -> { loopHum = (arc.audio.Sound)a; soundToId.put(a, 76); idToSound.put(76, a); };
    Core.assets.load("sounds/loops/loopMachine.ogg", arc.audio.Sound.class).loaded = a -> { loopMachine = (arc.audio.Sound)a; soundToId.put(a, 77); idToSound.put(77, a); };
    Core.assets.load("sounds/loops/loopMachine2.ogg", arc.audio.Sound.class).loaded = a -> { loopMachine2 = (arc.audio.Sound)a; soundToId.put(a, 78); idToSound.put(78, a); };
    Core.assets.load("sounds/loops/loopMachineSpin.ogg", arc.audio.Sound.class).loaded = a -> { loopMachineSpin = (arc.audio.Sound)a; soundToId.put(a, 79); idToSound.put(79, a); };
    Core.assets.load("sounds/loops/loopMalign.ogg", arc.audio.Sound.class).loaded = a -> { loopMalign = (arc.audio.Sound)a; soundToId.put(a, 80); idToSound.put(80, a); };
    Core.assets.load("sounds/loops/loopMineBeam.ogg", arc.audio.Sound.class).loaded = a -> { loopMineBeam = (arc.audio.Sound)a; soundToId.put(a, 81); idToSound.put(81, a); };
    Core.assets.load("sounds/loops/loopMissileTrail.ogg", arc.audio.Sound.class).loaded = a -> { loopMissileTrail = (arc.audio.Sound)a; soundToId.put(a, 82); idToSound.put(82, a); };
    Core.assets.load("sounds/loops/loopPulse.ogg", arc.audio.Sound.class).loaded = a -> { loopPulse = (arc.audio.Sound)a; soundToId.put(a, 83); idToSound.put(83, a); };
    Core.assets.load("sounds/loops/loopRegen.ogg", arc.audio.Sound.class).loaded = a -> { loopRegen = (arc.audio.Sound)a; soundToId.put(a, 84); idToSound.put(84, a); };
    Core.assets.load("sounds/loops/loopShield.ogg", arc.audio.Sound.class).loaded = a -> { loopShield = (arc.audio.Sound)a; soundToId.put(a, 85); idToSound.put(85, a); };
    Core.assets.load("sounds/loops/loopSmelter.ogg", arc.audio.Sound.class).loaded = a -> { loopSmelter = (arc.audio.Sound)a; soundToId.put(a, 86); idToSound.put(86, a); };
    Core.assets.load("sounds/loops/loopSpray.ogg", arc.audio.Sound.class).loaded = a -> { loopSpray = (arc.audio.Sound)a; soundToId.put(a, 87); idToSound.put(87, a); };
    Core.assets.load("sounds/loops/loopSteam.ogg", arc.audio.Sound.class).loaded = a -> { loopSteam = (arc.audio.Sound)a; soundToId.put(a, 88); idToSound.put(88, a); };
    Core.assets.load("sounds/loops/loopTech.ogg", arc.audio.Sound.class).loaded = a -> { loopTech = (arc.audio.Sound)a; soundToId.put(a, 89); idToSound.put(89, a); };
    Core.assets.load("sounds/loops/loopThoriumReactor.ogg", arc.audio.Sound.class).loaded = a -> { loopThoriumReactor = (arc.audio.Sound)a; soundToId.put(a, 90); idToSound.put(90, a); };
    Core.assets.load("sounds/loops/loopThruster.ogg", arc.audio.Sound.class).loaded = a -> { loopThruster = (arc.audio.Sound)a; soundToId.put(a, 91); idToSound.put(91, a); };
    Core.assets.load("sounds/loops/loopUnitBuilding.ogg", arc.audio.Sound.class).loaded = a -> { loopUnitBuilding = (arc.audio.Sound)a; soundToId.put(a, 92); idToSound.put(92, a); };
    Core.assets.load("sounds/block/massdriver.ogg", arc.audio.Sound.class).loaded = a -> { massdriver = (arc.audio.Sound)a; soundToId.put(a, 93); idToSound.put(93, a); };
    Core.assets.load("sounds/block/massdriverReceive.ogg", arc.audio.Sound.class).loaded = a -> { massdriverReceive = (arc.audio.Sound)a; soundToId.put(a, 94); idToSound.put(94, a); };
    Core.assets.load("sounds/movement/mechStep.ogg", arc.audio.Sound.class).loaded = a -> { mechStep = (arc.audio.Sound)a; soundToId.put(a, 95); idToSound.put(95, a); };
    Core.assets.load("sounds/movement/mechStepHeavy.ogg", arc.audio.Sound.class).loaded = a -> { mechStepHeavy = (arc.audio.Sound)a; soundToId.put(a, 96); idToSound.put(96, a); };
    Core.assets.load("sounds/movement/mechStepSmall.ogg", arc.audio.Sound.class).loaded = a -> { mechStepSmall = (arc.audio.Sound)a; soundToId.put(a, 97); idToSound.put(97, a); };
    Core.assets.load("sounds/block/padLand.ogg", arc.audio.Sound.class).loaded = a -> { padLand = (arc.audio.Sound)a; soundToId.put(a, 98); idToSound.put(98, a); };
    Core.assets.load("sounds/block/padLaunch.ogg", arc.audio.Sound.class).loaded = a -> { padLaunch = (arc.audio.Sound)a; soundToId.put(a, 99); idToSound.put(99, a); };
    Core.assets.load("sounds/block/plantBreak.ogg", arc.audio.Sound.class).loaded = a -> { plantBreak = (arc.audio.Sound)a; soundToId.put(a, 100); idToSound.put(100, a); };
    Core.assets.load("sounds/environment/rain.ogg", arc.audio.Sound.class).loaded = a -> { rain = (arc.audio.Sound)a; soundToId.put(a, 101); idToSound.put(101, a); };
    Core.assets.load("sounds/block/rockBreak.ogg", arc.audio.Sound.class).loaded = a -> { rockBreak = (arc.audio.Sound)a; soundToId.put(a, 102); idToSound.put(102, a); };
    Core.assets.load("sounds/block/shieldBreak.ogg", arc.audio.Sound.class).loaded = a -> { shieldBreak = (arc.audio.Sound)a; soundToId.put(a, 103); idToSound.put(103, a); };
    Core.assets.load("sounds/block/shieldBreakSmall.ogg", arc.audio.Sound.class).loaded = a -> { shieldBreakSmall = (arc.audio.Sound)a; soundToId.put(a, 104); idToSound.put(104, a); };
    Core.assets.load("sounds/block/shieldHit.ogg", arc.audio.Sound.class).loaded = a -> { shieldHit = (arc.audio.Sound)a; soundToId.put(a, 105); idToSound.put(105, a); };
    Core.assets.load("sounds/block/shieldWave.ogg", arc.audio.Sound.class).loaded = a -> { shieldWave = (arc.audio.Sound)a; soundToId.put(a, 106); idToSound.put(106, a); };
    Core.assets.load("sounds/movement/shipMove.ogg", arc.audio.Sound.class).loaded = a -> { shipMove = (arc.audio.Sound)a; soundToId.put(a, 107); idToSound.put(107, a); };
    Core.assets.load("sounds/movement/shipMoveBig.ogg", arc.audio.Sound.class).loaded = a -> { shipMoveBig = (arc.audio.Sound)a; soundToId.put(a, 108); idToSound.put(108, a); };
    Core.assets.load("sounds/explosions/shockBullet.ogg", arc.audio.Sound.class).loaded = a -> { shockBullet = (arc.audio.Sound)a; soundToId.put(a, 109); idToSound.put(109, a); };
    Core.assets.load("sounds/block/shockwaveTower.ogg", arc.audio.Sound.class).loaded = a -> { shockwaveTower = (arc.audio.Sound)a; soundToId.put(a, 110); idToSound.put(110, a); };
    Core.assets.load("sounds/shoot/shoot.ogg", arc.audio.Sound.class).loaded = a -> { shoot = (arc.audio.Sound)a; soundToId.put(a, 111); idToSound.put(111, a); };
    Core.assets.load("sounds/shoot/shootAfflict.ogg", arc.audio.Sound.class).loaded = a -> { shootAfflict = (arc.audio.Sound)a; soundToId.put(a, 112); idToSound.put(112, a); };
    Core.assets.load("sounds/shoot/shootAlpha.ogg", arc.audio.Sound.class).loaded = a -> { shootAlpha = (arc.audio.Sound)a; soundToId.put(a, 113); idToSound.put(113, a); };
    Core.assets.load("sounds/shoot/shootArc.ogg", arc.audio.Sound.class).loaded = a -> { shootArc = (arc.audio.Sound)a; soundToId.put(a, 114); idToSound.put(114, a); };
    Core.assets.load("sounds/shoot/shootArtillery.ogg", arc.audio.Sound.class).loaded = a -> { shootArtillery = (arc.audio.Sound)a; soundToId.put(a, 115); idToSound.put(115, a); };
    Core.assets.load("sounds/shoot/shootArtillerySap.ogg", arc.audio.Sound.class).loaded = a -> { shootArtillerySap = (arc.audio.Sound)a; soundToId.put(a, 116); idToSound.put(116, a); };
    Core.assets.load("sounds/shoot/shootArtillerySapBig.ogg", arc.audio.Sound.class).loaded = a -> { shootArtillerySapBig = (arc.audio.Sound)a; soundToId.put(a, 117); idToSound.put(117, a); };
    Core.assets.load("sounds/shoot/shootArtillerySmall.ogg", arc.audio.Sound.class).loaded = a -> { shootArtillerySmall = (arc.audio.Sound)a; soundToId.put(a, 118); idToSound.put(118, a); };
    Core.assets.load("sounds/shoot/shootAtrax.ogg", arc.audio.Sound.class).loaded = a -> { shootAtrax = (arc.audio.Sound)a; soundToId.put(a, 119); idToSound.put(119, a); };
    Core.assets.load("sounds/shoot/shootAvert.ogg", arc.audio.Sound.class).loaded = a -> { shootAvert = (arc.audio.Sound)a; soundToId.put(a, 120); idToSound.put(120, a); };
    Core.assets.load("sounds/shoot/shootBeamPlasma.ogg", arc.audio.Sound.class).loaded = a -> { shootBeamPlasma = (arc.audio.Sound)a; soundToId.put(a, 121); idToSound.put(121, a); };
    Core.assets.load("sounds/shoot/shootBeamPlasmaSmall.ogg", arc.audio.Sound.class).loaded = a -> { shootBeamPlasmaSmall = (arc.audio.Sound)a; soundToId.put(a, 122); idToSound.put(122, a); };
    Core.assets.load("sounds/shoot/shootBreach.ogg", arc.audio.Sound.class).loaded = a -> { shootBreach = (arc.audio.Sound)a; soundToId.put(a, 123); idToSound.put(123, a); };
    Core.assets.load("sounds/shoot/shootBreachCarbide.ogg", arc.audio.Sound.class).loaded = a -> { shootBreachCarbide = (arc.audio.Sound)a; soundToId.put(a, 124); idToSound.put(124, a); };
    Core.assets.load("sounds/shoot/shootCleroi.ogg", arc.audio.Sound.class).loaded = a -> { shootCleroi = (arc.audio.Sound)a; soundToId.put(a, 125); idToSound.put(125, a); };
    Core.assets.load("sounds/shoot/shootCollaris.ogg", arc.audio.Sound.class).loaded = a -> { shootCollaris = (arc.audio.Sound)a; soundToId.put(a, 126); idToSound.put(126, a); };
    Core.assets.load("sounds/shoot/shootConquer.ogg", arc.audio.Sound.class).loaded = a -> { shootConquer = (arc.audio.Sound)a; soundToId.put(a, 127); idToSound.put(127, a); };
    Core.assets.load("sounds/shoot/shootCorvus.ogg", arc.audio.Sound.class).loaded = a -> { shootCorvus = (arc.audio.Sound)a; soundToId.put(a, 128); idToSound.put(128, a); };
    Core.assets.load("sounds/shoot/shootCyclone.ogg", arc.audio.Sound.class).loaded = a -> { shootCyclone = (arc.audio.Sound)a; soundToId.put(a, 129); idToSound.put(129, a); };
    Core.assets.load("sounds/shoot/shootDiffuse.ogg", arc.audio.Sound.class).loaded = a -> { shootDiffuse = (arc.audio.Sound)a; soundToId.put(a, 130); idToSound.put(130, a); };
    Core.assets.load("sounds/shoot/shootDisperse.ogg", arc.audio.Sound.class).loaded = a -> { shootDisperse = (arc.audio.Sound)a; soundToId.put(a, 131); idToSound.put(131, a); };
    Core.assets.load("sounds/shoot/shootDuo.ogg", arc.audio.Sound.class).loaded = a -> { shootDuo = (arc.audio.Sound)a; soundToId.put(a, 132); idToSound.put(132, a); };
    Core.assets.load("sounds/shoot/shootEclipse.ogg", arc.audio.Sound.class).loaded = a -> { shootEclipse = (arc.audio.Sound)a; soundToId.put(a, 133); idToSound.put(133, a); };
    Core.assets.load("sounds/shoot/shootElude.ogg", arc.audio.Sound.class).loaded = a -> { shootElude = (arc.audio.Sound)a; soundToId.put(a, 134); idToSound.put(134, a); };
    Core.assets.load("sounds/shoot/shootEnergyField.ogg", arc.audio.Sound.class).loaded = a -> { shootEnergyField = (arc.audio.Sound)a; soundToId.put(a, 135); idToSound.put(135, a); };
    Core.assets.load("sounds/shoot/shootFlame.ogg", arc.audio.Sound.class).loaded = a -> { shootFlame = (arc.audio.Sound)a; soundToId.put(a, 136); idToSound.put(136, a); };
    Core.assets.load("sounds/shoot/shootFlamePlasma.ogg", arc.audio.Sound.class).loaded = a -> { shootFlamePlasma = (arc.audio.Sound)a; soundToId.put(a, 137); idToSound.put(137, a); };
    Core.assets.load("sounds/shoot/shootForeshadow.ogg", arc.audio.Sound.class).loaded = a -> { shootForeshadow = (arc.audio.Sound)a; soundToId.put(a, 138); idToSound.put(138, a); };
    Core.assets.load("sounds/shoot/shootFuse.ogg", arc.audio.Sound.class).loaded = a -> { shootFuse = (arc.audio.Sound)a; soundToId.put(a, 139); idToSound.put(139, a); };
    Core.assets.load("sounds/shoot/shootHorizon.ogg", arc.audio.Sound.class).loaded = a -> { shootHorizon = (arc.audio.Sound)a; soundToId.put(a, 140); idToSound.put(140, a); };
    Core.assets.load("sounds/shoot/shootLancer.ogg", arc.audio.Sound.class).loaded = a -> { shootLancer = (arc.audio.Sound)a; soundToId.put(a, 141); idToSound.put(141, a); };
    Core.assets.load("sounds/shoot/shootLaser.ogg", arc.audio.Sound.class).loaded = a -> { shootLaser = (arc.audio.Sound)a; soundToId.put(a, 142); idToSound.put(142, a); };
    Core.assets.load("sounds/shoot/shootLocus.ogg", arc.audio.Sound.class).loaded = a -> { shootLocus = (arc.audio.Sound)a; soundToId.put(a, 143); idToSound.put(143, a); };
    Core.assets.load("sounds/shoot/shootMalign.ogg", arc.audio.Sound.class).loaded = a -> { shootMalign = (arc.audio.Sound)a; soundToId.put(a, 144); idToSound.put(144, a); };
    Core.assets.load("sounds/shoot/shootMeltdown.ogg", arc.audio.Sound.class).loaded = a -> { shootMeltdown = (arc.audio.Sound)a; soundToId.put(a, 145); idToSound.put(145, a); };
    Core.assets.load("sounds/shoot/shootMerui.ogg", arc.audio.Sound.class).loaded = a -> { shootMerui = (arc.audio.Sound)a; soundToId.put(a, 146); idToSound.put(146, a); };
    Core.assets.load("sounds/shoot/shootMissile.ogg", arc.audio.Sound.class).loaded = a -> { shootMissile = (arc.audio.Sound)a; soundToId.put(a, 147); idToSound.put(147, a); };
    Core.assets.load("sounds/shoot/shootMissileLarge.ogg", arc.audio.Sound.class).loaded = a -> { shootMissileLarge = (arc.audio.Sound)a; soundToId.put(a, 148); idToSound.put(148, a); };
    Core.assets.load("sounds/shoot/shootMissileLong.ogg", arc.audio.Sound.class).loaded = a -> { shootMissileLong = (arc.audio.Sound)a; soundToId.put(a, 149); idToSound.put(149, a); };
    Core.assets.load("sounds/shoot/shootMissilePlasma.ogg", arc.audio.Sound.class).loaded = a -> { shootMissilePlasma = (arc.audio.Sound)a; soundToId.put(a, 150); idToSound.put(150, a); };
    Core.assets.load("sounds/shoot/shootMissilePlasmaShort.ogg", arc.audio.Sound.class).loaded = a -> { shootMissilePlasmaShort = (arc.audio.Sound)a; soundToId.put(a, 151); idToSound.put(151, a); };
    Core.assets.load("sounds/shoot/shootMissileShort.ogg", arc.audio.Sound.class).loaded = a -> { shootMissileShort = (arc.audio.Sound)a; soundToId.put(a, 152); idToSound.put(152, a); };
    Core.assets.load("sounds/shoot/shootMissileSmall.ogg", arc.audio.Sound.class).loaded = a -> { shootMissileSmall = (arc.audio.Sound)a; soundToId.put(a, 153); idToSound.put(153, a); };
    Core.assets.load("sounds/shoot/shootNavanax.ogg", arc.audio.Sound.class).loaded = a -> { shootNavanax = (arc.audio.Sound)a; soundToId.put(a, 154); idToSound.put(154, a); };
    Core.assets.load("sounds/shoot/shootOmura.ogg", arc.audio.Sound.class).loaded = a -> { shootOmura = (arc.audio.Sound)a; soundToId.put(a, 155); idToSound.put(155, a); };
    Core.assets.load("sounds/shoot/shootPayload.ogg", arc.audio.Sound.class).loaded = a -> { shootPayload = (arc.audio.Sound)a; soundToId.put(a, 156); idToSound.put(156, a); };
    Core.assets.load("sounds/shoot/shootPulsar.ogg", arc.audio.Sound.class).loaded = a -> { shootPulsar = (arc.audio.Sound)a; soundToId.put(a, 157); idToSound.put(157, a); };
    Core.assets.load("sounds/shoot/shootQuad.ogg", arc.audio.Sound.class).loaded = a -> { shootQuad = (arc.audio.Sound)a; soundToId.put(a, 158); idToSound.put(158, a); };
    Core.assets.load("sounds/shoot/shootReign.ogg", arc.audio.Sound.class).loaded = a -> { shootReign = (arc.audio.Sound)a; soundToId.put(a, 159); idToSound.put(159, a); };
    Core.assets.load("sounds/shoot/shootRetusa.ogg", arc.audio.Sound.class).loaded = a -> { shootRetusa = (arc.audio.Sound)a; soundToId.put(a, 160); idToSound.put(160, a); };
    Core.assets.load("sounds/shoot/shootRipple.ogg", arc.audio.Sound.class).loaded = a -> { shootRipple = (arc.audio.Sound)a; soundToId.put(a, 161); idToSound.put(161, a); };
    Core.assets.load("sounds/shoot/shootSalvo.ogg", arc.audio.Sound.class).loaded = a -> { shootSalvo = (arc.audio.Sound)a; soundToId.put(a, 162); idToSound.put(162, a); };
    Core.assets.load("sounds/shoot/shootSap.ogg", arc.audio.Sound.class).loaded = a -> { shootSap = (arc.audio.Sound)a; soundToId.put(a, 163); idToSound.put(163, a); };
    Core.assets.load("sounds/shoot/shootScathe.ogg", arc.audio.Sound.class).loaded = a -> { shootScathe = (arc.audio.Sound)a; soundToId.put(a, 164); idToSound.put(164, a); };
    Core.assets.load("sounds/shoot/shootScatter.ogg", arc.audio.Sound.class).loaded = a -> { shootScatter = (arc.audio.Sound)a; soundToId.put(a, 165); idToSound.put(165, a); };
    Core.assets.load("sounds/shoot/shootScepter.ogg", arc.audio.Sound.class).loaded = a -> { shootScepter = (arc.audio.Sound)a; soundToId.put(a, 166); idToSound.put(166, a); };
    Core.assets.load("sounds/shoot/shootScepterSecondary.ogg", arc.audio.Sound.class).loaded = a -> { shootScepterSecondary = (arc.audio.Sound)a; soundToId.put(a, 167); idToSound.put(167, a); };
    Core.assets.load("sounds/shoot/shootSegment.ogg", arc.audio.Sound.class).loaded = a -> { shootSegment = (arc.audio.Sound)a; soundToId.put(a, 168); idToSound.put(168, a); };
    Core.assets.load("sounds/shoot/shootSmite.ogg", arc.audio.Sound.class).loaded = a -> { shootSmite = (arc.audio.Sound)a; soundToId.put(a, 169); idToSound.put(169, a); };
    Core.assets.load("sounds/shoot/shootSpectre.ogg", arc.audio.Sound.class).loaded = a -> { shootSpectre = (arc.audio.Sound)a; soundToId.put(a, 170); idToSound.put(170, a); };
    Core.assets.load("sounds/shoot/shootStell.ogg", arc.audio.Sound.class).loaded = a -> { shootStell = (arc.audio.Sound)a; soundToId.put(a, 171); idToSound.put(171, a); };
    Core.assets.load("sounds/shoot/shootSublimate.ogg", arc.audio.Sound.class).loaded = a -> { shootSublimate = (arc.audio.Sound)a; soundToId.put(a, 172); idToSound.put(172, a); };
    Core.assets.load("sounds/shoot/shootTank.ogg", arc.audio.Sound.class).loaded = a -> { shootTank = (arc.audio.Sound)a; soundToId.put(a, 173); idToSound.put(173, a); };
    Core.assets.load("sounds/shoot/shootToxopidShotgun.ogg", arc.audio.Sound.class).loaded = a -> { shootToxopidShotgun = (arc.audio.Sound)a; soundToId.put(a, 174); idToSound.put(174, a); };
    Core.assets.load("sounds/movement/stepMud.ogg", arc.audio.Sound.class).loaded = a -> { stepMud = (arc.audio.Sound)a; soundToId.put(a, 175); idToSound.put(175, a); };
    Core.assets.load("sounds/movement/stepWater.ogg", arc.audio.Sound.class).loaded = a -> { stepWater = (arc.audio.Sound)a; soundToId.put(a, 176); idToSound.put(176, a); };
    Core.assets.load("sounds/movement/tankMove.ogg", arc.audio.Sound.class).loaded = a -> { tankMove = (arc.audio.Sound)a; soundToId.put(a, 177); idToSound.put(177, a); };
    Core.assets.load("sounds/movement/tankMoveHeavy.ogg", arc.audio.Sound.class).loaded = a -> { tankMoveHeavy = (arc.audio.Sound)a; soundToId.put(a, 178); idToSound.put(178, a); };
    Core.assets.load("sounds/movement/tankMoveSmall.ogg", arc.audio.Sound.class).loaded = a -> { tankMoveSmall = (arc.audio.Sound)a; soundToId.put(a, 179); idToSound.put(179, a); };
    Core.assets.load("sounds/ui/uiBack.ogg", arc.audio.Sound.class).loaded = a -> { uiBack = (arc.audio.Sound)a; soundToId.put(a, 180); idToSound.put(180, a); };
    Core.assets.load("sounds/ui/uiButton.ogg", arc.audio.Sound.class).loaded = a -> { uiButton = (arc.audio.Sound)a; soundToId.put(a, 181); idToSound.put(181, a); };
    Core.assets.load("sounds/ui/uiChat.ogg", arc.audio.Sound.class).loaded = a -> { uiChat = (arc.audio.Sound)a; soundToId.put(a, 182); idToSound.put(182, a); };
    Core.assets.load("sounds/ui/uiNotify.ogg", arc.audio.Sound.class).loaded = a -> { uiNotify = (arc.audio.Sound)a; soundToId.put(a, 183); idToSound.put(183, a); };
    Core.assets.load("sounds/ui/uiUnlock.ogg", arc.audio.Sound.class).loaded = a -> { uiUnlock = (arc.audio.Sound)a; soundToId.put(a, 184); idToSound.put(184, a); };
    Core.assets.load("sounds/block/unitCreate.ogg", arc.audio.Sound.class).loaded = a -> { unitCreate = (arc.audio.Sound)a; soundToId.put(a, 185); idToSound.put(185, a); };
    Core.assets.load("sounds/block/unitCreateBig.ogg", arc.audio.Sound.class).loaded = a -> { unitCreateBig = (arc.audio.Sound)a; soundToId.put(a, 186); idToSound.put(186, a); };
    Core.assets.load("sounds/explosions/unitExplode1.ogg", arc.audio.Sound.class).loaded = a -> { unitExplode1 = (arc.audio.Sound)a; soundToId.put(a, 187); idToSound.put(187, a); };
    Core.assets.load("sounds/explosions/unitExplode2.ogg", arc.audio.Sound.class).loaded = a -> { unitExplode2 = (arc.audio.Sound)a; soundToId.put(a, 188); idToSound.put(188, a); };
    Core.assets.load("sounds/explosions/unitExplode3.ogg", arc.audio.Sound.class).loaded = a -> { unitExplode3 = (arc.audio.Sound)a; soundToId.put(a, 189); idToSound.put(189, a); };
    Core.assets.load("sounds/movement/walkerStep.ogg", arc.audio.Sound.class).loaded = a -> { walkerStep = (arc.audio.Sound)a; soundToId.put(a, 190); idToSound.put(190, a); };
    Core.assets.load("sounds/movement/walkerStepSmall.ogg", arc.audio.Sound.class).loaded = a -> { walkerStepSmall = (arc.audio.Sound)a; soundToId.put(a, 191); idToSound.put(191, a); };
    Core.assets.load("sounds/movement/walkerStepTiny.ogg", arc.audio.Sound.class).loaded = a -> { walkerStepTiny = (arc.audio.Sound)a; soundToId.put(a, 192); idToSound.put(192, a); };
    Core.assets.load("sounds/ui/waveSpawn.ogg", arc.audio.Sound.class).loaded = a -> { waveSpawn = (arc.audio.Sound)a; soundToId.put(a, 193); idToSound.put(193, a); };
    Core.assets.load("sounds/environment/wind.ogg", arc.audio.Sound.class).loaded = a -> { wind = (arc.audio.Sound)a; soundToId.put(a, 194); idToSound.put(194, a); };
    Core.assets.load("sounds/environment/wind2.ogg", arc.audio.Sound.class).loaded = a -> { wind2 = (arc.audio.Sound)a; soundToId.put(a, 195); idToSound.put(195, a); };
    Core.assets.load("sounds/environment/wind3.ogg", arc.audio.Sound.class).loaded = a -> { wind3 = (arc.audio.Sound)a; soundToId.put(a, 196); idToSound.put(196, a); };
    Core.assets.load("sounds/environment/windHowl.ogg", arc.audio.Sound.class).loaded = a -> { windHowl = (arc.audio.Sound)a; soundToId.put(a, 197); idToSound.put(197, a); };
    Core.assets.load("sounds/explosions/wreckFall.ogg", arc.audio.Sound.class).loaded = a -> { wreckFall = (arc.audio.Sound)a; soundToId.put(a, 198); idToSound.put(198, a); };
    Core.assets.load("sounds/explosions/wreckFallBig.ogg", arc.audio.Sound.class).loaded = a -> { wreckFallBig = (arc.audio.Sound)a; soundToId.put(a, 199); idToSound.put(199, a); };
  }
}
