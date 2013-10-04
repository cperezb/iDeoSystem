package ideosystem;

import AccesoDatos.BaseDatos;
import AccesoDatos.CategoriaDAO;
import AccesoDatos.Compras;
import AccesoDatos.NumeroSeries;
import AccesoDatos.Productos;

import AccesoDatos.Servicios;
import AccesoDatos.Ventas;
import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

    public String usuarioActual = "";
    public BaseDatos bd;
    public Ventas ventas;
    public Productos productos;
    public Compras compras;
    public CategoriaDAO categoria;
    public NumeroSeries nroserie;
    public Servicios servicio;
    //Interfaces

    public Main() {
        bd = new BaseDatos(this, "127.0.0.1", "root", "h4x*mac/");
        compras = new Compras(this);
        ventas = new Ventas(this);
        productos = new Productos(this);
        servicio = new Servicios(this);
        categoria = new CategoriaDAO(this);
        nroserie = new NumeroSeries(this);
       

        //Interfaces
    }

    public static void main(String[] args) {
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel(new SyntheticaSimple2DLookAndFeel());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la ventana", "Error", JOptionPane.ERROR_MESSAGE);
        }

        new Login(new Main());
    }

    public void impresion() {
        // Creamos un Frame para obtener un objeto PrintJob sobre �l
        javax.swing.JFrame f = new javax.swing.JFrame("prueba");

        try {
            f.pack();

            // Se obtiene el objeto PrintJob
            java.awt.PrintJob pjob = f.getToolkit().getPrintJob(f, "PRINT", null);
            // Se obtiene el objeto graphics sobre el que pintar
            Graphics pg = pjob.getGraphics();
            // Se fija el font de caracteres con que se escribe
            pg.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12));
            // Se escribe el mensaje de saludo
//            for (int i = 0; i < tablaUbicacion.getRowCount(); i++) {
//                String texto = tablaUbicacion.getValueAt(i, 0).toString();
            float x = 23;//Float.parseFloat(tablaUbicacion.getValueAt(i, 1).toString());
            float y = 23;//Float.parseFloat(tablaUbicacion.getValueAt(i, 2).toString());
            pg.drawString(" ", (int) (x * 20), (int) (y * 20));
//            }
            // Se finaliza la p�gina
            pg.dispose();
            // Se hace que la impresora termine el trabajo y escupa la p�gina
            pjob.end();
        } catch (Exception ex) {
            System.out.println("problema con impresi�n");
        }

//        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.dispose();
    }
}
