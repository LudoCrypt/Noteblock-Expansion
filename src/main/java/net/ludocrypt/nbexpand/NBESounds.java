package net.ludocrypt.nbexpand;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NBESounds {

	public static final SoundEvent MUSIC_BOX = register("nbexpand:note.music_box");
	public static final SoundEvent PIANO = register("nbexpand:note.piano");
	public static final SoundEvent SITAR = register("nbexpand:note.sitar");
	public static final SoundEvent VIBRAPHONE = register("nbexpand:note.vibraphone");
	public static final SoundEvent BASSDRUM = register("nbexpand:note.bassdrum");
	public static final SoundEvent CELESTA = register("nbexpand:note.celesta");
	public static final SoundEvent GLOCKENSPIEL = register("nbexpand:note.glockenspiel");
	public static final SoundEvent HARPSICHORD = register("nbexpand:note.harpsichord");
	public static final SoundEvent HIGHDRUM = register("nbexpand:note.highdrum");
	public static final SoundEvent MARIMBA = register("nbexpand:note.marimba");
	public static final SoundEvent STEELDRUMS = register("nbexpand:note.steeldrums");
	public static final SoundEvent TIMPANI = register("nbexpand:note.timpani");
	public static final SoundEvent WOODBLOCKS = register("nbexpand:note.woodblocks");

	private static SoundEvent register(String id) {
		return (SoundEvent) Registry.register(Registry.SOUND_EVENT, (String) id, new SoundEvent(new Identifier(id)));
	}
}
