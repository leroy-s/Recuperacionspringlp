package pe.upeu.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.upeu.edu.entity.Carrito;

@Repository
public interface CarritoRepository  extends JpaRepository<Carrito, Long>{

}
