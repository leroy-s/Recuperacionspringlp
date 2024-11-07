package pe.upeu.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.upeu.edu.entity.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long>{

}
