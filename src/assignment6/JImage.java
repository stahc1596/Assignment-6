/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author stahc1596
 */
public class JImage extends JComponent{
    private BufferedImage image;
    
    @Override
    public void paintComponent(Graphics g){
        //There is an image to draw
        if(image != null){
            //Draw the image
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
    
    public void setImage(BufferedImage img){
        //Store the image
        this.image = img;
        //Repaint the draw
        repaint();
    }
}
