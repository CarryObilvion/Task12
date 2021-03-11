package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Класс реализующий интерфейс Item
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class House implements Item {
    public void draw(GraphicsContext gc, Canvas canvas) {
        Parameters_Singleton singleton =
                Parameters_Singleton.getInstance(Color.DARKGREY, 4);
        gc.setFill(singleton.getColor());
        gc.setLineWidth(singleton.getLineWidth());
        gc.fillRect(30, 200, 200, 250);
        gc.setFill(Color.BLUE);
        gc.fillRect(120, 250, 60, 60);
        gc.setFill(Color.BLACK);
        double[] xPoints = {20,130 , 240};
        double[] yPoints = {210, 100, 210};
        gc.fillPolygon(xPoints, yPoints, 3);



    }
}
