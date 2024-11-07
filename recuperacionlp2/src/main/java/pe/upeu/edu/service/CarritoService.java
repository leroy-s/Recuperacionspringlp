package pe.upeu.edu.service;

import java.util.List;
import java.util.Optional;

import pe.upeu.edu.entity.Carrito;


public interface CarritoService {
	Carrito create(Carrito c);
	Carrito update(Carrito c);
	void delete(Long id);
	Optional<Carrito> read(Long id);
	List<Carrito> readAll();
}
