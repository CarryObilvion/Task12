package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Интерфейс, предоставляющий часть продукта для создания
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public interface Item {
    public void draw(GraphicsContext gc, Canvas canvas);
}