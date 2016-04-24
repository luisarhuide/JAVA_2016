/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Alumno
 */
public class VentaService {

    public double getTotal(double precio, int cant) {
        return (precio * cant);
    }

    public double getImporte(double precio, int cant) {
        return getTotal(precio, cant) / 1.18;
    }

    public double getImpuesto(double precio, int cant) {
        return getTotal(precio, cant) - getImporte(precio, cant);
    }
}
