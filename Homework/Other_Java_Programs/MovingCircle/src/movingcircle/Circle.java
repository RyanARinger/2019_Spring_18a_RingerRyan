/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingcircle;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;


/**
 *
 * @author ringe
 */
public class Circle extends JPanel{
    

    
    @Override
    public void paintComponent(Graphics g){
	
	g.setColor(Color.red);
	g.fillOval(10, 10, 100, 100);
	
	
    }
    
}
