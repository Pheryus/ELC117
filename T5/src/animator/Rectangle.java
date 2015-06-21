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
public class Rectangle {
    public int raio = 2, raio2= 5;
    public Point p;
    public Color c; //cor aleatoria
    public String tipo; //tipo de movimento
    public int direcao; //direcao que retangulo se move
    public int larg, alt; //tamanho retangulo
    public int height, width; //altura tela
    public double angle = 0; // para animacao circular
    public PathCircle path = new PathCircle();
    public PathLine line = new PathLine();
    public PathZoom zoom = new PathZoom();

    public Rectangle (Point p, Color c, String path, int direcao, Dimension dim){
        this.p = p;
        this.tipo = path;
        this.larg = 80;
        this.alt = 40;
        this.height = dim.height;
        this.width = dim.width;
        this.c = c; //cor
        this.direcao = direcao; //direcao da linha;
    }
    public void draw (Graphics g){
        g.setColor(this.c);
        g.fillRect(this.p.x,this.p.y,larg, alt);    
    }
    
    public void move (){
        if ("Circle".equals(this.tipo)){
                this.angle = path.movimento(direcao,angle,p,raio2);
        }
        else if ("LineAleatoria".equals(this.tipo))
                line.reta(direcao, p, height, width);
        else if ("Zoom".equals(this.tipo)){
                larg = zoom.zoom(larg);
                alt += 1;
                if (larg > 180){
                        larg -= 100;
                        alt -= 50;
                }
        }
        else if ("Line".equals(this.tipo))
                line.retanormal(p,height,width);
            }
}
