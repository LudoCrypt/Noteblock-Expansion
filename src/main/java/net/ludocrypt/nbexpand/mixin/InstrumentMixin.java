package net.ludocrypt.nbexpand.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.Instrument;
import net.minecraft.tag.BlockTags;

@Mixin(Instrument.class)
public class InstrumentMixin {

	@Inject(method = "fromBlockState", at = @At("HEAD"), cancellable = true)
	private static void fromBlockState(BlockState state, CallbackInfoReturnable<Instrument> ci) {
		if (state.isOf(Blocks.SANDSTONE) || state.isOf(Blocks.RED_SANDSTONE)) {
			ci.setReturnValue(Instrument.valueOf("SITAR"));
		} else if (state.isIn(BlockTags.PLANKS)) {
			ci.setReturnValue(Instrument.valueOf("PIANO"));
		} else if (state.isOf(Blocks.DIAMOND_BLOCK)) {
			ci.setReturnValue(Instrument.valueOf("MUSIC_BOX"));
		} else if (state.isOf(Blocks.BLUE_ICE)) {
			ci.setReturnValue(Instrument.valueOf("VIBRAPHONE"));
		} else if (state.isOf(Blocks.BARREL)) {
			ci.setReturnValue(Instrument.valueOf("TIMPANI"));
		} else if (state.isOf(Blocks.LOOM)) {
			ci.setReturnValue(Instrument.valueOf("HARPSICHORD"));
		} else if (state.isIn(BlockTags.LOGS)) {
			ci.setReturnValue(Instrument.valueOf("MARIMBA"));
		} else if (state.isOf(Blocks.IRON_ORE)) {
			ci.setReturnValue(Instrument.valueOf("GLOCKENSPIEL"));
		} else if (state.isOf(Blocks.GOLD_ORE)) {
			ci.setReturnValue(Instrument.valueOf("CELESTA"));
		} else if (state.isOf(Blocks.DIRT)) {
			ci.setReturnValue(Instrument.valueOf("STEELDRUMS"));
		} else if (state.isIn(BlockTags.WOODEN_TRAPDOORS)) {
			ci.setReturnValue(Instrument.valueOf("WOODBLOCKS"));
		} else if (state.isOf(Blocks.CHEST)) {
			ci.setReturnValue(Instrument.valueOf("BASSDRUM"));
		} else if (state.isOf(Blocks.TRAPPED_CHEST)) {
			ci.setReturnValue(Instrument.valueOf("HIGHDRUM"));
		} else if (state.isOf(Blocks.END_STONE)) {
			ci.setReturnValue(Instrument.valueOf("CHINESE_PIK"));
		} else if (state.isOf(Blocks.OBSIDIAN)) {
			ci.setReturnValue(Instrument.valueOf("PLUCK"));
		}
	}

}
