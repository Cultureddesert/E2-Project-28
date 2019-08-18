/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_28;

/**
 *
 * @author lfrick3
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Project_28 extends JPanel implements ActionListener
{
    Timer tm = new Timer(5, this);
    int x = 0, velX = 2;
    int y = 0, velY = 2;
    int z = 0, velZ = 2;
    int v = 0, velV = 2;
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        g.fillRect(x, y, z, v);
        
        tm.start();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (x < 0 || x > 535)
            velX = -velX;
        
        x = x + velX;
        
        if (y < 0 || y > 335)
            velY = -velY;
        
        y = y + velY;
        
        if (z < 0 || z > 50)
            velZ = -velZ;
        
        z = z + velZ;
        
        if (v < 0 || v > 50)
            velV = -velV;
        
        v = v + velV;
        repaint();
    }
    
    public static void main(String[] args) 
    {
        Project_28 t = new Project_28();
        JFrame jf = new JFrame();
        jf.setTitle("Project_28");
        jf.setSize(600, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
    
}
