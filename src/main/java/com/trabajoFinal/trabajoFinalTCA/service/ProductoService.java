package com.trabajoFinal.trabajoFinalTCA.service;

import com.trabajoFinal.trabajoFinalTCA.model.Producto;
import com.trabajoFinal.trabajoFinalTCA.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductoService implements IProductoService {
    @Autowired
    private IProductoRepository productoRepository;


    @Override
    public List<Producto> getProductos() {
        List<Producto> listadoProducto = productoRepository.findAll();
        return listadoProducto;
    }

    @Override
    public void saveProducto(Producto producto) {
        productoRepository.save(producto);

    }

    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> findProducto(Long id) {
         return productoRepository.findById(id);

    }

    @Override
    public void editProducto(Producto producto) {
        this.saveProducto(producto);
    }
}
