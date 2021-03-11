package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Класс реализующий интерфейс Item
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Grass implements Item {
    public static final double CANVAS_HEIGHT = 425;
    public void draw(GraphicsContext gc, Canvas canvas) {
        Parameters_Singleton singleton =
                Parameters_Singleton.getInstance(Color.GREENYELLOW, 2);
        gc.setLineWidth(singleton.getLineWidth());
        gc.setFill(Color.ROYALBLUE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setFill(Color.DARKGREEN);
        gc.fillRect(0, CANVAS_HEIGHT, canvas.getWidth(), 70);
    }
}
