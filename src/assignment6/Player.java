/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author stahc1596
 */
public class Player {
    
    private int direction;
    private String location;
    
    //Constructor for the player. Name, Direction, and Location starts at a
    //certain spot
    public Player(){
        this.direction = 1;
        this.location = "Caf1";
    }
    
    //Method allows the player to turn right
    public void turnRight(){
        if(this.direction == 4){
           this.direction = 1;
        }else{
            this.direction++;
        }
    }
    
    //Method allows the player to turn left
    public void turnLeft(){
        if(this.direction == 1){
            this.direction = 4;
        }else{
            this.direction--;
        }
    }
    
    //Method takes the location and returns the new location after the player
    //moves
    public String location(String location){
        //Method recieves the string of a location and returns with a
        //corresponding string
        //Requires location class
        //Possibly delete this
        return location;
    }
    
    //Method returns the direction
    public int getDirection(){
        return direction;
    }
}
