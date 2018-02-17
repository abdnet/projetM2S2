package org.uvsq.dao;

import java.util.ArrayList;

import org.uvsq.entities.Album;
import org.uvsq.entities.Artiste;
import org.uvsq.entities.Chanson;

public interface AlbumDao {
	

		public ArrayList<Album> getAll();
		public void addAlbum(Album alb);
		public Album getAlbumById(int idAlbum);
		public ArrayList<Album> getAlbumByTitre(String title);
		public ArrayList<Album> getAlbumByArtiste(Artiste a);
		public ArrayList<Album> getAllByChanson(Chanson ch);
		
		

}
