package com.nadirss14.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 *@author nadir.soza
 *clase que representa la tabla de perfil
 * */
@Data
@Entity
@Table(name="perfil")
public class Perfil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="profile_seq")
	@SequenceGenerator(name="profile_seq",sequenceName="profile_idprofile_seq",allocationSize=1)
	private int idperfil;
	private String name;
	private String lastname;
	@Temporal(TemporalType.DATE)
	private Date birthdate;
	private String email;
	private String nationality;
	private String profesion;
	private String website;
	@OneToOne @MapsId
	private User user;
	
	public Perfil() {
		// TODO Auto-generated constructor stub
	}

}
