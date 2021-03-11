package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Интерфейс для создания конкретного продукта, включающего несколько частей
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public interface ImageBuilder {
    public void buildHouse(GraphicsContext gc, Canvas canvas);
    public void buildGrass(GraphicsContext gc, javafx.scene.canvas.Canvas
            canvas);
    public void buildTree(GraphicsContext gc, javafx.scene.canvas.Canvas canvas);
    public Image getImage();
}