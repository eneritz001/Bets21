package domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	private String emaila;
	@Id
	private String erabiltzaileIzena;
	private String pasahitza;
	private String zNAN;
	private Date jaiotzeData;
	private String nazionalitatea;
	private int tlfZbkia;
	private String ordainketaMetodoa;
	private String erabMota;
	
	
	public User() {
		
	}
	
	public boolean isCorrectPassword(String pass) {
		  
		
		return false;
	}
	
	
}
