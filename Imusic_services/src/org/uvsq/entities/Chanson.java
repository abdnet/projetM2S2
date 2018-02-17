package org.uvsq.entities;


public class Chanson {
	private int idSong;
	private String titleSong;
	private String dureeSong;
	private int idArtist;
	private int idAlbum;
	
	
	public Chanson() {
	}


	public Chanson(int idSong, String titleSong, String dureeSong,
			int idArtist, int idAlbum) {
		this.idSong = idSong;
		this.titleSong = titleSong;
		this.dureeSong = dureeSong;
		this.idArtist = idArtist;
		this.idAlbum = idAlbum;
	}


	public int getIdSong() {
		return idSong;
	}


	public void setIdSong(int idSong) {
		this.idSong = idSong;
	}


	public String getTitleSong() {
		return titleSong;
	}


	public void setTitleSong(String titleSong) {
		this.titleSong = titleSong;
	}


	public String getDureeSong() {
		return dureeSong;
	}


	public void setDureeSong(String dureeSong) {
		this.dureeSong = dureeSong;
	}


	public int getIdArtist() {
		return idArtist;
	}


	public void setIdArtist(int idArtist) {
		this.idArtist = idArtist;
	}


	public int getIdAlbum() {
		return idAlbum;
	}


	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}


	@Override
	public String toString() {
		return "Chanson [idSong=" + idSong + ", titleSong=" + titleSong
				+ ", dureeSong=" + dureeSong + ", idArtist=" + idArtist
				+ ", idAlbum=" + idAlbum + "]";
	}
	
	
	
	
}
