package com.trabajoFinal.trabajoFinalTCA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trabajoFinal.trabajoFinalTCA.model.Cliente;
import com.trabajoFinal.trabajoFinalTCA.service.ClienteService;

@RestController
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }

    @PostMapping("/clientes/crear")
    public void saveCliente(@RequestBody Cliente cliente){
        clienteService.saveCliente(cliente);
    }

    @GetMapping("/clientes/{id_cliente}")
    public Optional<Cliente> findCliente(@PathVariable Long id_cliente){
        return clienteService.findCliente(id_cliente);
    }

    @DeleteMapping("/clientes/eliminar/{id_cliente}")
    public void deleteCliente(@PathVariable Long id_cliente){
        clienteService.deleteCliente(id_cliente);
    }
    @PutMapping("/clientes/editar/{id_cliente}")
    public Cliente editCliente(@PathVariable Long id_cliente,
                              @RequestBody Cliente cliente) throws Exception{
        Cliente newCliente = clienteService.editCliente(id_cliente, cliente);
        return newCliente;
    }
}
