/**
 * 
 */
package com.nadirss14.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadirss14.model.Perfil;
import com.nadirss14.model.User;

/**
 * @author acer-pc
 * Interfaz para la implementacion de las operaciones sobre la tabla Perfil
 */
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

	public List<Perfil> findByname(String _name);
	public Perfil findByemail(String _email);
	public List<Perfil> findBybirthdate(Date _birthDate);
	public Perfil findByuser(User _user);
}
