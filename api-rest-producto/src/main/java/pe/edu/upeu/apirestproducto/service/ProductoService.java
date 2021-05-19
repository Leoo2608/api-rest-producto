package pe.edu.upeu.apirestproducto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.apirestproducto.entity.Producto;
import pe.edu.upeu.apirestproducto.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	ProductoRepository prorep;
	
	public Producto create(Producto prod) {
		return prorep.save(prod);
	}
	public Producto read(Long id) {
		return prorep.findById(id).get();
	}
	public Producto update(Producto prod) {
		return prorep.save(null);
	}
	public void delete(Long id) {
		prorep.deleteById(id);
	}
	public List<Producto> readAll(){
		List<Producto> lista = new ArrayList<>();
		prorep.findAll().forEach(lista::add);
		return lista;
	}
}
