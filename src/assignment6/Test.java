/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author stahc1596
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader file = null;
        try{
            //Creating the file reader
            file = new FileReader("input.txt");
        }catch(Exception e){
            //Handle the error
            //Print out the lovely red errors
            e.printStackTrace();
            //Stop program
            System.exit(0);
        }
        
        Scanner in = new Scanner(file);
        String test = in.nextLine();
        System.out.println(test);
    }
}
