package com.dori.SpringStory.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Job {
    Beginner(0),
    Warrior(100),
    Fighter(110),
    Crusader(111),
    Hero(112),
    Page(120),
    WhiteKnight(121),
    Paladin(122),
    Spearman(130),
    DragonKnight(131),
    DarkKnight(132),
    Magician(200),
    FirePoisonWizard(210),
    FirePoisonMage(211),
    FirePoisonArchMage(212),
    IceLightningWizard(220),
    IceLightningMage(221),
    IceLightningArchMage(222),
    Cleric(230),
    Priest(231),
    Bishop(232),
    Bowman(300),
    Hunter(310),
    Ranger(311),
    BowMaster(312),
    Crossbowman(320),
    Sniper(321),
    Marksman(322),
    Thief(400),
    Assasin(410),
    Hermit(411),
    Nightlord(412),
    Bandit(420),
    ChiefBandit(421),
    Shadower(422),
    BladeRecruit(430),
    BladeAcolyte(431),
    BladeSpecialist(432),
    BladeLord(433),
    BladeMaster(434),
    Pirate(500),
    Brawler(510),
    Marauder(511),
    Buccaneer(512),
    Gunslinger(520),
    Outlaw(521),
    Corsair(522),
    Manager(800),
    GM(900),
    SuperGM(910),
    Noblesse(1000),
    DawnWarrior1(1100),
    DawnWarrior2(1110),
    DawnWarrior3(1111),
    DawnWarrior4(1112),
    BlazeWizard1(1200),
    BlazeWizard2(1210),
    BlazeWizard3(1211),
    BlazeWizard4(1212),
    WindArcher1(1300),
    WindArcher2(1310),
    WindArcher3(1311),
    WindArcher4(1312),
    NightWalker1(1400),
    NightWalker2(1410),
    NightWalker3(1411),
    NightWalker4(1412),
    ThunderBreaker1(1500),
    ThunderBreaker2(1510),
    ThunderBreaker3(1511),
    ThunderBreaker4(1512),
    Legend(2000),
    Evan(2001),
    Aran2(2100),
    Aran3(2110),
    Aran4(2111),
    Aran5(2112),
    Evan2(2200),
    Evan3(2210),
    Evan4(2211),
    Evan5(2212),
    Evan6(2213),
    Evan7(2214),
    Evan8(2215),
    Evan9(2216),
    Evan10(2217),
    Evan11(2218),
    Citizen(3000),
    BattleMage1(3200),
    BattleMage2(3210),
    WildHunter1(3300),
    WildHunter2(3310),
    Mechanic1(3500),
    Mechanic2(3510),
    AdditionalSkills(9000)
    ;

    private final int id;

    Job(int id){
        this.id = id;
    }

    public static Job getJobById(int id){
        return Arrays.stream(values())
                .filter(job -> job.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
