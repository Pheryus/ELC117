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
            
        public void reta(int direcao,  Point pos, int alt, int larg){
                if (direcao == 1 && pos.y >= alt)
                        pos.y = 0;
                if (direcao == 2 && pos.y <= 0)
                        pos.y = alt;
                if (direcao == 3 && pos.x >= larg)
                        pos.x = 0;
                if (direcao == 0 && pos.x <= 0)
                        pos.x = larg;
                        
                else{  
                        if (direcao == 1)
                                pos.move(pos.x,pos.y+2);
                        if (direcao == 2)
                                pos.move(pos.x,pos.y-2);
                        if (direcao == 3)
                                pos.move(pos.x+2,pos.y);
                        if (direcao == 0)
                                pos.move(pos.x-2,pos.y);
                 }
    }
        public void retanormal (Point pos, int alt, int larg){
            
                if (pos.x >= larg)
                    pos.x = 0;
                else
                        pos.move(pos.x+2, pos.y);
        }
}
    

