package com.lorem.Travell.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorem.Travell.model.Usuario;
import com.lorem.Travell.repositorio.UsuarioRepositorio;

import com.lorem.Travell.service.UsuarioServiceInterface;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioImpl implements UsuarioServiceInterface {

    @Autowired
    private UsuarioRepositorio usuarioRepository;

    @Override
    public List<Usuario> getAllUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario updateUsuario(Long id, Usuario usuarioAtualizado) {
        Usuario usuarioExistente = usuarioRepository.findById(id).orElse(null);
        if (usuarioExistente != null) {
            usuarioExistente.setNome(usuarioAtualizado.getNome());
            usuarioExistente.setEmail(usuarioAtualizado.getEmail());
            usuarioExistente.setSenha(usuarioAtualizado.getSenha());
            usuarioExistente.setDataCadastro(usuarioAtualizado.getDataCadastro());

            return usuarioRepository.save(usuarioExistente);
        } else {
            throw new RuntimeException("Usuário com o ID " + id + " não encontrado.");
        }
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario1(Usuario usuarioAtualizado) {
        Long id = usuarioAtualizado.getId();
        Usuario usuarioExistente = usuarioRepository.findById(id).orElse(null);
        if (usuarioExistente != null) {
            usuarioExistente.setNome(usuarioAtualizado.getNome());
            usuarioExistente.setEmail(usuarioAtualizado.getEmail());
            usuarioExistente.setSenha(usuarioAtualizado.getSenha());
            usuarioExistente.setDataCadastro(usuarioAtualizado.getDataCadastro());

            return usuarioRepository.save(usuarioExistente);
        } else {
            throw new RuntimeException("Usuário com o ID " + id + " não encontrado.");
        }
    }

	@Override
	public Usuario updateUsuario2(Long id, Usuario doadorAtualizado) {
		
		return null;
	}
}
