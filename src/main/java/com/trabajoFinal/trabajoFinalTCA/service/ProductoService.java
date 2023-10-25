package com.trabajoFinal.trabajoFinalTCA.service;

import com.trabajoFinal.trabajoFinalTCA.model.Producto;
import com.trabajoFinal.trabajoFinalTCA.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
    public Optional<Producto> findProducto(Long id) {
         return productoRepository.findById(id);

    }

    @Override
    public Producto editProducto(Producto producto,Long id) throws Exception {

        Optional<Producto> buscarProducto = productoRepository.findById(id);
        
        if (!buscarProducto.isPresent()) {
          
            throw new Exception("Producto no encontrado");
        }
        
        Producto newProducto = buscarProducto.get();

        newProducto.setNombre(producto.getNombre());
        newProducto.setMarca(producto.getMarca());
        newProducto.setCosto(producto.getCosto());
        newProducto.setCantidad_disponible(producto.getCantidad_disponible());

        productoRepository.save(newProducto);
        
        return newProducto;
    }

   
}
