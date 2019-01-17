/**
 * 
 */
package com.nadirss14.services;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nadirss14.model.User;
import com.nadirss14.repository.UserRepository;

/**
 * @author acer-pc
 * Clase utilizada para la definicion de los servicios de los User
 */
@Service
@Transactional(readOnly=true)
public class UserService {
	private final UserRepository userRepository;
	
	public UserService (UserRepository _userRepository) {
		this.userRepository=_userRepository;
	}
	/**
	 * 
	 * @param _user
	 * @return
	 */
	@Transactional
	public User create(User _user) {
		return this.userRepository.save(_user);
	}
	/**
	 * 
	 * @param _user
	 * @return
	 */
	@Transactional
	public User update(User _user) {
		return this.userRepository.save(_user);
	}
	/**
	 * 
	 * @param _user
	 */
	@Transactional
	public void delete(User _user) {
		this.userRepository.delete(_user);
	}
	/**
	 * 
	 * @param _createDate
	 * @return
	 */
	public List<User> findBycreatedate(Date _createDate){
		return this.userRepository.findBycreatedateuser(_createDate);
	}
	
	/**
	 * 
	 * @param _iduser
	 * @return
	 */
	public User findByIdUser(UUID _idUser) {
		return this.userRepository.findByIduser(_idUser);
	}
	
	public List<User> findAll(){
		return this.userRepository.findAll();
	}
	
}