package org.cuatrovientos.fourparty;

public class Song extends MediaFile{
	
	private String author;
	private String title;
	private int duration;
	
	
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

	public Song(String titulo, String author, int duracion) {
		this.title = titulo;
		this.author = author;
		this.duration = duracion;
	}

	public Song(String titulo, String duracion, String author) {
		this.title = titulo;
		this.author = author;
		this.duration = toSeconds(duracion);
	}
	
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

	@Override
	public String toString() {
		return "Song [author=" + author + ", title=" + title + ", duration=" + duration + "]";
	}
}





