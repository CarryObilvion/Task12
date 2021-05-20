package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.*;

public class Subsystem implements Item {
    public static final double CANVAS_HEIGHT = 425;
    public void draw(GraphicsContext gc, Canvas canvas) {
        Parameters_Singleton singleton =
                Parameters_Singleton.getInstance(BLACK, 4);
        gc.setFill(singleton.getColor());
        gc.setLineWidth(singleton.getLineWidth());
        gc.fillRect(30, 45, 200, 100);
        gc.setFill(WHITE);
        gc.fillRect(37, 52, 186, 86);
        gc.setFill(BLACK);
       double[] xPoints = {50, 50 ,210,210};
       double[] yPoints = {45, 145, 145, 45};
        gc.fillPolygon(xPoints, yPoints, 4);
        gc.setFill(WHITE);
        double[] xPoints1 = {57, 57 ,203,203};
        double[] yPoints1 = {52, 138, 138, 52};
        gc.fillPolygon(xPoints1, yPoints1, 4);
    }
}
