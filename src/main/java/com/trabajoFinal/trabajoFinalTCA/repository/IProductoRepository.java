package com.trabajoFinal.trabajoFinalTCA.repository;

import com.trabajoFinal.trabajoFinalTCA.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Long> {

}
