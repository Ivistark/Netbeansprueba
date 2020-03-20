/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudacarol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author alumno
 */
public class AyudaCarol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        

        
       

            FileReader f = new FileReader("Enlaces Android.txt");
            BufferedReader lector = new BufferedReader(f);

            Process p = null;
            String linea = null;
            while ((linea = lector.readLine()) != null) {
                
                p = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
                        + " "
                        + linea);
                p.waitFor(1, TimeUnit.SECONDS);
            }
        }
    
}
