/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor;

import excepciones.DatabaseException;
import interfaces.MenuHospital;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author niobeclaveria
 */
public class Utils {
    
    private String user;
    private String db;
    private String conexion;
    private String password;
    private Connection conn;

    private final static String driver = "com.mysql.cj.jdbc.Driver";

    public Utils(String user, String db, String conexion, String password) {
        this.user = user;
        this.db = db;
        this.conexion = conexion;
        this.password = password;
        this.conn = null;
    }

    //Métodos para inicializar y cerrar la base de datos
    public void initDataBase() throws DatabaseException {
        try {
            //cargar el driver
            Class.forName(driver);
            this.conn = DriverManager.getConnection(conexion + db, user, password);
        } catch (ClassNotFoundException ex) {
            //ex.printStackTrace();
            throw new DatabaseException("No has puesto la librería MySql");
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new DatabaseException(ex.getSQLState() + " Error al conectarse");
        }
    }

    public void cerrarConexion() throws DatabaseException {
        try {
            this.conn.close();
            System.out.println("se cierra");
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new DatabaseException(ex.getSQLState() + " no se ha podido cerrar la base de datos, posible perdida de informacion");

        }
    }
    
    public void volverAlMenu(Utils miConexion){
        MenuHospital mh = new MenuHospital(miConexion);
        mh.setVisible(true);
        mh.setLocationRelativeTo(null);
    }
    
}
