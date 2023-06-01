package org.cuatrovientos.fourparty;

import java.util.ArrayList;

public class MediaCenter {
	/**
	 * 
	 */
	private ArrayList<Song> playlistSong = new ArrayList<Song>();
	private ArrayList<Film> playlistFilm = new ArrayList<Film>();
	public FileType FILE_TYPE;
	
	/**
	 * 
	 * @param cancion
	 */
	public void new_FILE(Song cancion) {
		playlistSong.add(cancion);
	}
/**
 * 
 * @param titulo
 */
	public void Remo_FILE(String titulo) {
		playlistSong.remove(titulo);
	}
/**
 * 
 * @param titulo
 * @return
 */
	public Song SeARch(String titulo) {
		Song contenido;
		int ubicacion;
		ubicacion = playlistSong.indexOf(titulo);
		contenido = playlistSong.get(ubicacion);
		return contenido;
	}
/**
 * 
 */
	public void Show_ALL() {
		for (int i = 0;i == playlistSong.size();i++) {
		System.out.println(playlistSong.get(i));
		}
	}
	/**
	 * Esto seria todo
	 */
		
}
