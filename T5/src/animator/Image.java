package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Uma imagem na animacao.
class Image {

    BufferedImage img;
    public Point pos;
    public double angle;
    private int raio = 50;
    private int xinicial, yinicial; 
    public int height, width;
    private String movimento;
    private int direcao;
    PathCircle novo = new PathCircle();
    PathLine linha = new PathLine();
    public Image(Point pos, BufferedImage img, String path, int direcao, Dimension dim) {
        this.pos = pos;
        this.xinicial = pos.x;
        this.yinicial = pos.y;
        this.img = img;
        this.movimento = path;
        this.height = dim.height;
        this.width = dim.width;
        this.direcao = direcao;
    }

    
    public void draw(Graphics g) {
        g.drawImage(img, (int) pos.getX(), (int) pos.getY(), null);
    }
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    public void move() {
         if ("Circle".equals(this.movimento))
                angle = novo.movimenta(direcao, angle, pos, xinicial, yinicial, raio);
         if ("LineAleatoria".equals(this.movimento))
                linha.reta(direcao,pos, height,width);
         if ("Line".equals(this.movimento))  
                linha.retanormal(pos,height,width);
         }
         
}
