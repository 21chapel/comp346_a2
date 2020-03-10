
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Comp346pa2driver {
	public static boolean debug = false; 
	public static boolean synched = false; 
	public static boolean using_sem = false; 

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	//set Output stream to file
       
        
    	Network objNetwork = new Network( );            /* Activate the network */
        objNetwork.start();
        // New
        Server first = new Server("first");
        first.start();
        Server second = new Server("second");
        second.start();
        //End on new
        
        Client objClient1 = new Client("sending");          /* Start the sending client thread */
        objClient1.start();
        Client objClient2 = new Client("receiving");        /* Start the receiving client thread */
        objClient2.start();

    }
    
 }
