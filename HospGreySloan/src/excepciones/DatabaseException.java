/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package excepciones;

/**
 *
 * @author niobeclaveria
 */
public class DatabaseException extends Exception{

    /**
     * Creates a new instance of <code>DatabaseExcepcion</code> without detail
     * message.
     */
    public DatabaseException() {
    }

    /**
     * Constructs an instance of <code>DatabaseExcepcion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DatabaseException(String msg) {
        super(msg);
    }
}
