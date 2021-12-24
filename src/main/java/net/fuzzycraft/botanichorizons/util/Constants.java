package net.fuzzycraft.botanichorizons.util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public final class Constants {
    private Constants() {}

    public static final int POOL_META_DILUTE = 2;
    public static final int POOL_META_REGULAR = 0;
    public static final int POOL_META_REGULAR_FABULOUS = 3;
    public static final int POOL_META_CREATIVE = 1;

    public static final int SPREADER_META_REGULAR = 0;
    public static final int SPREADER_META_ALFHEIM = 2;
    public static final int SPREADER_META_GAIA = 3;
    public static final int SPREADER_META_PULSE = 1;

    public static final int MANARESOURCE_META_MANASTEEL = 0;
    public static final int MANARESOURCE_META_DIAMOND = 2;
    public static final int MANARESOURCE_META_PEARL = 1;
    public static final int MANARESOURCE_META_TERRASTEEL = 4;
    public static final int MANARESOURCE_META_GAIA_SPIRIT = 5;
    public static final int MANARESOURCE_META_ELEMENTIUM = 7;
    public static final int MANARESOURCE_META_DRAGONSTONE = 9;
    public static final int MANARESOURCE_META_PRISMARINE = 10;
    public static final int MANARESOURCE_META_GAIA_INGOT = 14;
    public static final int MANARESOURCE_META_MANAPOWDER = 23;

    public static final int STORAGE_META_MANASTEELBLOCK = 0;
    public static final int STORAGE_META_TERRASTEELBLOCK = 1;
    public static final int STORAGE_META_ELEMENTIUMBLOCK = 2;
    public static final int STORAGE_META_DIAMONDBLOCK = 3;
    public static final int STORAGE_META_DRAGONSTONEBLOCK = 4;

    public static final int SEEDS_META_GRASS = 0;
    public static final int SEEDS_META_PODZOL = 1;
    public static final int SEEDS_META_MYCELIUM = 2;
    public static final int SEEDS_META_DRY = 3;
    public static final int SEEDS_META_GOLD = 4;
    public static final int SEEDS_META_VIVID = 5;
    public static final int SEEDS_META_SCORCHED = 6;
    public static final int SEEDS_META_INFUSED = 7;
    public static final int SEEDS_META_MUTATED = 8;

    public static final int LIVINGWOOD_META_BLOCK = 0;
    public static final int LIVINGWOOD_META_PLANK = 1;
    public static final int LIVINGWOOD_META_MOSSY = 2;
    public static final int LIVINGWOOD_META_FRAMED = 3;
    public static final int LIVINGWOOD_META_PATTERNED = 4;
    public static final int LIVINGWOOD_META_GLIMMERING = 5;

    public static final int PYLON_META_MANA = 0;
    public static final int PYLON_META_NATURA = 1;
    public static final int PYLON_META_GAIA = 2;

    public static final int QUARTZ_META_MANA = 1;

    public static final String THAUMCRAFT_METAL_DEVICE = "Thaumcraft:blockMetalDevice";
    public static final String THAUMCRAFT_STONE_DEVICE = "Thaumcraft:blockStoneDevice";
    public static final int THAUMCRAFT_METAL_META_CRUCIBLE = 0;
    public static final int THAUMCRAFT_METAL_META_CONSTRUCT = 9;
    public static final int THAUMCRAFT_STONE_META_PEDESTAL = 1;
    public static final int THAUMCRAFT_STONE_META_RUNIC_MATRIX = 2;

    public static final String GT_CASING_ID = "gregtech:gt.blockcasings4";
    public static final int GT_CASING_META = 1;

    public static final int POOL_MAX_MANA_DILUTED =   10000;
    public static final int POOL_MAX_MANA_REGULAR = 1000000;

    public static ItemStack thaumcraftCrucible() {
        return new ItemStack(Block.getBlockFromName(THAUMCRAFT_METAL_DEVICE), 1, THAUMCRAFT_METAL_META_CRUCIBLE);
    }

    public static ItemStack thaumcraftMatrix() {
        return new ItemStack(Block.getBlockFromName(THAUMCRAFT_STONE_DEVICE), 1, THAUMCRAFT_STONE_META_RUNIC_MATRIX);
    }

    public static ItemStack thaumcraftConstruct() {
        return new ItemStack(Block.getBlockFromName(THAUMCRAFT_METAL_DEVICE), 1, THAUMCRAFT_METAL_META_CONSTRUCT);
    }

    public static ItemStack gtTradeCasing() {
        return new ItemStack(Block.getBlockFromName(GT_CASING_ID), 1, GT_CASING_META);
    }
}
