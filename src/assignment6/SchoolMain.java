/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author stahc1596
 */
public class SchoolMain {

    private SchoolGUI gui;
    private Location loc;
    private Player player;
    
    public SchoolMain(int startD, String startL){
        gui = new SchoolGUI(this);
        gui.setVisible(true);
    }
    
    public void move(){
        int dir = player.getDirection();
        String local = loc.getNext(dir);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SchoolMain game = new SchoolMain(1, "Caf1");
    }
}
