package co.edu.iudigital.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "casos")
public class Caso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8169358650902209853L;

	//id INT NOT NULL AUTO_INCREMENT,
	
	
	//fecha_hora DATETIME NULL DEFAULT now(),
	
	
	//latitud FLOAT NULL,
	
	
	//longitud FLOAT NULL,
	
	
	//altitud FLOAT NULL,
	
	
	//visible TINYINT NULL DEFAULT 1,
	
	
	//descripcion VARCHAR(250) NULL,
	
	
	//url_map TEXT NULL,
	
	
	//rmi_url TEXT NULL,
	
	
	//usuarios_id INT NOT NULL,
	
	
	//delitos_id INT NOT NULL,
	
	
	
}
