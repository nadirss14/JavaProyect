/**
 * 
 */
package com.nadirss14.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nadirss14.model.Perfil;
import com.nadirss14.model.User;
import com.nadirss14.repository.PerfilRepository;

/**
 * @author acer-pc
 *
 */
@Service
@Transactional(readOnly=true)
public class PerfilServices {
	private final PerfilRepository perfilRepository;
	
	public PerfilServices(PerfilRepository _perfilRepository) {
		this.perfilRepository=_perfilRepository;
	}

	/**
	 * 
	 * @param _perfil
	 * @return
	 */
	@Transactional
	public Perfil create(Perfil _perfil) {
		return this.perfilRepository.save(_perfil);
	}
	/**
	 * 
	 * @param _perfil
	 * @return
	 */
	@Transactional
	public Perfil update(Perfil _perfil) {
		return this.perfilRepository.save(_perfil);
	}
	/**
	 * 
	 * @param _perfil
	 */
	@Transactional
	public void delete(Perfil _perfil) {
		this.perfilRepository.delete(_perfil); 
	}
	/**
	 * 
	 * @param _name
	 * @return
	 */
	public List<Perfil> findByname(String _name){
		return this.perfilRepository.findByname(_name);
	}
	/**
	 * 
	 * @param _email
	 * @return
	 */
	public Perfil findByemail(String _email) {
		return this.perfilRepository.findByemail(_email);
	}
	/**
	 * 
	 * @param _birthDate
	 * @return
	 */
	public List<Perfil> findBybirthdate(Date _birthDate){
		return this.perfilRepository.findBybirthdate(_birthDate);
	}
	/**
	 * 
	 * @param _user
	 * @return
	 */
	public Perfil findByuser(User _user) {
		return this.perfilRepository.findByuser(_user);
	}
	

}
