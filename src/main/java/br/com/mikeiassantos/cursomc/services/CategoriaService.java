package br.com.mikeiassantos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mikeiassantos.cursomc.domain.Categoria;
import br.com.mikeiassantos.cursomc.repositories.CategoriaRepository;
import br.com.mikeiassantos.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! "+ id +", Tipo: "+ Categoria.class.getName()));
	}
}
