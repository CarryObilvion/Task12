package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Класс реализующий интерфейс Item
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Tree implements Item {
    public void draw(GraphicsContext gc, Canvas canvas) {
        Parameters_Singleton singleton =
                Parameters_Singleton.getInstance(Color.GREEN, 5);
        gc.setFill(singleton.getColor());
        gc.setLineWidth(singleton.getLineWidth());
        gc.fillRect(400, 350, 20, 75);
        gc.setFill(Color.LIGHTGREEN);
        double[] xPoints = {350,400, 470};
        double[] yPoints = {365, 240, 365};



        gc.fillPolygon(xPoints, yPoints, 3);
    }
}
