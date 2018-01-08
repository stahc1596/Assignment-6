/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author messr2578
 * created by Cameron S. and Ryan M.
 */
public class MainGame extends javax.swing.JFrame {
    private Player student;
    private FileRead school;
    /**
     * Creates new form MainGame
     */
    public MainGame() {
        initComponents();
        this.school = new FileRead();
        this.student = new Player();
        student.setDirection(school.GetStartingDirection());
        student.setLocation(school.GetStartingLocation());
        Picture.setImage(school.getLocatonImage(school.getPlacesImage(student.getLocation(),student.getDirection())));
        
    }
    private BufferedImage loadImage(String image){
        BufferedImage img = null;
        try{
            ImageIO.read(new File(image));
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return img;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jImage1 = new assignment6.JImage();
        move = new javax.swing.JButton();
        turnLeft = new javax.swing.JButton();
        location = new javax.swing.JLabel();
        turnRight = new javax.swing.JButton();
        Picture = new assignment6.JImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        move.setText("Move Forward");
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });

        turnLeft.setText("Turn Left");
        turnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnLeftActionPerformed(evt);
            }
        });

        location.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        location.setText("Huron Heights");

        turnRight.setText("Turn Right");
        turnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnRightActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Picture.add(jScrollPane1);
        jScrollPane1.setBounds(-10, -40, 166, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(turnLeft)
                        .addGap(116, 116, 116)
                        .addComponent(move)
                        .addGap(78, 78, 78)
                        .addComponent(turnRight)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(turnLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveActionPerformed
        int direct = student.getDirection();
        String locate =student.getLocation();
        if(school.isBlocked(locate, direct) == false){
        String temp = school.getNextLocation(locate, direct);
        String nextLocate = temp.substring(0, temp.length()-2);
        String nextDirec = temp.substring(temp.length()-1);
        int nextDirect =0;
        if ("N".equals(nextDirec)) {
            nextDirect = 1;
        } else if ("E".equals(nextDirec)) {
            nextDirect = 2;
        } else if ("S".equals(nextDirec)) {
            nextDirect = 3;
        } else if("W".equals(nextDirec)){
            nextDirect = 4;
        }
        student.setLocation(nextLocate);
        student.setDirection(nextDirect);
        }else{
        jTextArea1.setText("This way is blocked");
        }
        String image = school.getPlacesImage(student.getLocation(), student.getDirection());
        Picture.setImage(school.getLocatonImage(image));
    }//GEN-LAST:event_moveActionPerformed

    private void turnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnLeftActionPerformed
        student.turnLeft();
        String image = school.getPlacesImage(student.getLocation(), student.getDirection());
        Picture.setImage(school.getLocatonImage(image));
        jTextArea1.setText("");
    }//GEN-LAST:event_turnLeftActionPerformed

    private void turnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnRightActionPerformed
        student.turnRight();
        String image = school.getPlacesImage(student.getLocation(), student.getDirection());
        Picture.setImage(school.getLocatonImage(image));
        jTextArea1.setText("");
        
    }//GEN-LAST:event_turnRightActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private assignment6.JImage Picture;
    private assignment6.JImage jImage1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel location;
    private javax.swing.JButton move;
    private javax.swing.JButton turnLeft;
    private javax.swing.JButton turnRight;
    // End of variables declaration//GEN-END:variables
}
