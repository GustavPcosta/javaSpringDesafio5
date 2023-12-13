package com.lorem.Travell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.lorem.Travell.model.Destino;
import com.lorem.Travell.service.DestinoServiceInterface;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
@RequestMapping("/viagens")
@CrossOrigin(origins = "http://localhost:3000")
public class DestinoController {
	
	 @Autowired
	   private DestinoServiceInterface destinoService;
	
	
	
	
	
	 @PostMapping("/save")
	 public ResponseEntity<String> saveDestino(@RequestBody Destino destino) {
	        try {
	            System.out.println("Recebendo dados do Destino: " + destino);
	            Destino savedDestino = destinoService.saveDestino(destino);
	            System.out.println("Destino salvo com sucesso: " + savedDestino);
	            return new ResponseEntity<>("Destino salvo com sucesso", HttpStatus.OK);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return new ResponseEntity<>("Erro ao salvar destino", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 
	 
	 @PutMapping("/update/{id}")
	    public ResponseEntity<String> updateUsuario(@PathVariable Long id, @RequestBody Destino destino) {
	        try {
	            destino.setId(id); 
	            System.out.println("Recebendo dados do usuário: " + destino);
	            Destino updatedDestino = destinoService.updateDestino1(destino);
	            System.out.println("Usuário atualizado com sucesso: " + updatedDestino);
	            return new ResponseEntity<>("Usuário atualizado com sucesso", HttpStatus.OK);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return new ResponseEntity<>("Erro ao atualizar usuário", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 
}
 