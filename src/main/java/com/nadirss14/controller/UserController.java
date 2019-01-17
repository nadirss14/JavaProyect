/**
 * 
 */
package com.nadirss14.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nadirss14.model.User;
import com.nadirss14.services.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author acer-pc
 * Clase que representa los recursos del servicio web User
 */
@RestController
@RequestMapping("api/v1/User")
@Api(tags="USER")
public class UserController {
	private final UserService userService;
	
	public UserController(UserService _userService) {
		this.userService=_userService;
	}
	
	@PostMapping
	@ApiOperation(value="Create User",notes="Servicio para la creacion de nuevos User")
	@ApiResponses(value= {@ApiResponse(code=201,message="Usuario creado con exito!"),
						  @ApiResponse(code=400,message="Solicitud Inválida")})
	public ResponseEntity<User>  CreateUser(@RequestBody UserModel model){
		User _user=new User();
		_user.setNameuser(model.getNameuser());
		_user.setPassworduser(model.getPassworduser());
		_user.setCreatedateuser(new Date());
		
		return new ResponseEntity<>(this.userService.create(_user),HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	@ApiOperation(value="Update User",notes="Servicio para la actualizacion de User")
	@ApiResponses(value= {@ApiResponse(code=201,message="Usuario actualizado con exito!"),
			 				@ApiResponse(code=400,message="Solicitud Inválida")})
	public ResponseEntity<User>  UpdateUser(@PathVariable("id") String _idUser,
											UserModel model){
		
		 UUID uid = UUID.fromString(_idUser);   
		User _user= this.userService.findByIdUser(uid);
		if(_user == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		else {
		 _user=new User();
		_user.setNameuser(model.getNameuser());
		_user.setPassworduser(model.getPassworduser());
		_user.setCreatedateuser(model.getCreatedateuser());
		
		return new ResponseEntity<>(this.userService.update(_user),HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value="Delete User",notes="Servicio para la eliminar User")
	@ApiResponses(value= {@ApiResponse(code=201,message="Usuario eliminado con exito!"),
			 				@ApiResponse(code=404,message="Cliente no encontrado")})
	public void RemoveUser(@PathVariable("id") String _idUser) {
		
		 UUID uid = UUID.fromString(_idUser);     
		User _user= this.userService.findByIdUser( uid);
		if(_user != null) {
			this.userService.delete(_user);
		}
	}
	
	@GetMapping
	@ApiOperation(value="Listar User",notes="Servicio para la eliminar User")
	@ApiResponses(value= {@ApiResponse(code=201,message="Usuario eliminado con exito!"),
				@ApiResponse(code=404,message="Cliente no encontrado")})
	public ResponseEntity<List<User>> findAll(){
		return new ResponseEntity<>(this.userService.findAll(),HttpStatus.OK);
	}
}
