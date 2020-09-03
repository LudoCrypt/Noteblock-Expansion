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
			ci.setReturnValue(Instrument.valueOf("sitar"));
		} else if (state.isIn(BlockTags.PLANKS)) {
			ci.setReturnValue(Instrument.valueOf("piano"));
		} else if (state.isOf(Blocks.DIAMOND_BLOCK)) {
			ci.setReturnValue(Instrument.valueOf("music_box"));
		} else if (state.isOf(Blocks.BLUE_ICE)) {
			ci.setReturnValue(Instrument.valueOf("vibraphone"));
		} else if (state.isOf(Blocks.BARREL)) {
			ci.setReturnValue(Instrument.valueOf("timpani"));
		} else if (state.isOf(Blocks.LOOM)) {
			ci.setReturnValue(Instrument.valueOf("harpsichord"));
		} else if (state.isIn(BlockTags.LOGS)) {
			ci.setReturnValue(Instrument.valueOf("marimba"));
		} else if (state.isOf(Blocks.IRON_ORE)) {
			ci.setReturnValue(Instrument.valueOf("glockenspiel"));
		} else if (state.isOf(Blocks.GOLD_ORE)) {
			ci.setReturnValue(Instrument.valueOf("celesta"));
		} else if (state.isOf(Blocks.DIRT)) {
			ci.setReturnValue(Instrument.valueOf("steeldrums"));
		} else if (state.isIn(BlockTags.WOODEN_TRAPDOORS)) {
			ci.setReturnValue(Instrument.valueOf("woodblocks"));
		} else if (state.isOf(Blocks.CHEST)) {
			ci.setReturnValue(Instrument.valueOf("bassdrum"));
		} else if (state.isOf(Blocks.TRAPPED_CHEST)) {
			ci.setReturnValue(Instrument.valueOf("highdrum"));
		}
	}

}
