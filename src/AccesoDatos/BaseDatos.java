/*
 * BaseDatos.java
 *
 * Created on 6 de junio de 2011, 11:40 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AccesoDatos;

import ideosystem.Main;
import ideosystem.MiModelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manuel
 */
public class BaseDatos {
    protected Connection con;
    private ResultSet rs;
    private Statement st;
    private JTable tabla;
    private MiModelo mm;
    private String sentencia;
    private Main ma;
    private String nomBase;
    private String ip;
    private String usuario;
    private String contraseña;
    
    @SuppressWarnings("SillyAssignment")
    public BaseDatos(Main ma, String ip, String usuario, String contraseña) {
        this.ma = ma;
        nomBase = "ideosystem";
        this.ip = ip;
        this.usuario = usuario;
        this.contraseña = contraseña;
        abrir();
    }
    
    public void abrir(){
        try{
            // Cñdigo para la concexiñn con ODBC y ACCESS
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            String url = "jdbc:odbc:"+nomBase; bdmarket
//            con = DriverManager.getConnection(url,"root","2a17e6");
            
            // Cñdio para la conexiñn con el driver de MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+ip+"/"+nomBase;
            con = DriverManager.getConnection(url,usuario,contraseña);   
        }
        catch(Exception ex){
            //JOptionPane.showMessageDialog(ma.vContenedora, "Error al abrir la base de datos\n"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sentencia(String sent){ // funciona solamente para hacer consultas
        try{
            sentencia = sent;
            st = con.createStatement();
            rs = st.executeQuery(sentencia);

            DefaultTableModel modelo = new DefaultTableModel();
            tabla = new JTable(modelo);
            mm = new MiModelo();

            //para crear columnas
            //modelo.addColumn("nombre");

            ResultSetMetaData metadato = rs.getMetaData();
            //el metadata contiene toda la informacion sobre los campos del resultset

            int numColumnas = metadato.getColumnCount();
            Object etiquetas[] = new Object[numColumnas];

            for(int i = 0; i<numColumnas; i++){
                etiquetas[i] = metadato.getColumnLabel(i+1);
            }
            modelo.setColumnIdentifiers(etiquetas);
            mm.setColumnIdentifiers(etiquetas);

            while(rs.next()){
                Object obj []= new Object[numColumnas];
                for(int i = 0; i<numColumnas; i++){
                    obj[i] = rs.getObject(i+1);
                }
                modelo.addRow(obj);
                mm.addRow(obj);
            }
        }
        catch(Exception ex){
//            JOptionPane.showMessageDialog(ma.vContenedora, "Error en la sentencia sql\n"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            try{
                st = con.createStatement();
                st.execute("insert into errores(error) values('"+sent+"')");
                cerrarBase();
            }
            catch(Exception e){}
        }
    }
    
    public void ingreso(String sent){ // funciona parar hacer modificaciones
        try{
            st = con.createStatement();
            st.execute(sent);
        }
        catch(Exception ex){
//            JOptionPane.showMessageDialog(ma.vContenedora, "Error en la sentencia de ingreso sql \""+sent+"\"\n"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            try{
                st = con.createStatement();
                st.execute("insert into errores(error) values('"+sent+"')");
                cerrarBase();
            }
            catch(Exception e){}
        }
    }
    
    public void cerrarBase(){
        try{
            con.close();
            st.close();
        }
        catch(Exception ex){
//            JOptionPane.showMessageDialog(ma.vContenedora, "Error al cerrar la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public JTable getTabla(){
        return tabla;
    }
    
    public MiModelo getModelo(){
        return mm;
    }
    
    public JTable getTablaModelo(){//hija de MiModelo
        return new JTable(mm);
    }
    
    public int getNumeroFilas(){
        return tabla.getRowCount();
    }
    
    public String getSentencia(){
        return sentencia;
    }
    
}