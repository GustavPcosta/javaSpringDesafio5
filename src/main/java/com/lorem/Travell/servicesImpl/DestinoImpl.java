package com.lorem.Travell.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorem.Travell.model.Destino;
import com.lorem.Travell.repositorio.DestinoRepositorio;
import com.lorem.Travell.service.DestinoServiceInterface;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DestinoImpl implements DestinoServiceInterface{
	@Autowired
    private DestinoRepositorio destinoRepository;
	
	
	@Override
    public List<Destino> getAllDestino() {
        return destinoRepository.findAll();
    }
	
	 @Override
	    public Destino getDestinoById(Long id) {
	        return destinoRepository.findById(id).orElse(null);

	 
	 }
	 
	 
	 public Destino updateDestino(Long id, Destino doadorAtualizado) {
	        Destino destinoExistente = destinoRepository.findById(id).orElse(null);
	        if (destinoExistente != null) {

	            destinoExistente.setNome(doadorAtualizado.getNome());
	            destinoExistente.setEstado(doadorAtualizado.getEstado());
	            destinoExistente.setEmail(doadorAtualizado.getEmail());
	            destinoExistente.setSobrenome(doadorAtualizado.getSobrenome());
	            destinoExistente.setPagamento(doadorAtualizado.getPagamento());
	            destinoExistente.setCep(doadorAtualizado.getCep());
	        

	            return destinoRepository.save(destinoExistente);
	        } else {
	            throw new RuntimeException("Destino com o ID " + id + " não encontrada.");
	        }
	    }
	 
	 
	 public Destino updateDestino1(Long id, Destino doadorAtualizado) {
	        Destino destinoExistente = destinoRepository.findById(id).orElse(null);
	        if (destinoExistente != null) {

	            destinoExistente.setNome(doadorAtualizado.getNome());
	            destinoExistente.setEstado(doadorAtualizado.getEstado());
	            destinoExistente.setEmail(doadorAtualizado.getEmail());
	            destinoExistente.setSobrenome(doadorAtualizado.getSobrenome());
	            destinoExistente.setPagamento(doadorAtualizado.getPagamento());
	            destinoExistente.setCep(doadorAtualizado.getCep());
	        

	            return destinoRepository.save(destinoExistente);
	        } else {
	            throw new RuntimeException("Destino com o ID " + id + " não encontrada.");
	        }
	    }
	 
	 @Override
	    public void deleteDestino(Long id) {
	        destinoRepository.deleteById(id);
	    }
	 
	 @Override
	    public Destino saveDestino(Destino destino) {
	        return destinoRepository.save(destino);
	    }

	@Override
	public Destino updateDestino1(Destino destinoAtualizado) {
		 Long id = destinoAtualizado.getId();
	        Destino usuarioExistente = destinoRepository.findById(id).orElse(null);
	        if (usuarioExistente != null) {
	            usuarioExistente.setNome(destinoAtualizado.getNome());
	            usuarioExistente.setEmail(destinoAtualizado.getEstado());
	            usuarioExistente.setNumero_casa(destinoAtualizado.getNumero_casa());
	            usuarioExistente.setPagamento(destinoAtualizado.getPagamento());

	            return destinoRepository.save(usuarioExistente);
	        } else {
	            throw new RuntimeException("Usuário com o ID " + id + " não encontrado.");
	        }
	    }

	@Override
	public Destino updateDestino(Destino destino) {
		// TODO Auto-generated method stub
		return null;
	}
		
	}



