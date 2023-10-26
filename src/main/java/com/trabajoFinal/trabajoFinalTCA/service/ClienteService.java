package com.trabajoFinal.trabajoFinalTCA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajoFinal.trabajoFinalTCA.model.Cliente;
import com.trabajoFinal.trabajoFinalTCA.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClientes() {
        List<Cliente> listadoCLientes = clienteRepository.findAll();
        return listadoCLientes;
    }

    @Override
    public void saveCliente(Cliente cliente) {
       clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Optional<Cliente> findCliente(Long id) {
       return clienteRepository.findById(id);
    }

    @Override
    public Cliente editCliente(Long id, Cliente cliente) throws Exception {
     Optional<Cliente> buscarCliente = clienteRepository.findById(id);

     if(!buscarCliente.isPresent()){
        throw new Exception("Cliente no encontrado");
     }
    Cliente newCliente = buscarCliente.get();
    
    if (cliente.getNombre() != null) {
        newCliente.setNombre(cliente.getNombre());
    }

    // Actualiza el campo "apellido" si se proporciona en el objeto de entrada
    if (cliente.getApellido() != null) {
        newCliente.setApellido(cliente.getApellido());
    }

    // Actualiza el campo "dni" si se proporciona en el objeto de entrada
    if (cliente.getDni() != null) {
        newCliente.setDni(cliente.getDni());
    }

    clienteRepository.save(newCliente);
    return newCliente;
    }

    
}
