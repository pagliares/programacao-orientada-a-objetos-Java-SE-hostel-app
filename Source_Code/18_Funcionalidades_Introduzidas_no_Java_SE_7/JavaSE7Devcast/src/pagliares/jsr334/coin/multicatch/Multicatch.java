/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pagliares.jsr334.coin.multicatch;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pagliares
 */
public class Multicatch {

    private static final Logger LOGGER = Logger.getLogger("");
    private static FileHandler fh;

    public static void main(String[] args) throws IOException {
        fh = new FileHandler("log.xml");
        LOGGER.addHandler(fh);
        LOGGER.setLevel(Level.INFO);
	LOGGER.info("Iniciando o servidor na porta 8080");		 
      //  catchPreJavaSE7();
       catchJavaSE7();        
    }

    public static void catchPreJavaSE7()  { 
        
        try {
            AbstractTableModel teste = (AbstractTableModel)Class.forName("javax.swing.table.AbstractTableModel").newInstance();
           // teste+="Palestra sobre Java SE 7";           
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Exceção capturada", e);                         
        } catch (InstantiationException e) {
            LOGGER.log(Level.SEVERE, "Exceção capturada", e);              
        } catch (IllegalAccessException e) {            
            LOGGER.log(Level.SEVERE, "Exceção capturada", e);             
        }
    }

    public static void catchJavaSE7()  {
        try {
            String teste = (String)Class.forName("java.lang.String").newInstance();
            teste+="Palestra sobre Java SE 7";
            System.out.println(teste);               
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
             LOGGER.log(Level.SEVERE, "Exceção não capturada", e);             
        }
    }
}
