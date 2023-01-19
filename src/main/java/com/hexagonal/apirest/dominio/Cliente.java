/**
 * 
 */
package com.hexagonal.apirest.dominio;

import lombok.Getter;

import java.util.UUID;

import com.hexagonal.apirest.dominio.dtos.ClienteDTO;

/**
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 */

@Getter
public class Cliente {

	private UUID id;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String telefono;
	private String email;

	public Cliente() {

	}

	public Cliente(UUID id, String nombre, String apellido, String identificacion, String telefono, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Cliente name(ClienteDTO clienteDTO) {
		return null;
	}

}
