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
public class FileRead {
    private Location[] places;
    
    public FileRead(){
        
    }
    public void readFile(){
        FileReader file = null;
        try{
            //Creating the file reader
            file = new FileReader("Images");
        }catch(Exception e){
            //Handle the error
            //Print out the lovely red errors
            e.printStackTrace();
            //Stop program
            System.exit(0);
        }
        
        Scanner in = new Scanner(file);
        String currLocat = in.nextLine();
        String currdirect= in.nextLine();
       
        for(int i = 0; i < 23;i++){
            String place = in.nextLine();
            this.places[i].setName(place);
            in.next();
            String image = in.next();
            String isBlock = in.next();
            String nextLocal = null;
            String nextDirect = null;
            if("false".equals(isBlock)){
                nextLocal = in.next();
                nextDirect = in.next();
            }
           this.places[i].SetNorthDirect(image,isBlock,nextLocal,nextDirect);
           in.nextLine();
           in.next();
           image = in.next();
           isBlock = in.next();
           nextLocal = null;
           nextDirect = null;
           if("false".equals(isBlock)){
                nextLocal = in.next();
                nextDirect = in.next();
           }
           this.places[i].SetEastDirect(image,isBlock,nextLocal,nextDirect);
           in.nextLine();
           in.next();
           image = in.next();
           isBlock = in.next();
           nextLocal = null;
           nextDirect = null;
           if("false".equals(isBlock)){
                nextLocal = in.next();
                nextDirect = in.next();
           }
           this.places[i].SetSouthDirect(image,isBlock,nextLocal,nextDirect);
           in.nextLine();
           in.next();
           image = in.next();
           isBlock = in.next();
           nextLocal = null;
           nextDirect = null;
           if("false".equals(isBlock)){
                nextLocal = in.next();
                nextDirect = in.next();
           }
           this.places[i].SetWestDirect(image,isBlock,nextLocal,nextDirect);
        }
    }
}