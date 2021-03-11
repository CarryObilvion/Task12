package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Класс реализующий интерфейс ImageBuilder для создания и
 * отрисовки конечного продукта
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class SimpleImageBuilder implements ImageBuilder {
    private Image image;
    public SimpleImageBuilder(){
        this.image = new Image();
    }
    public void buildHouse(GraphicsContext gc, Canvas canvas) {
        this.image.setHouse(new House());
        this.image.drawHouse(gc,canvas);
    }



    public void buildGrass(GraphicsContext gc, Canvas canvas) {
        this.image.setGrass(new Grass());
        this.image.drawGrass(gc,canvas);
    }
    public void buildTree(GraphicsContext gc, Canvas canvas) {
        this.image.setTree(new Tree());
        this.image.drawTree(gc,canvas);
    }
    public Image getImage() {
        return this.image;
    }
}