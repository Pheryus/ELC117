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
public class Rectangle {
    
    public int x,y,x2,y2, tamanho, maxX, maxY;
    public int raio = 50;
    private int xinicial,yinicial,x2inicial,y2inicial;
    private Color c;
    public String tipo;
    public double angle;
 
    
    public Rectangle (Point p, Point p2, int maxX, int maxY, Color c, String path){
        this.x = p.x;
        this.y = p.y;
        this.tipo = path;
        this.angle = 0;
        this.x2 = p2.x + p.x;
        this.y2 = p2.y + p.y;
        this.xinicial = this.x;
        this.x2inicial = this.x2;
        this.yinicial = this.y;
        this.y2inicial = this.y2;
        this.maxX = this.x2 + maxX;
        this.maxY = this.y2 + maxY;
        this.c = c;
    }
    public void draw (Graphics g){
        g.setColor(this.c);
        g.fillRect(x,y,x2,y2);    
    }
   
    
}
