package org.uvsq.database;

public interface DataBase {
	  static final String DB_USER="root"; 
	  static final String DB_PWD="root"; 
	  static final String DB_NAME="music"; 
	  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	  static final String DB_URL = "jdbc:mysql://localhost/"+DB_NAME;
	  
	  /*Requetes usuelles */
	  
	  //Chanson
	  static final String DB_GET_BY_ID_CHANSON = "select * from chanson where id=?";
	  static final String DB_DELETE_BY_ID_CHANSON="Delete from chanson where id=?";
	  static final String DB_GET_ALL_CHANSON="select * from chanson";
	  static final String DB_DELETE_ALL_CHANSON="Delete from chanson";
	  
	  //Artiste
	  
	  static final String DB_GET_BY_ID_ARTISTE = "select * from artiste where id=?";
	  static final String DB_GET_BY_NAME_ARTISTE = "select * from artiste where nom=?";

	  static final String DB_DELETE_BY_ID_ARTISTE="Delete from artiste where id=?";
	  static final String DB_GET_ALL_ARTISTE="select * from artiste";
	  static final String DB_DELETE_ALL_ARTISTE="Delete from artiste";
	  
	  //Album
	  static final String DB_GET_BY_ID_ALBUM = "select * from album where id=?";
	  static final String DB_DELETE_BY_ID_ALBUM="Delete from album where id=?";
	  static final String DB_GET_ALL_ALBUM="select * from album";
	  static final String DB_DELETE_ALL_ALBUM="Delete from album";
	  
	  /*Requetes avec jointure */
	  
	  /*Les insertions */
	  static final String DB_ADD_ONE_ALBUM ="INSERT INTO `album` (`title`, `artiste`, `format`, `piste`, `date`, `label`, `pays`, `langue`) VALUES (?,?,?,?,?,?,?,?)";
	  static final String DB_ADD_ONE_ARTISTE ="INSERT INTO `artiste` (`nom`, `disambiguation`, `gender`,`area`) VALUES (?,?,?,?)";
	  
}
