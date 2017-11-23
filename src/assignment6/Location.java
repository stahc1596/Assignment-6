/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author messr2578
 */
public class Location {

    private String Location;
    private String[] North;
    private String[] East;
    private String[] South;
    private String[] West;

    public Location(String Location) {
        this.Location = Location;
        this.North = new String[4];
        this.East = new String[4];
        this.South = new String[4];
        this.West = new String[4];
    }
    
    public void NorthDirect(String line){
        this.North[0]= line.substring(0, 1);
        this.North[1]= line.substring(3, 14);
        this.North[2]= line.substring(16, 20);
        this.North[3]= line.substring(22, 30);
        this.North[4]= line.substring(31, 32);
    }
    public void EastDirect(String line){
        this.East[0]= line.substring(0, 1);
        this.East[1]= line.substring(3, 14);
        this.East[2]= line.substring(16, 20);
        this.East[3]= line.substring(22, 30);
        this.East[4]= line.substring(31, 32);
    }
    public void SouthDirect(String line){
        this.South[0]= line.substring(0, 1);
        this.South[1]= line.substring(3, 14);
        this.South[2]= line.substring(16, 20);
        this.South[3]= line.substring(22, 30);
        this.South[4]= line.substring(31, 32);
    }
    public void WestDirect(String line){
        this.West[0]= line.substring(0, 1);
        this.West[1]= line.substring(3, 14);
        this.West[2]= line.substring(16, 20);
        this.West[3]= line.substring(22, 30);
        this.West[4]= line.substring(31, 32);
    }
    
    public String getNext(int direction){
        if(direction == 1){
            if("false".equals(this.North[2])){
                String next = this.North[3]+ this.North[4];
                return(next);
            }else{
                return null;
            }
        }else if(direction == 2){
            if("false".equals(this.East[2])){
                String next = this.East[3]+ this.East[4];
                return(next);
            }else{
                return null;
            }
        }else if(direction == 3){
            if("false".equals(this.South[2])){
                String next = this.South[3]+ this.South[4];
                return(next);
            }else{
                return null;
            }
        }else{
            if("false".equals(this.West[2])){
                String next = this.West[3]+ this.West[4];
                return(next);
            }else{
                return null;
            }
        }
    }
    
    public boolean isBlocked(int direction){
        if(direction == 1){
            if("false".equals(this.North[2])){
                return false;
            }else{
                return true;
            }
        }else if(direction == 2){
            if("false".equals(this.East[2])){
                return false;
            }else{
                return true;
            }
        }else if(direction == 3){
            if("false".equals(this.South[2])){
                return false;
            }else{
                return true;
            }
        }else{
            if("false".equals(this.West[2])){
                return false;
            }else{
                return true;
            }
        }
    }
    
    public String getLocation(){
        return this.Location;
    }
}
