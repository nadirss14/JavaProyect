/**
 * 
 */
package com.nadirss14.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/
import org.springframework.stereotype.Repository;

import com.nadirss14.model.User;

/**
 * @author acer-pc
 * Interfaz para la implementacion de las operaciones sobre la tabla User
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	/*@Query("select u from User where u.createdateuser >=:fechaIni and  u.createdateuser <=:fechaFin")
	public List<User> find(@Param("fechaIni") Date fechaIni,@Param("fechaFin") Date fechaFin);*/
	public List<User> findBycreatedateuser(Date _createDate);
	public User findByIduser(UUID _idUser);

	
}
