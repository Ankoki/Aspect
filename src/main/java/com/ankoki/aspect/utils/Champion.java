package com.ankoki.aspect.utils;

// For future reference, update at from https://darkintaqt.com/blog/league-champ-id-list/
public enum Champion {

    AATROX(266),
    AHRI(103),
    AKALI(84),
    AKSHAN(166),
    ALISTAR(12),
    AMUMU(32),
    ANIVIA(34),
    ANNIE(1),
    APHELIOS(523),
    ASHE(22),
    AURELION_SOL(136),
    AZIR(268),
    BARD(432),
    BLITZCRANK(53),
    BRAND(63),
    BRAUM(201),
    CAITLYN(51),
    CAMILLE(164),
    CASSIOPEIA(69),
    CHO_GATH(31),
    CORKI(42),
    DARIUS(122),
    DIANA(131),
    DRAVEN(119),
    DR_MUNDO(36),
    EKKO(245),
    ELISE(60),
    EVELYNN(28),
    EZREAL(81),
    FIDDLESTICKS(9),
    FIORA(114),
    FIZZ(105),
    GALIO(3),
    GANGPLANK(41),
    GAREN(86),
    GNAR(150),
    GRAGAS(79),
    GRAVES(104),
    GWEN(887),
    HECARIM(120),
    HEIMERDINGER(74),
    ILLAOI(420),
    IRELIA(39),
    IVERN(427),
    JANNA(40),
    JARVAN_IV(59),
    JAX(24),
    JAYCE(126),
    JHIN(202),
    JINX(222),
    KAI_SA(145),
    KALISTA(429),
    KARMA(43),
    KARTHUS(30),
    KASSADIN(38),
    KATARINA(55),
    KAYLE(10),
    KAYN(141),
    KENNEN(85),
    KHA_ZIX(121),
    KINDRED(203),
    KLED(240),
    KOG_MAW(96),
    LEBLANC(7),
    LEE_SIN(64),
    LEONA(89),
    LILLIA(876),
    LISSANDRA(127),
    LUCIAN(236),
    LULU(117),
    LUX(99),
    MALPHITE(54),
    MALZAHAR(90),
    MAOKAI(57),
    MASTER_YI(11),
    MISS_FORTUNE(21),
    MORDEKAISER(82),
    MORGANA(25),
    NAMI(267),
    NASUS(75),
    NAUTLIUS(111),
    NEEKO(518),
    NIDALEE(76),
    NOCTURNE(56),
    NUNU_AND_WILLUMP(20),
    OLAF(2),
    ORIANNA(61),
    ORNN(516),
    PANTHEON(80),
    POPPY(78),
    PYKE(555),
    QIYANA(246),
    QUINN(133),
    RAKAN(497),
    RAMMUS(33),
    REK_SAI(421),
    RELL(526),
    RENEKTON(58),
    RENGAR(107),
    RIVEN(92),
    RUMBLE(68),
    RYZE(13),
    SAMIRA(360),
    SEJUANI(113),
    SENNA(235),
    SERAPHINE(147),
    SETT(875),
    SHACO(35),
    SHEN(98),
    SHYVANA(102),
    SINGED(27),
    SION(14),
    SIVIR(15),
    SKARNER(72),
    SONA(37),
    SORAKA(16),
    SWAIN(50),
    SYLAS(517),
    SYNDRA(134),
    TAHM_KENCH(223),
    TALIYAH(163),
    TALON(91),
    TARIC(44),
    TEEMO(17),
    THRESH(412),
    TRISTANA(18),
    TRUNDLE(48),
    TRYNDAMERE(23),
    TWISTED_FATE(4),
    TWITCH(29),
    UDYR(77),
    URGOT(6),
    VARUS(110),
    VAYNE(67),
    VEIGAR(45),
    VEL_KOZ(161),
    VI(254),
    VIEGO(234),
    VIKTOR(112),
    VLADMIR(8),
    VOLIBEAR(106),
    WARWICK(19),
    WUKONG(62),
    XAYAH(498),
    XERATH(101),
    XIN_ZHAO(5),
    YASUO(157),
    YONE(777),
    YORICK(83),
    YUUMI(350),
    ZAC(154),
    ZED(238),
    ZIGGS(115),
    ZILEAN(26),
    ZOE(142),
    ZYRA(143);

    private final int id;
    Champion(int championId) {
        this.id = championId;
    }

    public int getId() {
        return id;
    }

    public static Champion fromId(int id) {
        for (Champion champion : Champion.values()) {
            if (champion.getId() == id) return champion;
        }
        return null;
    }

    public static Champion fromName(String name) {
        if (name.equalsIgnoreCase("Cho'Gath")) return CHO_GATH;
        else if (name.equalsIgnoreCase("Kai'Sa")) return KAI_SA;
        else if (name.equalsIgnoreCase("Kha'Zix")) return KHA_ZIX;
        else if (name.equalsIgnoreCase("Kog'Maw")) return KOG_MAW;
        else if (name.equalsIgnoreCase("Rek'Sai")) return REK_SAI;
        else if (name.equalsIgnoreCase("Vel'Koz")) return VEL_KOZ;
        for (Champion champion : Champion.values()) {
            if (champion.name().equalsIgnoreCase(name)) return champion;
        }
        return null;
    }

    @Override
    public String toString() {
        if (this == CHO_GATH) return "Cho'Gath";
        else if (this == KAI_SA) return "Kai'Sa";
        else if (this == KHA_ZIX) return "Kha'Zix";
        else if (this == KOG_MAW) return "Kog'Maw";
        else if (this == REK_SAI) return "Rek'Sai";
        else if (this == VEL_KOZ) return "Vel'Koz";
        else return Utils.titleCaseConversion(name());
    }
}