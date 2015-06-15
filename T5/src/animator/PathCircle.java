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
    //retangulo
    public double movimenta (double angle, Point inicio, Point fim, int raio){
                angle += 0.1;
                int a = (int)(Math.cos(angle)*raio);
                int b = (int)(Math.sin(angle)*raio);
                inicio.x += a;
                fim.x += a;
                inicio.y += b;
                fim.y += b;
                return angle;
       
    }
    
    

    
}