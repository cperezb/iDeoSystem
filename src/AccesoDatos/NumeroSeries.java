/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import ideosystem.Main;

/**
 *
 * @author CPerez
 */
public class NumeroSeries {

    private Main ma;

    public NumeroSeries(Main ma) {
        this.ma = ma;
    }

    public void AgregarNroSeries(int idProducto, String nroserie) {
        
        ma.bd.ingreso("insert into numeroseries (idproducto, numeroserie) values(" + idProducto + ", '" + nroserie + "')");
        
    }
}
