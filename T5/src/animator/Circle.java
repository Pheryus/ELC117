/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;
import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

/**
 *
 * @author Pedro
 */
public class Circle {
    
    public int raio, crescimento;
    Point p;
    Color c;
    public String tipo;
    public Circle (Point p, int raio, int crescimento, Color c, String path){
            this.tipo = path;
            this.p = p;
            this.raio = raio;
            this.crescimento = crescimento;
            this.c = c;
    }
    
    public void draw (Graphics g){
        g.setColor(c);
        g.fillOval(p.x,p.y,raio,raio);     
    }
    
    
}
