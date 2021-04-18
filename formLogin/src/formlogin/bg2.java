/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlogin;

/**
 *
 * @author NEC VERSA
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class bg2 extends JPanel {
    private final Image Image;
    
    public bg2() {
        Image = new ImageIcon(getClass().getResource("/gambar/background2.jpg")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(Image, 0, 0, getWidth(), getHeight(),null);
        gd.dispose();
    }
    
}
