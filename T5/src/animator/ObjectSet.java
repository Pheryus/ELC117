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
    private Star[] star;
    
   //Posição definida de acordo com o padrão da tela
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        System.out.printf("Test: adding %d images\n", n);
        System.out.printf("Test: motion path %s\n", path);
        images = new Image[n];
        Random randomGenerator = new Random();
        for (int i = 0; i < images.length; i++) {
            Point p;

            if (dim.height== 600 && dim.width == 600){
                    if (i>2)
                            p = new Point(-300+(i*150),183);
                    else
                            p = new Point(100+(i*150),50);
            }
            else{

            
                    p = new Point(showRandomInteger(50,dim.height-300,randomGenerator), showRandomInteger(50,dim.width-300,randomGenerator));
                   System.out.println("x: "+ p.x +"y"+p.y+"\n");
            }
            int randomInt = randomGenerator.nextInt(4); //Gera Direção aleatoria
            images[i] = new Image(p, image, path, randomInt,dim); //randomInt é responsável pela direção aleatoria da animação da imagem
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addStars(int n, Dimension dim, String path) {
        
        if (n != 0)
                star = new Star[n];
        else 
                star = null;
        for (int i = 0; i < n; i++){
                Random randomGenerator = new Random();
                Color c = new Color(randomGenerator.nextInt(256),randomGenerator.nextInt(256),randomGenerator.nextInt(256));
                Point p = new Point (showRandomInteger(50,dim.height-200,randomGenerator),showRandomInteger(50,dim.width-200,randomGenerator));
                int randomInt = randomGenerator.nextInt(4); //Gera Direção aleatoria
                star[i] = new Star(p,path,c,randomInt,dim);
        }
        System.out.printf("Test: adding %d stars\n", n);
        System.out.printf("Test: motion path %s\n", path);

        
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addRectangles(int n, Dimension dim, String path) {
        if (n != 0)
                rectangle = new Rectangle[n];
        else
                rectangle = null;
       for (int i = 0; i < n; i++){
            Random randomGenerator = new Random();
            Color c = new Color(randomGenerator.nextInt(256),randomGenerator.nextInt(256),randomGenerator.nextInt(256));
            Point p = new Point(showRandomInteger(50,dim.height-200,randomGenerator),showRandomInteger(50,dim.width-200,randomGenerator));
            int direcao = randomGenerator.nextInt(4);
            rectangle[i] = new Rectangle(p,c, path,direcao, dim);
       }    
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
    }
    
        // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addCircles(int n, Dimension dim, String path) {
        if (n != 0)
                circle = new Circle[n];
        else
                circle = null;
        for (int i = 0; i < n; i++){
            Random randomGenerator = new Random();
            Color c = new Color(randomGenerator.nextInt(256),randomGenerator.nextInt(256),randomGenerator.nextInt(256));
            Point p = new Point(showRandomInteger(100,dim.height-200,randomGenerator),showRandomInteger(100,dim.width-200,randomGenerator));
            int crescimento = randomGenerator.nextInt(99)+1;
            int direcao = randomGenerator.nextInt(4);
            circle[i] = new Circle(p,crescimento,c, path, direcao, dim);
       }        
        System.out.printf("Test: adding %d circles\n", n);
        System.out.printf("Test: motion path %s\n", path);
    }
    
    // Desenha cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void drawAll(Graphics g) {
        if (images != null)
                for (int i = 0; i< images.length; i++)
                        images[i].draw(g);
        if (rectangle != null)
                for (int i=0; i <rectangle.length; i++)
                        rectangle[i].draw(g);
        if (circle != null)
                for (int i=0;i<circle.length;i++)
                        circle[i].draw(g);
        if (star != null)
                for (int i=0; i<star.length; i++)
                        star[i].draw(g);
    }

    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
        
        if (images != null)
                for (int i = 0; i< images.length; i++)
                        images[i].move();
        if (rectangle != null)
                for (int i = 0; i <rectangle.length; i++)
                        rectangle[i].move();
        if (circle != null)
                for (int i = 0; i<circle.length;i++)
                        circle[i].move();
        if (star != null)
                for (int i =0; i<star.length;i++)
                        star[i].move();                              
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