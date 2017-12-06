/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.awt.image.BufferedImage;

/**
 *
 * @author stahc1596
 */
public class SchoolMain {

    private SchoolGUI gui;
    private Location loc;
    private Player player;
    private FileRead read;
    
    public SchoolMain(int startD, String startL){
        gui = new SchoolGUI(this);
        read.readFile();
        loc = new Location();
        loc.getNext(startD);
        gui.setImage(loc.getLocation());
        gui.setVisible(true);
    }
    
    public void move(){
        int dir = player.getDirection();
        String local = loc.getNext(dir);
        gui.setImage(loc.getLocation());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SchoolMain game = new SchoolMain(1, "Caf1");
    }
}
