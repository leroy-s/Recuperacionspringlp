package pe.upeu.edu.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upeu.edu.entity.Carrito;
import pe.upeu.edu.repository.CarritoRepository;
import pe.upeu.edu.service.CarritoService;

@Service
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    @Override
    public Carrito create(Carrito c) {
        return carritoRepository.save(c);
    }

    @Override
    public Carrito update(Carrito c) {
        return carritoRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        carritoRepository.deleteById(id);
    }

    @Override
    public Optional<Carrito> read(Long id) {
        return carritoRepository.findById(id);
    }

    @Override
    public List<Carrito> readAll() {
        return carritoRepository.findAll();
    }
}
