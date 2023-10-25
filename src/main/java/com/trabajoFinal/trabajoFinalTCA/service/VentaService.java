package com.trabajoFinal.trabajoFinalTCA.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajoFinal.trabajoFinalTCA.model.Venta;
import com.trabajoFinal.trabajoFinalTCA.repository.IVentaRepository;
@Service
public class VentaService implements IVentaService {  // Cambio de IVentaRepository a IVentaService

    @Autowired
    private IVentaRepository ventaRepository;

    @Override
    public List<Venta> getVentas() {
        List<Venta> listadoVentas = ventaRepository.findAll();
        return listadoVentas;
    }

    @Override
    public void saveVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public void deleteVenta(Long id) {
        ventaRepository.deleteById(id);
    }

    @Override
    public List<Venta> findVenta(Long id) {
        // Implementa la lógica para buscar ventas por ID y devuelve una lista
        return null;
    }

    @Override
    public void editVenta(Venta venta) {
        this.saveVenta(venta);
    }



}
