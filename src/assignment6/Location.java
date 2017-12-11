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

    public Location() {
        this.Location = null;
        this.North = new String[5];
        this.East = new String[5];
        this.South = new String[5];
        this.West = new String[5];
    }
    
    public void setName(String place){
        this.Location = place;
    }
    public void SetNorthDirect(String image, String isBlocked,String nextlocate, String nextDirect){
        this.North[0]= "N";
        this.North[1]= image;
        this.North[2]= isBlocked;
        this.North[3]= nextlocate;
        this.North[4]= nextDirect;
    }
    public void SetEastDirect(String image, String isBlocked,String nextlocate, String nextDirect){
        this.East[0]= "E";
        this.East[1]= image;
        this.East[2]= isBlocked;
        this.East[3]= nextlocate;
        this.East[4]= nextDirect;
    }
    public void SetSouthDirect(String image, String isBlocked,String nextlocate, String nextDirect){
        this.South[0]= "S";
        this.South[1]= image;
        this.South[2]= isBlocked;
        this.South[3]= nextlocate;
        this.South[4]= nextDirect;
    }
    public void SetWestDirect(String image, String isBlocked,String nextlocate, String nextDirect){
        this.West[0]= "W";
        this.West[1]= image;
        this.West[2]= isBlocked;
        this.West[3]= nextlocate;
        this.West[4]= nextDirect;
    }
    
    public String getNext(int direction){
        if(direction == 1){
            if("false".equals(this.North[2])){
                String next = this.North[3]+" "+ this.North[4];
                return(next);
            }else{
                return null;
            }
        }else if(direction == 2){
            if("false".equals(this.East[2])){
                String next = this.East[3]+" "+ this.East[4];
                return(next);
            }else{
                return null;
            }
        }else if(direction == 3){
            if("false".equals(this.South[2])){
                String next = this.South[3]+" "+ this.South[4];
                return(next);
            }else{
                return null;
            }
        }else{
            if("false".equals(this.West[2])){
                String next = this.West[3]+" "+ this.West[4];
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
    public String nextDirection(int currDirect){
        if(currDirect == 1){
            return this.North[1];
        }else if(currDirect == 2){
            return this.East[1];
        }else if(currDirect == 3){
            return this.South[1];
        }else{
            return this.West[1];
        }
    }
    public String getLocation(){
        return this.Location;
    }
    public String getImage(int currDirect){
        if(currDirect == 1){
            return this.North[1];
        }else if(currDirect == 2){
            return this.East[1];
        }else if(currDirect == 3){
            return this.South[1];
        }else{
            return this.West[1];
        }
    }
    }
