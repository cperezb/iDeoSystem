/*
 * MiModelo.java
 *
 * Created on 10 de junio de 2011, 02:45 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ideosystem;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class MiModelo extends DefaultTableModel{
   
   @Override
   public boolean isCellEditable (int row, int column){//hace  que todas las celdas no sean editables
       return false;
   }
    
}