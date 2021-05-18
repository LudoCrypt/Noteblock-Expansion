package net.ludocrypt.nbexpand;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class NoteblockExpansion implements ModInitializer {

	@Override
	public void onInitialize() {
		NoteblockSounds.init();
	}

	public static Identifier id(String id) {
		return new Identifier("nbexpand", id);
	}

}
