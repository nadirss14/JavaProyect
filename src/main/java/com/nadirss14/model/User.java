package com.nadirss14.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author nadir.soza
 *clase que representa la tabla de usuarios
 */
@Data
@Entity
@Table(name="user" ,schema="public")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid2")
	private UUID iduser;
	private String nameuser;
	private String passworduser;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdateuser;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastloginuser;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	/*public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = new UUID(0, 0).toString(); 
	}*/
}
