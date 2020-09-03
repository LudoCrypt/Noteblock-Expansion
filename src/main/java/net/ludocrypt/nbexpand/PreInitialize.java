package net.ludocrypt.nbexpand;

import com.chocohead.mm.api.ClassTinkerers;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.MappingResolver;

public interface PreInitialize {

	static void initialize() {
		MappingResolver remapper = FabricLoader.getInstance().getMappingResolver();
		String instrument = remapper.mapClassName("intermediary", "net.minecraft.class_2766");
		String soundEvent = remapper.mapClassName("intermediary", "net.minecraft.class_3414");
		ClassTinkerers.enumBuilder(instrument, String.class, 'L' + soundEvent + ';')
				.addEnum("music_box", () -> new Object[] { "music_box", NBESounds.MUSIC_BOX })
				.addEnum("piano", () -> new Object[] { "piano", NBESounds.PIANO })
				.addEnum("sitar", () -> new Object[] { "sitar", NBESounds.SITAR })
				.addEnum("vibraphone", () -> new Object[] { "vibraphone", NBESounds.VIBRAPHONE })
				.addEnum("bassdrum", () -> new Object[] { "bassdrum", NBESounds.BASSDRUM })
				.addEnum("celesta", () -> new Object[] { "celesta", NBESounds.CELESTA })
				.addEnum("glockenspiel", () -> new Object[] { "glockenspiel", NBESounds.GLOCKENSPIEL })
				.addEnum("harpsichord", () -> new Object[] { "harpsichord", NBESounds.HARPSICHORD })
				.addEnum("highdrum", () -> new Object[] { "highdrum", NBESounds.HIGHDRUM })
				.addEnum("marimba", () -> new Object[] { "marimba", NBESounds.MARIMBA })
				.addEnum("steeldrums", () -> new Object[] { "steeldrums", NBESounds.STEELDRUMS })
				.addEnum("timpani", () -> new Object[] { "timpani", NBESounds.TIMPANI })
				.addEnum("woodblocks", () -> new Object[] { "woodblocks", NBESounds.WOODBLOCKS }).build();
	}
}
