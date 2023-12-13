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
public class DestinoImpl implements DestinoServiceInterface {

    @Autowired
    private DestinoRepositorio destinoRepository;

    @Override
    public List<Destino> getAllDestino() {
        return destinoRepository.findAll();
    }

    @Override
    public Destino getUsuarioById(Long id) {
        return destinoRepository.findById(id).orElse(null);
    }

    public Destino updateDestino(Long id, Destino destinoAtualizado) {
        Destino destinoExistente = destinoRepository.findById(id).orElse(null);
        if (destinoExistente != null) {
            destinoExistente.setNome(destinoAtualizado.getNome());
            destinoExistente.setEmail(destinoAtualizado.getEmail());
            destinoExistente.setPagamento(destinoAtualizado.getPagamento());
            destinoExistente.setNumero_casa(destinoAtualizado.getNumero_casa());
            destinoExistente.setSobrenome(destinoAtualizado.getSobrenome());
            destinoExistente.setEstado(destinoAtualizado.getEstado());
            destinoExistente.setCep(destinoAtualizado.getCep());
            return destinoRepository.save(destinoExistente);
        } else {
            throw new RuntimeException("Usuário com o ID " + id + " não encontrado.");
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
        Destino destinoExistente =destinoRepository.findById(id).orElse(null);
        if (destinoExistente != null) {
            destinoExistente.setNome(destinoAtualizado.getNome());
            destinoExistente.setEmail(destinoAtualizado.getEmail());
            destinoExistente.setPagamento(destinoAtualizado.getPagamento());
            destinoExistente.setNumero_casa(destinoAtualizado.getNumero_casa());
            destinoExistente.setSobrenome(destinoAtualizado.getSobrenome());
            destinoExistente.setEstado(destinoAtualizado.getEstado());
            destinoExistente.setCep(destinoAtualizado.getCep());
            return destinoRepository.save(destinoExistente);
        } else {
            throw new RuntimeException("Usuário com o ID " + id + " não encontrado.");
        }
    }

	public Destino updateDestino2(Long id, Destino destinoAtualizado) {
		
		return null;
	}
}
