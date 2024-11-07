package pe.upeu.edu.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upeu.edu.entity.Factura;
import pe.upeu.edu.repository.FacturaRepository;
import pe.upeu.edu.service.FacturaService;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public Factura create(Factura c) {
        return facturaRepository.save(c);
    }

    @Override
    public Factura update(Factura c) {
        return facturaRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        facturaRepository.deleteById(id);
    }

    @Override
    public Optional<Factura> read(Long id) {
        return facturaRepository.findById(id);
    }

    @Override
    public List<Factura> readAll() {
        return facturaRepository.findAll();
    }
}
