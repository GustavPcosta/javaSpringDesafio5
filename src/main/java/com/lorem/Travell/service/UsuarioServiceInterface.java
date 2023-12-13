package com.lorem.Travell.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.lorem.Travell.model.Usuario;
@Service
public interface UsuarioServiceInterface {
	List<Usuario> getAllUsuario();
	//Usuario updateUsuario(Long id, Usuario usuarioAtualizado);
	void deleteUsuario(Long id);
	Usuario saveUsuario(Usuario usuario);
	Usuario getUsuarioById(Long id);
	
	Usuario updateUsuario1(Usuario usuario);
	//Usuario updateUsuario2(Usuario usuario);
	Usuario updateUsuario2(Long id, Usuario doadorAtualizado);
	

	
	
}
