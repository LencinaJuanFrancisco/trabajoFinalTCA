package com.trabajoFinal.trabajoFinalTCA.repository;

import com.trabajoFinal.trabajoFinalTCA.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IVentaRepository extends JpaRepository<Venta,Long> {
}
