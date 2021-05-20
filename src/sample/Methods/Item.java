package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public interface Item {
    public void draw(GraphicsContext gc, Canvas canvas);
}