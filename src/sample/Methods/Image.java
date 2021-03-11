package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Класс, включающий в себя создаваемые части и представляет собой
 * изображение, которое будет рисоваться на полотне
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Image {
    private House house;
    private Grass grass;
    private Tree tree;
    public void setHouse(House house) {
        this.house = house;
    }
    public void setGrass(Grass grass) {
        this.grass = grass;
    }
    public void setTree(Tree tree) {
        this.tree = tree;
    }
    public void drawHouse(GraphicsContext gc, Canvas canvas){
        house.draw(gc,canvas);
    }
    public void drawGrass(GraphicsContext gc, Canvas canvas){
        grass.draw(gc,canvas);
    }
    public void drawTree(GraphicsContext gc, Canvas canvas){
        tree.draw(gc,canvas);
    }
}