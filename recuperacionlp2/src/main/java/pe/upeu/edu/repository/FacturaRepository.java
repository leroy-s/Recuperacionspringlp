package pe.upeu.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.upeu.edu.entity.Factura;

@Repository
public interface FacturaRepository  extends JpaRepository<Factura, Long>{

}
