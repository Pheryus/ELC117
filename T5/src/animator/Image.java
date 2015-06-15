package animator;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Uma imagem na animacao.
class Image {

    BufferedImage img;
    public Point pos;
    public double angle;
    public int distanciareta = 0;
    private int distanciamaxreta;
    private int raio = 50;
    private int xinicial, yinicial; 
    private String movimento;
    private int direcao;
    private int velocidade;
    PathCircle novo = new PathCircle();
    PathLine linha = new PathLine();
    public Image(Point pos, BufferedImage img, String path, int direcao, int velocidade, int distancia) {
        this.pos = pos;
        this.xinicial = pos.x;
        this.yinicial = pos.y;
        this.img = img;
        this.movimento = path;
        this.direcao = direcao;
        this.velocidade = velocidade;
        this.distanciamaxreta = distancia;
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        g.drawImage(img, (int) pos.getX(), (int) pos.getY(), null);
    }
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    public void move() {
         if (movimento == "Circle")
                angle = novo.movimenta(direcao, angle, pos, xinicial, yinicial, raio);
         if (movimento == "Line")
                distanciareta = linha.reta(direcao,velocidade,distanciareta,distanciamaxreta, pos, xinicial, yinicial);
             
         }
         
}
