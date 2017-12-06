/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.awt.image.BufferedImage;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author stahc1596
 */
public class FileRead {
    private Location[] places;
    private String starting;
    private int startlook;
    
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
        this.starting = in.nextLine();
        String currdirect= in.nextLine();
        if(currdirect.equals("N")){
            this.startlook= 1;
        }else if(currdirect.equals("E")){
            this.startlook= 2;
        }else if(currdirect.equals("S")){
            this.startlook= 3;
        }else{
            this.startlook= 4;
        }
       
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
    
    public String getNextLocation(String current, int direction){
        int i = 0;
        while(!current.equals(this.places[i].getLocation())){
            i++;
        }
        return this.places[i].getNext(direction);
    }
    
    public int getNextDirection(String location, int direction){
        int i = 0;
        while(location.equals(this.places[i].getLocation())){
            i++;
        }
        String Direct = this.places[i].nextDirection(direction);
        if(Direct.equals("N")){
            return 1;
        }else if(Direct.equals("E")){
            return 2;
        }else if(Direct.equals("S")){
            return 3;
        }else{
            return 4;
        }
    }
    public int GetStartingDirection(){
    return this.startlook;
}
    public String GetStartingLocation(){
    return this.starting;
}
}
