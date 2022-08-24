package com.giordan.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giordan.cursomc.domain.Pedido;
import com.giordan.cursomc.repositories.PedidoRepository;
import com.giordan.cursomc.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}
