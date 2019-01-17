package com.nadirss14.controller;


import java.util.Date;

import lombok.Data;

/**
 *@author nadir.soza
 *clase que representa la tabla de perfil
 * */
@Data
public class PerfilModel  {

	private int idperfil;
	private String name;
	private String lastname;
	private Date birthdate;
	private String email;
	private String nationality;
	private String profesion;
	private String website;


}
