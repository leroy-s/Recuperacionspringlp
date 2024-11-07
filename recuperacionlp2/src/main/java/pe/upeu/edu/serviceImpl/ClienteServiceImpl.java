package pe.upeu.edu.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upeu.edu.entity.Cliente;
import pe.upeu.edu.repository.ClienteRepository;
import pe.upeu.edu.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente create(Cliente c) {
        return clienteRepository.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
        return clienteRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Optional<Cliente> read(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> readAll() {
        return clienteRepository.findAll();
    }
}
