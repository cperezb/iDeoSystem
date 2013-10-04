/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Usuario;
import ideosystem.Main;
import ideosystem.MiModelo;

public class UsuarioDAO {

    private Main ma;

    public UsuarioDAO(Main ma) {
        this.ma = ma;
    }

    public MiModelo getDatosUsuarios() {
        ma.bd.abrir();
        ma.bd.sentencia("SELECT id_usuarios as 'Id', nombres as 'Nombres', apellidos as 'Apellidos', nick as 'Nick' "
                + "FROM usuarios where estado <> 1");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

//    public void ingresarUsuario(String nombres, String apellidos, String nick, String password) {
//        ma.bd.abrir();
//        ma.bd.ingreso("insert into usuarios(nombres, apellidos, nick, password) values('" + nombres + "', '" + apellidos + "', '" + nick + "', '" + password + "')");
//        ma.bd.cerrarBase();
//    }
    public Boolean usuarioExistente(String criterio) {
        boolean usuario = false;
        ma.bd.abrir();
        ma.bd.sentencia("SELECT nick FROM usuarios");
        ma.bd.cerrarBase();

        for (int i = 0; i < ma.bd.getModelo().getRowCount(); i++) {
            if (ma.bd.getTabla().getValueAt(i, 0).toString().compareTo(criterio) == 0) {
                usuario = true;
                break;
            } else {
                usuario = false;
            }
        }

        return usuario;
    }

    public MiModelo DeshabilitarUsuario(int id) {
        ma.bd.abrir();
        ma.bd.ingreso("update usuarios set estado = 1 where id_usuarios = " + id);
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public void eliminarUsuario(int id) {
        ma.bd.abrir();
        ma.bd.ingreso("delete from usuarios where id_usuarios = " + id);
        ma.bd.cerrarBase();
    }

    public MiModelo buscarUsuario(String criterio) {

        ma.bd.abrir();
        ma.bd.sentencia("SELECT id_usuarios as 'Id', nombres as 'Nombres', apellidos as 'Apellidos', nick as 'Nick' "
                + " from usuarios where nombres like('" + criterio + "%') or nick like('" + criterio + "%')");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

//    public void actualizarUsuario(String nombres, String apellidos, String nick, String password, int id) {
//        ma.bd.abrir();
//        ma.bd.ingreso("update usuarios set nombres ='" + nombres + "',"
//                + "apellidos ='" + apellidos + "'," + "nick ='" + nick + "',"
//                + "password ='" + password + "'"
//                + "where id_usuarios =" + id);
//        ma.bd.cerrarBase();
//    }
    public void ingresarUsuario(Usuario usuario) {
        ma.bd.abrir();
        ma.bd.ingreso("insert into usuarios(nombres, apellidos, nick, password) "
                + " values('" + usuario.getNombres() + "', '" + usuario.getApellidos() + "', '" + usuario.getNick() + "', '" + usuario.getPassword() + "')");
        ma.bd.cerrarBase();
    }

    public void actualizarUsuario(Usuario usuario) {
        ma.bd.abrir();
        ma.bd.ingreso("update usuarios set nombres ='" + usuario.getNombres() + "',"
                + "apellidos ='" + usuario.getApellidos() + "'," + "nick ='" + usuario.getNick() + "',"
                + "password ='" + usuario.getPassword() + "'"
                + "where id_usuarios =" + usuario.getIdUsuario());
        ma.bd.cerrarBase();
    }

    public Usuario getPasswordByNick(String nick) {
        ma.bd.abrir();
        ma.bd.sentencia("select id_usuarios,password from usuarios where nick = '" + nick + "' ");
        ma.bd.cerrarBase();

        Usuario user = new Usuario();

        if (ma.bd.getNumeroFilas() > 0) {
            user.setNick(nick);
            user.setPassword(ma.bd.getTabla().getValueAt(0, 0).toString());
            user.setPassword(ma.bd.getTabla().getValueAt(0, 1).toString());
        }

        return user;
    }
}
