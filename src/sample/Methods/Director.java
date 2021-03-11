package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Класс, который занимается созданием экземпляра класса,
 * который выполняет построение изображения
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Director {
    public void build(ImageBuilder builder, GraphicsContext gc, Canvas canvas){
        builder.buildGrass(gc, canvas);
        builder.buildHouse(gc, canvas);
        builder.buildTree(gc, canvas);
    }
}
