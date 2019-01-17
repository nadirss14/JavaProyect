package com.nadirss14.controller;

import java.util.Date;

import lombok.Data;

/**
 * @author nadir.soza
 *clase utilizada para el transporte de los datos hacia afuera del servicio web
 */
@Data
public class UserModel  {	
	
	private String iduser;
	private String nameuser;
	private String passworduser;
	private Date createdateuser;
	private Date lastloginuser;
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}
}
