package com.lorem.Travell.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lorem.Travell.model.Destino;


@Repository
public interface DestinoRepositorio extends JpaRepository<Destino,Long>{

}
