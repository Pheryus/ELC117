/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Graphics;

/**
 *
 * @author Pedro
 */
public class Circle {
    
    public int raio, raio2=5, crescimento;
    public Point p;
    public int reta, max=40, velocidade = 2;
    public int direcao;
    public int height, width;
    public double angle = 0;
    public PathCircle path = new PathCircle();
    public PathLine line = new PathLine();
    public PathZoom zoom = new PathZoom();
    Color c;
    public String tipo;
    public Circle (Point p, int crescimento, Color c, String path, int direcao, Dimension dim){
            this.tipo = path;
            this.direcao = direcao;
            this.p = p;
            this.raio = 30;
            this.crescimento = crescimento;
            this.c = c;
            this.height = dim.height;
            this.width = dim.width;
    }
    
    public void draw (Graphics g){
        g.setColor(c);
        g.fillOval(p.x,p.y,raio,raio);     
    }

    public void move (){
        if ("Circle".equals(this.tipo)){
                this.angle = path.movimento(direcao,angle,p, raio2);
        }
        else if ("LineAleatoria".equals(this.tipo))
                line.reta(direcao, p, height,width);
        else if ("Zoom".equals(this.tipo)){
                raio = zoom.zoom(raio);
                if (raio >= 100)
                    raio = 30;
        }
        else if ("Line".equals(this.tipo))
                line.retanormal(p,height, width);
            }
    
    }
    
    

