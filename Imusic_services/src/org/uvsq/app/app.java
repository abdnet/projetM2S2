package org.uvsq.app;

import java.sql.SQLException;

import org.uvsq.daoImpl.ArtisteDaoImpl;
import org.uvsq.entities.Artiste;

public class app {

	public app() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SQLException {
		ArtisteDaoImpl imp= new ArtisteDaoImpl();
		imp.addArtiste(new Artiste("abdel","titoo","gender","dsds"));
		System.out.println(imp.getArtisteById(imp.getLastInsertId()));
		System.out.println(imp.getArtisteByName("abdel").size());
	}

}
