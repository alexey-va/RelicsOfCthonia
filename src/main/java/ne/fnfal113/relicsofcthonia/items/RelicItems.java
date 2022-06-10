package ne.fnfal113.relicsofcthonia.items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import ne.fnfal113.relicsofcthonia.RelicsOfCthonia;
import org.bukkit.NamespacedKey;

public class RelicItems {

    public static final NestedItemGroup RELIC_MAIN_GROUP = new NestedItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "main_group"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "caf59b8aa0f83546ef0d178ccf87e7ed88cf7858caae79b3633cbd75b650525f")),
                    "&6Relics of Cthonia"));

    public static final SubItemGroup COMMON_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "47ec41e0df8e170d97f9b9af1d65edad4979c78c89b01b180f389ee08a61af82")),
                    "&aCommon Relic"));

    public static final SubItemGroup UNCOMMON_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "ba6dac8035d361ba7f2c2a614b4ebaafc1e5e3101f85beef683536f337e5090")),
                    "&7Uncommon Relic"));

    public static final SubItemGroup RARE_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "38c0f04bcabab2e0f0eee0dbdfc6ec4b4c65ecc1c1e3237c3d1d98b863b2f73")),
                    "&9Rare Relic"));

    public static final SubItemGroup EPIC_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2ee4a5cd4ee6e989a63dc41c4b40d83f0d58598e7ecdf2c94dfeec0ada02ec93")),
                    "&dEpic Relic"));

    public static final SubItemGroup LEGENDARY_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2d0bdf39b54f49692fb379b4eb04d1eb4a00e78ed3911ad3b63a7e5bf3176837")),
                    "&6Legendary Relic"));

    public static final SlimefunItemStack COMMON_RELIC_CTHONIAN_PEARL = new SlimefunItemStack(
            "COMMON_RELIC_CTHONIAN_PEARL",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "377d4a206d7757f479f332ec1a2bbbee57cef97568dd88df81f4864aee7d3d98")),
            "&aCthonian Pearl",
            "",
            "&bCommonly used by cthonians for",
            "&btransportation and are widely",
            "&bscattered in the waste due to",
            "&bhigh amount of produced pearls",
            "",
            "&dRarity: &aCommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_RING_OF_SUFFERING = new SlimefunItemStack(
            "COMMON_RELIC_RING_OF_SUFFERING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2462ba9115b808a6b7ff16851ff3b4c9e85add489deb7c15110f8cc6bb6d95aa")),
            "&aRing of Suffering",
            "",
            "&bThis ring is given to sinners of",
            "&bCthonia as a punishment for the",
            "&bsins made against the polis or",
            "&bcity.",
            "",
            "&dRarity: &aCommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_FISHING_SACK = new SlimefunItemStack(
            "COMMON_RELIC_FISHING_SACK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "be8cd3f57d9fe1ac3cd54fb85f3c96a95479b14f99d2e5a0119f5a52c21ec327")),
            "&aFishing Sack",
            "",
            "&bUsed by the fishermen of Cthonia",
            "&bto store caught fish and worn as",
            "&bbackpack or cape for ease use",
            "",
            "&dRarity: &aCommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_PETTY_MARBLE_BLOCK = new SlimefunItemStack(
            "COMMON_RELIC_PETTY_MARBLE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "785a206697d35709ce271f3853933d8a4b4ef105629d2d74e4ad93ce70b1fc0c")),
            "&aPetty Marble Block",
            "",
            "&bA common marble block from the",
            "&bquarries of cthonia, petty but",
            "&bit still holds a little value",
            "",
            "&dRarity: &aCommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_HEALING_POTION = new SlimefunItemStack(
            "COMMON_RELIC_HEALING_POTION",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6b4a5c29d901721851d8868b9075f49c476a894098c7ef2665813c552bbc9add")),
            "&aHealing Potion",
            "",
            "&bPreserved healing potion that",
            "&bwere used by the people of",
            "&bcthonia, may not be as effective",
            "&banymore but handy to have",
            "",
            "&dRarity: &aCommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_LEATHER_HELMET = new SlimefunItemStack(
            "COMMON_RELIC_LEATHER_HELMET",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "a804b82567acbae7c0fafe6538fd0ad6a826bd2f1ffa9f2ffa0cb78c0c2d28d2")),
            "&aLeather helmet",
            "",
            "&bCommonly used by cthonian",
            "&barmy specifically lower",
            "&branked soldiers. Light to",
            "&buse and gives more agile",
            "",
            "&dRarity: &aCommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_MUSHROOM = new SlimefunItemStack(
            "COMMON_RELIC_MUSHROOM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "c9d9df8213a1ad4660589c8318608d791bac3a77e373a3fb55d36e95e7234c04")),
            "&aMushroom",
            "",
            "&bUsually stored under the ground",
            "&bwith a cover to preserve and is",
            "&ba survival delicacy, commonly",
            "&bfound in the outskirts of cthonia",
            "&b and gives a good amount of energy",
            "&bwhen consumed",
            "",
            "&dRarity: &aCommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_PINK_SALT = new SlimefunItemStack(
            "UNCOMMON_RELIC_PINK_SALT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6d9d3005c9368ced2992eaf386acfdc958ae24845a72fd5b335a780cb3e12a31")),
            "&7Pink Salt",
            "",
            "&bAn ingredient used for brewing",
            "&bpotions which are found in the",
            "&bin the thrace region of cthonia",
            "",
            "&dRarity: &7Uncommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_SKULL_HAT = new SlimefunItemStack(
            "UNCOMMON_RELIC_SKULL_HAT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "567c420bdba7ca36c968d4d1368564af7956379637aa431db68198d6254bbedb")),
            "&7Skull Hat",
            "",
            "&bWorn during the celebration of",
            "&bthe dead. Not commonly found",
            "&bsince its only a seasonal item",
            "",
            "&dRarity: &7Uncommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_CTHONIAN_TOKEN = new SlimefunItemStack(
            "UNCOMMON_RELIC_CTHONIAN_TOKEN",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1326cafa585acf7c04f19a3d9359ba778557ae4cd790021afc648988653bb99b")),
            "&7Cthonian Token",
            "",
            "&bA currency for paying goods",
            "&band services. Exact currency",
            "&bis unknown though",
            "",
            "&dRarity: &7Uncommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_AGED_WINE = new SlimefunItemStack(
            "UNCOMMON_RELIC_AGED_WINE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "bd2b65b79b4904514a0fc7232ea89a9e8c6ac60ee3dba1b5975b7755127338a4")),
            "&7Aged Wine",
            "",
            "&b200+ years aged wine that",
            "&bare leftovers of desolated",
            "&bcthonia.",
            "",
            "&dRarity: &7Uncommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_TANZANITE_BLOCK = new SlimefunItemStack(
            "UNCOMMON_RELIC_TANZANITE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "e32b72ad6ea8149dda6690f76db523f5bb11579af32242397265641b60090246")),
            "&7Tanzanite Block",
            "",
            "&bUncommon mineral block that",
            "&bcthonians mine in the quarries",
            "&bthey haven't fully excavated",
            "",
            "&dRarity: &7Uncommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_BLUE_GLOWSTONE = new SlimefunItemStack(
            "UNCOMMON_RELIC_BLUE_GLOWSTONE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "904bef1ff44f5c979639c574b55187ce236c3cf173295ad45b50407fef4e92")),
            "&7Blue Glowstone",
            "",
            "&bA lighting block uncommonly seen",
            "&bin some cthonian buildings",
            "",
            "&dRarity: &7Uncommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_GRAY_BERRY = new SlimefunItemStack(
            "UNCOMMON_RELIC_GRAY_BERRY",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6e7653873d0a3a29d4c6a32552ee7db0c2342a1b700171c4cd337c9e9aff68f2")),
            "&7Gray Berry",
            "",
            "&bI wonder why these are colored",
            "&bgray but these berries are",
            "&bpreserved well under the grounds",
            "",
            "&dRarity: &7Uncommon",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_MARRIAGE_RING = new SlimefunItemStack(
            "RARE_RELIC_MARRIAGE_RING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "12ed9a330d08be07d17cfa6a296e7f1b5f82bf9f4144596f1d23d72d9721b7f8")),
            "&9Marriage Ring",
            "",
            "&bA special ring sought of by",
            "&bcthonian researchers for whom",
            "&bthey belong to",
            "",
            "&dRarity: &9Rare",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_BLAZE_ASHES = new SlimefunItemStack(
            "RARE_RELIC_BLAZE_ASHES",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "93068a116f66d4cf13b5febe23719186421bce6a8ab51e321b3a182b5d0f0169")),
            "&9Blaze Ashes",
            "",
            "&bLeftover ashes during the",
            "&bdesolation of cthonia, it",
            "&bholds an element unknown to",
            "&bcthonian researchers",
            "",
            "&dRarity: &9Rare",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_CROSSED_SWORDS = new SlimefunItemStack(
            "RARE_RELIC_CROSSED_SWORDS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6a5361b52daf4f1c5c5480a39faaa10897595fa5763f757bdda3956588fec678")),
            "&9Crossed Swords",
            "",
            "&bDropped by soldiers during the",
            "&bcthonian war of roses. Cannot",
            "&bbe used in combat due to its",
            "&bcondition but a rare relic to have",
            "",
            "&dRarity: &9Rare",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_CERULEAN_GEM = new SlimefunItemStack(
            "RARE_RELIC_CERULEAN_GEM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "e4e71671db5f69d2c46a0d72766b249c1236d726782c00a0e22668df5772d4b9")),
            "&9Cerulean Gem",
            "",
            "&bA rare gem that can only be found",
            "&bcon the baltic region of cthonia.",
            "",
            "&dRarity: &9Rare",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_TERRACOTTA_POT = new SlimefunItemStack(
            "RARE_RELIC_TERRACOTTA_POT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "79e73f08459f2053f6acabeedbd6c0ef2c508830222ab1c0066ca9d9ffb7935e")),
            "&9Terracotta Pot",
            "",
            "&bRare potteries rich in floral",
            "&bpaintings that depicts the daily",
            "&blife of cthonian people",
            "",
            "&dRarity: &9Rare",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_GOLDEN_JAR = new SlimefunItemStack(
            "RARE_RELIC_GOLDEN_JAR",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7b32617ae031163baf549b6e113f6c401470faac4bdbe9beb75c19d9aad83f8e")),
            "&9Golden Jar",
            "",
            "&bShiny golden jars from the early",
            "&bcthonic age that are kept only",
            "&bby the high politeia",
            "",
            "&dRarity: &9Rare",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_HORN_OF_TAURUS = new SlimefunItemStack(
            "RARE_RELIC_HORN_OF_TAURUS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "79b8d0cf93532c1b6c70223cdd0440ef6def2ad436b51e2850ca8e5c64e84470")),
            "&9Horn of Taurus",
            "",
            "&bOne of the rare items that were",
            "&bsought off by relic traders due",
            "&bto its historical value",
            "",
            "&dRarity: &9Rare",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_LUMINOUS_PEARL = new SlimefunItemStack(
            "EPIC_RELIC_LUMINOUS_PEARL",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2dbd4e5d3d9c05a036fb62e6e70faf9e6f98d294f9d006781c144c9f15b87715")),
            "&dLuminous Pearl",
            "",
            "&bA shiny bright pearl only found",
            "&bunder the black oceans of cthonia",
            "",
            "&dRarity: &dEpic",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_VALIANT_TALISMAN = new SlimefunItemStack(
            "EPIC_RELIC_VALIANT_TALISMAN",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "50857d0860dc9e21461126a444262b8d70d5ed9a8aed51144a0be03bb5a41899")),
            "&dValiant Talisman",
            "",
            "&bOnly awarded to high ranked soldiers",
            "&bof cthonia and symbolizes valor as",
            "&bdepicted in cthonian war of attrition",
            "",
            "&dRarity: &dEpic",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_FLAWLESS_AQUA_GEM = new SlimefunItemStack(
            "EPIC_RELIC_FLAWLESS_AQUA_GEM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "a11067bae82704b15490af20a8a60626321fe677195b9e5bd57e6aa79059503d")),
            "&dFlawless Aqua Gem",
            "",
            "&bGem collectors are anticipated of",
            "&bthis gem. It can only be mined under",
            "&bthe vast white oceans of cthonia",
            "",
            "&dRarity: &dEpic",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_BOTTLE_O_POWER = new SlimefunItemStack(
            "EPIC_RELIC_BOTTLE_O_POWER",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "348a7ea198ec4efd8b56bcda8aa4230039e04d1338ee98fa85897bd4f342d632")),
            "&dBottle o Power",
            "",
            "&bMagically filled bottle that aims",
            "&bto give cthonian soldiers advantage",
            "&bin combat by increasing their overall",
            "&bstrength and logical thinking",
            "",
            "&dRarity: &dEpic",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_FERVOR_HELMET = new SlimefunItemStack(
            "EPIC_RELIC_FERVOR_HELMET",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1d47cf6e12d12a5eb161759ba95689a9237ec111473e92a140ecab0158dfd258")),
            "&dFervor Helmet",
            "",
            "&bHelmet of Fervor who fought until his",
            "&bdemise, such replicas exist with the",
            "&bblessing of fervor that traders are",
            "&bsearching for",
            "",
            "&dRarity: &dEpic",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_THUNDER_IN_A_BOTTLE = new SlimefunItemStack(
            "EPIC_RELIC_THUNDER_IN_A_BOTTLE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "ab3616f523bf5a00bf2b3e9fb8314c47390b90a5ca68c5db3684acd567430cd3")),
            "&dThunder In A Bottle",
            "",
            "&bOne can summon a thunder with this",
            "&bfilled bottle and cause chaos in the",
            "&bpath of warriors",
            "",
            "&dRarity: &dEpic",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_MYSTERIOUS_HOLOCRON = new SlimefunItemStack(
            "LEGENDARY_RELIC_MYSTERIOUS_HOLOCRON",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "b069c4498b7e4e90276fee28786bf5e9b3ff8b39d667d36a6923d880a627ab77")),
            "&6Mysterious Holocron",
            "",
            "&bFound in dwemer dungeons of cthonia",
            "&bwhere it is highly sought off by",
            "&bresearchers due to its historical",
            "&bvalue and knowledge",
            "",
            "&dRarity: &6Legendary",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_EYE_OF_SAURON = new SlimefunItemStack(
            "LEGENDARY_RELIC_EYE_OF_SAURON",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "86648a14748a3b00ef6391f669ca19b8a91ec2f31f43a99cdff9f7b511869f62")),
            "&6Eye of Sauron",
            "",
            "&bThe legendary of eye of sauron",
            "&bwhich can be obtained by killing",
            "&bthe high ainur guards of sauron",
            "&btower",
            "",
            "&dRarity: &6Legendary",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_SKULL_OF_PROMETHEUS = new SlimefunItemStack(
            "LEGENDARY_RELIC_SKULL_OF_PROMETHEUS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "662196e42def995819298fbd2a9bbfc2f45564fd448faf9ac9bed7bb87754574")),
            "&6Skull of Prometheus",
            "",
            "&bThe legendary skull of prometheus",
            "&bdroppped by slaying prometheus mobs",
            "&bin the dark valleys of cthonia",
            "",
            "&dRarity: &6Legendary",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_MAGMA_GAUNTLET = new SlimefunItemStack(
            "LEGENDARY_RELIC_MAGMA_GAUNTLET",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "168a2bfe6e56ddea103de8cec000efa83ebb9a959c68d82402543c01d4137d26")),
            "&6Magma Gauntlet",
            "",
            "&bOnly the mighty can obtain this item",
            "&bfrom the depths of hellica, a magma",
            "&bformed gauntlet from the ancient past",
            "&bduring the golden age of cthonia",
            "",
            "&dRarity: &6Legendary",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_GLAZING_PEARL = new SlimefunItemStack(
            "LEGENDARY_RELIC_GLAZING_PEARL",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "46e0a3cc6657d4205818ffef5cc7b7e36c381d4269b69010c7297a6fa68d83d7")),
            "&6Glazing Pearl",
            "",
            "&bOh glazing pearl, I seek for wisdom",
            "&band knowledge to relive the past for",
            "&bwhen cthonia still exist",
            "",
            "&dRarity: &6Legendary",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_SAPPHIRE_RING = new SlimefunItemStack(
            "LEGENDARY_RELIC_SAPPHIRE_RING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "dd8df6feff41a987f53a1e03c298017771767b263808203386b7737a9c86613f")),
            "&6Sapphire Ring",
            "",
            "&bOnly cthonian kings can posses this",
            "&bsapphire ring for which it symbolizes",
            "&bthe prosperity of cthonia",
            "",
            "&dRarity: &6Legendary",
            "&dCondition: " + "&d%",
            "",
            "&eDrop chance: " + "&e%",
            "&eDrops on:",
            "",
            "&aPiglin trade chance:",
            "&a‣ Depends on Relic Condition",
            "&aPossible Piglin reward:",
            "",
            "&eRight click a piglin to",
            "&etrade this relic",
            "",
            "&eRight click this relic in your",
            "&eoffhand to check for uses",
            "",
            "&6Φ Relics of Cthonia Φ"
    );

    public static final SlimefunItemStack RELIC_DROP_TYPE = new SlimefunItemStack(
            "RELIC_DROP_TYPE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7406e45318e9a4a6bfe132f202fe3ceac15d11eaedbef1eb06a376db433090a8")),
            "&6Drop type",
            "",
            "&eObtain this item by mining materials",
            "&eor killing mobs according to the",
            "&eitem lore of the relic"
    );

}
