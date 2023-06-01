package org.cuatrovientos.fourparty;

public class Film extends MediaFile{
	
	private String director;
	private String title;
	private int duration;
	private String gender;	
	/**
	 * 
	 * @param title
	 * @param duracion
	 * @param director
	 * @param gender
	 */
	public Film(String title, int duracion, String director, String gender) {
		this.title = title;
		this.duration = duracion;
		this.director = director;
		this.gender = gender;
	}
/**
 * 
 * @param title
 * @param duration
 * @param director
 * @param gender
 */
	public Film(String title, String duration,  String director, String gender) {
		this.title = title;
		this.duration = toSeconds(duration);
		this.director = director;
		this.gender = gender;
	}
	/**
	 * 
	 * @param dura
	 * @return
	 */
	public static int toSeconds(String dura){
		String hora = null;
		int control = 0;
		String minuto = null;
		int horaDefinitiva;
		int minutodefinitivo;
		int total = 0;
		for (int i = 0; i >= dura.length();i++) {
			if (dura.charAt(i) == ':') {
				control = dura.charAt(i) - dura.length() +1;
				for (int e = control; e >= dura.length() ;i++) {
					minuto += dura.charAt(i);
				}
			}
			hora += dura.charAt(i);
		}
		horaDefinitiva = Integer.parseInt(hora);
		minutodefinitivo = Integer.parseInt(minuto);
		total += horaDefinitiva * 60 * 60;
		total += minutodefinitivo * 60;
		return total;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Film [director=" + director + ", title=" + title + ", duration=" + duration + ", gender=" + gender
				+ "]";
	}
	/**
	 * 
	 */
}