package com.trabajoFinal.trabajoFinalTCA.service;

import java.util.List;
import java.util.Optional;

import com.trabajoFinal.trabajoFinalTCA.model.Cliente;

public interface IClienteService {

    public List<Cliente> getClientes();

    public void saveCliente(Cliente cliente);

    public void deleteCliente(Long id);

    public Optional<Cliente> findCliente(Long id);

    public Cliente editCliente(Long id,Cliente cliente) throws Exception;
    
    

}
