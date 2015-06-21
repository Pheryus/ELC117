/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

/**
 *
 * @author Pedro
 */
public class Star {
    
    public PathCircle path = new PathCircle();
    public PathLine line = new PathLine();
    public PathZoom zoom = new PathZoom();
    Point p;
    public int height, width;
    public int raio1=25, raio2=50, raio3=5, direcao;
    public String tipo;
    public Color cor;
    public int[] x, y, x1, y1;
    public double angle = 0;
    
        public Star (Point p, String path, Color cor, int direcao, Dimension dim){
                this.p = p;
                this.tipo = path;
                this.x = new int[3];
                this.y = new int[3];
                this.x1 = new int[10];
                this.y1 = new int[10];
                this.height = dim.height;
                this.width = dim.width;
                this.direcao = direcao;
                this.cor = cor;
        }
        public void draw (Graphics g){
            double ang = Math.PI/5;
            int t = 0;
            for(int i=0; i<5; i++){
                x[0] = (int) ((raio1 * cos(ang)) + p.x);
                y[0] = (int) ((raio1 * sin(ang)) + p.y);
                x1[t] = x[0];
                y1[t] = y[0];
                t++;
                ang+=Math.PI/5;
                x[1] = (int) ((raio2 * cos(ang)) + p.x);
                y[1] = (int) ((raio2 * sin(ang)) + p.y);
                ang+=Math.PI/5;
                x[2] = (int) ((raio1 * cos(ang)) + p.x);
                y[2] = (int) ((raio1 * sin(ang)) + p.y);
                x1[t] = x[2];
                y1[t] = y[2];
                g.setColor(cor);
                g.fillPolygon(x, y, 3);
        }
            g.fillPolygon(x1, y1, 5);
        }
        
        public void move(){
            
            if ("Circle".equals(this.tipo))
                this.angle = path.movimento(direcao,angle,p, raio3);
            if ("LineAleatoria".equals(this.tipo))
                line.reta(direcao, p, height, width);
            if ("Zoom".equals(this.tipo)){
                this.raio1 = zoom.zoom(raio1);
                this.raio2 += 4;
                if (raio2 >= 100){
                       this.raio2 = 50;
                       this.raio1 = 25;
                }
            }
            if ("Line".equals(this.tipo))
                line.retanormal(p,height,width);
            }
        }

