package pe.edu.upeu.apirestproducto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.apirestproducto.entity.Producto;
import pe.edu.upeu.apirestproducto.service.ProductoService;

@RestController
public class ProductoController {
	@Autowired
	ProductoService prodservice;
	@GetMapping("/")
	public String mensaje() {
		return "JPA";
	}
	@GetMapping("/prod")
	public List<Producto> readAll(){
		return prodservice.readAll();
	}
	@GetMapping("/prod/{id}")
	public Producto read(@PathVariable Long id) {
		return prodservice.read(id);
	}
	@DeleteMapping("/prod/delete/{id}")
	public String delete(@PathVariable Long id) {
		prodservice.delete(id);
		return "Eliminado";
	}
	@PostMapping("/prod/add")
	public Producto save(@RequestBody Producto prod) {
		return prodservice.create(prod);
	}
	@PutMapping("/prod/update/{id}")
	public Producto update(@PathVariable Long id, @RequestBody Producto prod) {	
		Producto p = new Producto();
		p.setIdproducto(id);
		p.setNomprod(prod.getNomprod());
		p.setStock(prod.getStock());
		p.setPrecio(prod.getPrecio());
		return prodservice.update(p);
	}
}
