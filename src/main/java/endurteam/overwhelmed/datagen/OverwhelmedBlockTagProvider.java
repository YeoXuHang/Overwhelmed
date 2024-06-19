package endurteam.overwhelmed.datagen;

import endurteam.overwhelmed.block.OverwhelmedBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class OverwhelmedBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public OverwhelmedBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(OverwhelmedBlocks.PAPER_NEST)
                .add(OverwhelmedBlocks.WILLOW_PLANKS)
                .add(OverwhelmedBlocks.WILLOW_SLAB)
                .add(OverwhelmedBlocks.WILLOW_STAIRS)
                .add(OverwhelmedBlocks.WILLOW_BUTTON)
                .add(OverwhelmedBlocks.WILLOW_PRESSURE_PLATE)
                .add(OverwhelmedBlocks.WILLOW_DOOR)
                .add(OverwhelmedBlocks.WILLOW_TRAPDOOR)
                .add(OverwhelmedBlocks.WILLOW_SIGN)
                .add(OverwhelmedBlocks.WILLOW_WALL_SIGN)
                .add(OverwhelmedBlocks.WILLOW_HANGING_SIGN)
                .add(OverwhelmedBlocks.WILLOW_HANGING_WALL_SIGN);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(OverwhelmedBlocks.SNAIL_SHELL_BRICKS)
                .add(OverwhelmedBlocks.SNAIL_SHELL_BRICK_STAIRS)
                .add(OverwhelmedBlocks.SNAIL_SHELL_BRICK_SLAB)
                .add(OverwhelmedBlocks.SNAIL_SHELL_BRICK_WALL)
                .add(OverwhelmedBlocks.CHISELED_SNAIL_SHELL_BRICKS)
                .add(OverwhelmedBlocks.ALTAIR)
                .add(OverwhelmedBlocks.ALTAIR_STAIRS)
                .add(OverwhelmedBlocks.ALTAIR_SLAB)
                .add(OverwhelmedBlocks.ALTAIR_WALL)
                .add(OverwhelmedBlocks.POLISHED_ALTAIR)
                .add(OverwhelmedBlocks.POLISHED_ALTAIR_STAIRS)
                .add(OverwhelmedBlocks.POLISHED_ALTAIR_SLAB)
                .add(OverwhelmedBlocks.FIZZYROCK)
                .add(OverwhelmedBlocks.FIZZYROCK_STAIRS)
                .add(OverwhelmedBlocks.FIZZYROCK_SLAB)
                .add(OverwhelmedBlocks.FIZZYROCK_WALL)
                .add(OverwhelmedBlocks.CHISELED_FIZZYROCK)
                .add(OverwhelmedBlocks.POLISHED_FIZZYROCK)
                .add(OverwhelmedBlocks.POLISHED_FIZZYROCK_STAIRS)
                .add(OverwhelmedBlocks.POLISHED_FIZZYROCK_SLAB)
                .add(OverwhelmedBlocks.FIZZYROCK_BRICKS)
                .add(OverwhelmedBlocks.FIZZYROCK_BRICK_STAIRS)
                .add(OverwhelmedBlocks.FIZZYROCK_BRICK_SLAB)
                .add(OverwhelmedBlocks.FIZZYROCK_BRICK_WALL)
                .add(OverwhelmedBlocks.CHISELED_FIZZYROCK_BRICKS)
                .add(OverwhelmedBlocks.FIZZYROCK_GEYSER);
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(OverwhelmedBlocks.SOIL)
                .add(OverwhelmedBlocks.CHARCOAL_ORE);
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(OverwhelmedBlocks.FLOFF)
                .add(OverwhelmedBlocks.PAINE)
                .add(OverwhelmedBlocks.PINK_LAVATERA)
                .add(OverwhelmedBlocks.WHITE_LAVATERA)
                .add(OverwhelmedBlocks.SQUIRL)
                .add(OverwhelmedBlocks.RINGOT)
                .add(OverwhelmedBlocks.SNOWDROP)
                .add(OverwhelmedBlocks.BELL_SUNFLOWER);
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(OverwhelmedBlocks.POTTED_FLOFF)
                .add(OverwhelmedBlocks.POTTED_PAINE)
                .add(OverwhelmedBlocks.POTTED_PINK_LAVATERA)
                .add(OverwhelmedBlocks.POTTED_WHITE_LAVATERA)
                .add(OverwhelmedBlocks.POTTED_SQUIRL)
                .add(OverwhelmedBlocks.POTTED_RINGOT)
                .add(OverwhelmedBlocks.POTTED_SNOWDROP)
                .add(OverwhelmedBlocks.POTTED_BELL_SUNFLOWER);
        getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)
                .add(OverwhelmedBlocks.WIDOW)
                .add(OverwhelmedBlocks.WHITE_ALLIUM);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(OverwhelmedBlocks.WILLOW_LOG)
                .add(OverwhelmedBlocks.WILLOW_WOOD)
                .add(OverwhelmedBlocks.STRIPPED_WILLOW_LOG)
                .add(OverwhelmedBlocks.STRIPPED_WILLOW_WOOD);
        getOrCreateTagBuilder(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(OverwhelmedBlocks.WILLOW_LOG);
        getOrCreateTagBuilder(BlockTags.CONVERTABLE_TO_MUD)
                .add(OverwhelmedBlocks.SOIL);
        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(OverwhelmedBlocks.SOIL);
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(OverwhelmedBlocks.WILLOW_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(OverwhelmedBlocks.WILLOW_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(OverwhelmedBlocks.WILLOW_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(OverwhelmedBlocks.WILLOW_WALL_SIGN);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(OverwhelmedBlocks.SNAIL_SHELL_BRICK_WALL)
                .add(OverwhelmedBlocks.ALTAIR_WALL)
                .add(OverwhelmedBlocks.FIZZYROCK_WALL)
                .add(OverwhelmedBlocks.FIZZYROCK_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(OverwhelmedBlocks.GOO_BLOCK);
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(OverwhelmedBlocks.WILLOW_HANGING_WALL_SIGN);

    }
}