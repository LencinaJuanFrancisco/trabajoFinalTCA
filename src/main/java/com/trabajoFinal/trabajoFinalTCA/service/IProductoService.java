package com.trabajoFinal.trabajoFinalTCA.service;

import com.trabajoFinal.trabajoFinalTCA.model.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<Producto> getProductos();

    public void saveProducto(Producto producto);

    public void deleteProducto(Long id);

    public Optional<Producto> findProducto(Long id);

    public void editProducto(Producto producto);
}
