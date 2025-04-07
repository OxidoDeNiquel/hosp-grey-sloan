/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospgreysloan;

import gestor.Utils;
import interfaces.MenuHospital;

/**
 *
 * @author niobeclaveria
 */
public class HospGreySloan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Utils miConexion = new Utils("", "", "", "");
        MenuHospital mh = new MenuHospital(miConexion);
        mh.setVisible(true);
        mh.setLocationRelativeTo(null);
    }
    
}
