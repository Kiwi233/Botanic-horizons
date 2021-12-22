package net.fuzzycraft.botanichorizons.patches;

import gregtech.api.util.GT_ModHandler;
import net.fuzzycraft.botanichorizons.mod.OreDict;
import net.fuzzycraft.botanichorizons.util.Constants;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.block.ModFluffBlocks;
import vazkii.botania.common.crafting.ModCraftingRecipes;
import vazkii.botania.common.item.ItemTwigWand;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.lib.LibOreDict;

import java.util.Arrays;

public class CraftingPatches {
    public static void applyPatches() {

        // Lexicon Recipe
        addShapelessOreDictRecipe(new ItemStack(ModItems.lexicon), OreDict.MUSHROOM, Items.book);
        ModCraftingRecipes.recipeLexicon = BotaniaAPI.getLatestAddedRecipe();

        // Petal/Dye Recipes
        // Has 2x yield in extractor
        for(int i = 0; i < 16; i++)
            addShapelessOreDictRecipe(new ItemStack(ModItems.petal, 1, i), LibOreDict.FLOWER[i]);
        ModCraftingRecipes.recipesPetals = BotaniaAPI.getLatestAddedRecipes(16);

        // Wand of the Forest Recipes
        for(int i = 0; i < 16; i++)
            for(int j = 0; j < 16; j++) {
                addOreDictRecipe(ItemTwigWand.forColors(i, j),
                        " AS", " SB", "S  ",
                        'A', OreDict.FLOWER_INGREDIENT[i],
                        'B', OreDict.FLOWER_INGREDIENT[j],
                        'S', LibOreDict.LIVINGWOOD_TWIG);
            }
        ModCraftingRecipes.recipesTwigWand = BotaniaAPI.getLatestAddedRecipes(256);

        // Petal Apothecary Recipes
        for(int i = 0; i < 16; i++)
            addOreDictRecipe(new ItemStack(ModBlocks.altar),
                    "SPS", " U ", "CCC",
                    'S', "plateIron",
                    'P', OreDict.FLOWER_INGREDIENT[i],
                    'U', new ItemStack(Items.cauldron),
                    'C', "stone");
        ModCraftingRecipes.recipesApothecary = BotaniaAPI.getLatestAddedRecipes(16);

        // Petal block extraction -- see also GT extractor version
        for(int i = 0; i < 16; i++) {
            addShapelessRecipe(new ItemStack(ModItems.petal, 9, i), new ItemStack(ModBlocks.petalBlock, 1, i));
        }
        ModCraftingRecipes.recipesPetals = BotaniaAPI.getLatestAddedRecipes(16);

        // floral fertiliser using witchery, and a less burdensome version using T2 planet dust
        addShapelessOreDictRecipe(new ItemStack(ModItems.fertilizer), "itemMutandis", "dustBone"); // MV
        addShapelessOreDictRecipe(new ItemStack(ModItems.fertilizer), "dustVinteum", "dustBone");  // EV
        ModCraftingRecipes.recipeFertilizerPowder = BotaniaAPI.getLatestAddedRecipe(); // book can hold only one

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Dilute pool
        addOreDictRecipe(new ItemStack(ModBlocks.pool, 1, Constants.POOL_META_DILUTE),
                "R R", "RRR",
                'R', new ItemStack(ModFluffBlocks.livingrockSlab)
        );
        ModCraftingRecipes.recipePoolDiluted = BotaniaAPI.getLatestAddedRecipe();

        // Regular pool
        addOreDictRecipe(new ItemStack(ModBlocks.pool, 1, Constants.POOL_META_REGULAR),
                "RIR", "RCR", "RRR",
                'R', new ItemStack(ModFluffBlocks.livingrockSlab),
                'I', "ingotThaumium",
                'C', new ItemStack(Items.cauldron)
        );
        ModCraftingRecipes.recipePool = BotaniaAPI.getLatestAddedRecipe();

        // Fancy pool (same stats as regular)
        addOreDictRecipe(new ItemStack(ModBlocks.pool, 1, Constants.POOL_META_REGULAR_FABULOUS),
                "RIR", "RCR", "RRR",
                'R', new ItemStack(ModFluffBlocks.shimmerrockSlab),
                'I', "ingotThaumium",
                'C', new ItemStack(Items.cauldron)
        );
        ModCraftingRecipes.recipePoolFabulous = BotaniaAPI.getLatestAddedRecipe();

        // There is no elven mana pool in this version?

        // Creative pool
        addOreDictRecipe(new ItemStack(ModBlocks.pool, 1, Constants.POOL_META_CREATIVE),
                "RIR", "RCR", "RRR",
                'R', "plateInfinity",
                'I', LibOreDict.GAIA_INGOT,
                'C', new ItemStack(ModBlocks.pool, 1, Constants.POOL_META_REGULAR_FABULOUS)
        );
        ModCraftingRecipes.recipePoolFabulous = BotaniaAPI.getLatestAddedRecipe();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // regular spreader
        for (int i = 0; i < 16; i++) {
            addOreDictRecipe(new ItemStack(ModBlocks.spreader, 1, Constants.SPREADER_META_REGULAR),
                    "WWW", "WPR", "WWW",
                    'W', new ItemStack(ModFluffBlocks.livingwoodSlab),
                    'P', OreDict.FLOWER_INGREDIENT[i],
                    'R', "ringGold"
            );
        }
        ModCraftingRecipes.recipesSpreader = BotaniaAPI.getLatestAddedRecipes(16);

        // Elven spreader
        for (int i = 0; i < 16; i++) {
            addOreDictRecipe(new ItemStack(ModBlocks.spreader, 1, Constants.SPREADER_META_ALFHEIM),
                    "WWW", "SPR", "WWW",
                    'W', new ItemStack(ModFluffBlocks.dreamwoodSlab),
                    'S', new ItemStack(ModBlocks.spreader, 1, Constants.SPREADER_META_REGULAR),
                    'P', OreDict.FLOWER_INGREDIENT[i],
                    'R', "gemJade"
            );
        }
        ModCraftingRecipes.recipesDreamwoodSpreader = BotaniaAPI.getLatestAddedRecipes(16);

        // gaia spreader
        addOreDictRecipe(new ItemStack(ModBlocks.spreader, 1, Constants.SPREADER_META_GAIA),
                "WWW", "SPR", "WWW",
                'W', new ItemStack(ModFluffBlocks.dreamwoodSlab),
                'S', new ItemStack(ModBlocks.spreader, 1, Constants.SPREADER_META_ALFHEIM),
                'P', LibOreDict.GAIA_INGOT,
                'R', "gemOpal"
        );
        ModCraftingRecipes.recipeUltraSpreader = BotaniaAPI.getLatestAddedRecipe();

        // pulse spreader
        addShapelessOreDictRecipe(new ItemStack(ModBlocks.spreader, 1, Constants.SPREADER_META_PULSE),
                new ItemStack(ModBlocks.spreader, 1, Constants.SPREADER_META_REGULAR),
                LibOreDict.REDSTONE_ROOT,
                new ItemStack(Items.repeater)
        );
        ModCraftingRecipes.recipeRedstoneSpreader = BotaniaAPI.getLatestAddedRecipe();

        // TODO: from recipesSpreader
    }

    private static void addOreDictRecipe(ItemStack output, Object... recipe) {
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(output, recipe));
    }

    private static void addShapelessOreDictRecipe(ItemStack output, Object... recipe) {
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(output, recipe));
    }

    private static void addShapelessRecipe(ItemStack output, ItemStack... recipe) {
        CraftingManager.getInstance().getRecipeList().add(new ShapelessRecipes(output, Arrays.asList(recipe)));
    }
}
