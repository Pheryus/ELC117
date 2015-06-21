/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;
import java.awt.Point;

/**
 *
 * @author Pedro
 */
public class PathCircle{
    //imagem
    public double movimenta(int direcao, double angle, Point pos, int xinicial, int yinicial, int raio){
                if (direcao < 2)
                        angle += 0.1;
                else
                        angle -= 0.1;
                int x = (int)(Math.cos(angle)*raio);
                int y = (int)(Math.sin(angle)*raio);
                x += xinicial;
                y += yinicial;
                pos.move(x,y);
                return angle;
    }
    //retangulo e circulo
    public double movimento (int direcao,double angle, Point inicio, int raio){
                
                if (direcao < 2)
                        angle += 0.1;
                else
                        angle -= 0.1;
                int a = (int)(Math.cos(angle)*raio);
                int b = (int)(Math.sin(angle)*raio);
                a+= inicio.x;
                b+= inicio.y;
                inicio.move(a,b);
                return angle;
    }
    
}