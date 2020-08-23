package net.ludocrypt.nbexpand;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NBESounds {

	public static final SoundEvent MUSIC_BOX = register("nbexpand:note.music_box");
	public static final SoundEvent PIANO = register("nbexpand:note.piano");
	public static final SoundEvent SITAR = register("nbexpand:note.sitar");
	public static final SoundEvent VIBRAPHONE = register("nbexpand:note.vibraphone");

	private static SoundEvent register(String id) {
		return (SoundEvent) Registry.register(Registry.SOUND_EVENT, (String) id, new SoundEvent(new Identifier(id)));
	}
}
