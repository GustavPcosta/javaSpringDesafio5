package com.lorem.Travell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.lorem.Travell.model.Usuario;
import com.lorem.Travell.service.UsuarioServiceInterface;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {
	
	 @Autowired
	   private UsuarioServiceInterface usuarioService;
	
	
	
	
	
	 @PostMapping("/save")
	 public ResponseEntity<String> saveDestino(@RequestBody Usuario usuario) {
	        try {
	            System.out.println("Recebendo dados do Usuário: " + usuario);
	            Usuario savedDestino = usuarioService.saveUsuario(usuario);
	            System.out.println("Usuário salvo com sucesso: " + savedDestino);
	            return new ResponseEntity<>("Usuário salvo com sucesso", HttpStatus.OK);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return new ResponseEntity<>("Erro ao salvar usuário", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 
	 
	 @PutMapping("/update/{id}")
	    public ResponseEntity<String> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
	        try {
	            usuario.setId(id); 
	            System.out.println("Recebendo dados do usuário: " + usuario);
	            Usuario updatedUsuario = usuarioService.updateUsuario1(usuario);
	            System.out.println("Usuário atualizado com sucesso: " + updatedUsuario);
	            return new ResponseEntity<>("Usuário atualizado com sucesso", HttpStatus.OK);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return new ResponseEntity<>("Erro ao atualizar usuário", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 
}
