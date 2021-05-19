package pe.edu.upeu.apirestproducto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
}
