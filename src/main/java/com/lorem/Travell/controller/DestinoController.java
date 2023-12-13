package com.lorem.Travell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lorem.Travell.model.Destino;
import com.lorem.Travell.service.DestinoServiceInterface;



@Controller
@RequestMapping("/viagens")
public class DestinoController {
	 @Autowired
	    private DestinoServiceInterface destinoService;
	 
	    

	 
	 @PostMapping("/save")
	 public ResponseEntity<String> saveDestino(@RequestBody Destino destino) {
	        try {
	            System.out.println("Recebendo dados do destino: " + destino);
	            Destino savedDestino = destinoService.saveDestino(destino);
	            System.out.println("Destino salvo com sucesso: " + savedDestino);
	            return new ResponseEntity<>("Destino salvo com sucesso", HttpStatus.OK);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return new ResponseEntity<>("Erro ao salvar destino", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 
	 @PutMapping("/update/{id}")
	    public ResponseEntity<String> updateDestino(@PathVariable Long id, @RequestBody Destino destino) {
	        try {
	            destino.setId(id); 
	            System.out.println("Recebendo dados do destino: " + destino);
	            Destino updatedDestino = destinoService.updateDestino1(destino);
	            System.out.println("Destino atualizado com sucesso: " + updatedDestino);
	            return new ResponseEntity<>("Destino atualizado com sucesso", HttpStatus.OK);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return new ResponseEntity<>("Erro ao atualizar destino", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

}
 