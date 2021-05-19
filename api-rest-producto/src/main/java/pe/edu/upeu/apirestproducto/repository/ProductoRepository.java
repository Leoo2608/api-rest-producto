package pe.edu.upeu.apirestproducto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.apirestproducto.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
