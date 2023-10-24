package com.trabajoFinal.trabajoFinalTCA.service;

import java.util.List;


import com.trabajoFinal.trabajoFinalTCA.model.Venta;

public interface IVentaService {
     public List<Venta> getVentas();

    public void saveVenta(Venta venta);

    public void deleteVenta(Long id);

    public List<Venta> findVenta(Long id);

    public void editVenta(Venta venta);
}
