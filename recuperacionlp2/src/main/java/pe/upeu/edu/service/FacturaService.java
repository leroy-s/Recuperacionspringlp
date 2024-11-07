package pe.upeu.edu.service;

import java.util.List;
import java.util.Optional;

import pe.upeu.edu.entity.Factura;


public interface FacturaService {
	Factura create(Factura c);
	Factura update(Factura c);
	void delete(Long id);
	Optional<Factura> read(Long id);
	List<Factura> readAll();
}
