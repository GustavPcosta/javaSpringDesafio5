package com.lorem.Travell.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.lorem.Travell.model.Destino;
@Service
public interface DestinoServiceInterface {

		List<Destino> getAllDestino();

		Destino getDestinoById(Long id);

		void deleteDestino(Long id);

		Destino saveDestino(Destino destino);

		Destino updateDestino(Destino destino);

		Destino updateDestino1(Destino destinoAtualizado);
}
