package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Random;

// Conjunto de objetos da animacao.
class ObjectSet {
    
    private Image[] images;
    private Circle[] circle;
    private Rectangle[] rectangle;
    
    // Adiciona objetos da classe Image ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        System.out.printf("Test: adding %d images\n", n);
        System.out.printf("Test: motion path %s\n", path);
        images = new Image[n];
        for (int i = 0; i < images.length; i++) {
            Point p;
            if (i>2)
                    p = new Point(-300+(i*150),183);
            else
                    p = new Point(100+(i*150),50);      
                            
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(4); //Gera Direção aleatoria
            int randomVel = randomGenerator.nextInt(6); //Gera velocidade aleatoria -> reta
            int randomdistanciamax = randomGenerator.nextInt(4); //Gera distancia maxima aleatoria ->reta
            images[i] = new Image(p, image, path, randomInt, randomVel+1, 2*randomdistanciamax+30); //randomInt é responsável pela direção aleatoria da animação da imagem
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addStars(int n, Dimension dim, String path) {
 
            
        System.out.printf("Test: adding %d stars\n", n);
        System.out.printf("Test: motion path %s\n", path);

        
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addRectangles(int n, Dimension dim, String path) {
       rectangle = new Rectangle[n];
       for (int i = 0; i < n; i++){
            Random randomGenerator = new Random();
            Color c = new Color(randomGenerator.nextInt(256),randomGenerator.nextInt(256),randomGenerator.nextInt(256));
            Point p = new Point(showRandomInteger(0,400,randomGenerator),showRandomInteger(0,400,randomGenerator));
            Point p2 = new Point (randomGenerator.nextInt(70),randomGenerator.nextInt(70));
            rectangle[i] = new Rectangle(p,p2,200,200,c, path);
       }    
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
    }
    
        // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addCircles(int n, Dimension dim, String path) {
        
        circle = new Circle[n];
        for (int i = 0; i < n; i++){
            Random randomGenerator = new Random();
            Color c = new Color(randomGenerator.nextInt(256),randomGenerator.nextInt(256),randomGenerator.nextInt(256));
            Point p = new Point(showRandomInteger(0,400,randomGenerator),showRandomInteger(0,400,randomGenerator));
            int raio = randomGenerator.nextInt(100)+1;
            int crescimento = randomGenerator.nextInt(99)+1;
            circle[i] = new Circle(p,raio,crescimento,c, path);
       }        
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
    }
    
    // Desenha cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void drawAll(Graphics g) {
        for (int i = 0; i< images.length; i++)
                 images[i].draw(g);
        for (int i=0;rectangle != null && i <rectangle.length; i++)
            rectangle[i].draw(g);
        for (int i=0; circle != null && i<circle.length;i++)
            circle[i].draw(g);
    }

    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
        for (int i = 0; i< images.length; i++){
                 images[i].move();
    }

    }
    private static int showRandomInteger(int aStart, int aEnd, Random aRandom){
            if (aStart > aEnd) {
                    throw new IllegalArgumentException("Start cannot exceed End.");
        }
    //get the range, casting to long to avoid overflow problems
            long range = (long)aEnd - (long)aStart + 1;
    // compute a fraction of the range, 0 <= frac < range
            long fraction = (long)(range * aRandom.nextDouble());
            int randomNumber =  (int)(fraction + aStart);    
            return randomNumber;
  }
    
    
}