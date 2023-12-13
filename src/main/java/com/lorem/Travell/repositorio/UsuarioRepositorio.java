package com.lorem.Travell.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lorem.Travell.model.Usuario;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

}
