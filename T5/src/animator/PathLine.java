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
public class PathLine {
            
        public int reta(int direcao, int velocidade, int distanciareta, int distanciamax, Point pos, int xinicial, int yinicial){
                if (distanciareta > distanciamax){
                        pos.move(xinicial,yinicial);
                        distanciareta = 0;}
                else{  
                        if (direcao == 1)
                                pos.move(pos.x,pos.y+velocidade);
                        if (direcao == 2)
                                pos.move(pos.x,pos.y-velocidade);
                        if (direcao == 3)
                                pos.move(pos.x+velocidade,pos.y);
                        if (direcao == 0)
                                pos.move(pos.x-velocidade,pos.y);
                         distanciareta++;
                 }
                 return distanciareta;
    }
}
    

