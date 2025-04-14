/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospgreysloan;

import excepciones.DatabaseException;
import gestor.Utils;
import interfaces.MenuHospital;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author niobeclaveria
 */
public class HospGreySloan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Utils miConexion = new Utils("nio", "HospGreySloan", "jdbc:mysql://localhost:3306/", "nio");
            
            miConexion.initDataBase();
            
            MenuHospital mh = new MenuHospital(miConexion);
            mh.setVisible(true);
            mh.setLocationRelativeTo(null);
            
        } catch (DatabaseException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    
}
