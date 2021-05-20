package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public interface ImageBuilder {
    public void buildHouse(GraphicsContext gc, Canvas canvas);
    public void buildGrass(GraphicsContext gc, javafx.scene.canvas.Canvas
            canvas);
    public void buildTree(GraphicsContext gc, javafx.scene.canvas.Canvas canvas);
    public Image getImage();
}