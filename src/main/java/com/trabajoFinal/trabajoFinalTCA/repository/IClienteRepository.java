package com.trabajoFinal.trabajoFinalTCA.repository;

import com.trabajoFinal.trabajoFinalTCA.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Long> {
}
