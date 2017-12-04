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
 * @author messr2578
 */
public class JImage extends JComponent{
        BufferedImage img = null;
        
        @Override
        public void paintComponent(Graphics g){
            // there is an image to draw
            if(img!= null)
                // draw the image
               g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),null);
        }
    
    
    public void setImage(BufferedImage img){
        // store the image
        this.img = img;
        // repaint to draw
        repaint();
    }
}
