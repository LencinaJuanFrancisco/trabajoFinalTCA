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

import com.trabajoFinal.trabajoFinalTCA.model.Producto;
import com.trabajoFinal.trabajoFinalTCA.service.ProductoService;

@RestController
public class ProductoController {

    @Autowired
    ProductoService productoServicio;

    @GetMapping("/productos")
    public List<Producto> getProductos() {
        return productoServicio.getProductos();
    }

    @PostMapping("/productos/crear")
    public void saveProducto(@RequestBody Producto producto) {
        productoServicio.saveProducto(producto);
    }

    @GetMapping("/productos/{codigo_producto}")
    public Optional<Producto> findProducto(@PathVariable Long codigo_producto) {
        return productoServicio.findProducto(codigo_producto);
    }

    @DeleteMapping("/productos/eliminar/{codigo_producto}")
    public void deleteProducto(@PathVariable Long codigo_producto) {
        productoServicio.deleteProducto(codigo_producto);
    }

    @PutMapping("/productos/editar/{codigo_producto}")
    public Producto editProducto(@PathVariable Long codigo_producto,
            @RequestBody Producto producto) throws Exception {

        Producto newProducto = productoServicio.editProducto(producto, codigo_producto);

        return newProducto;
    }

}
