package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.*;

public class Library implements Item {
    public void draw(GraphicsContext gc, Canvas canvas) {
        Parameters_Singleton singleton =
                Parameters_Singleton.getInstance(BLACK, 4);
        gc.setFill(singleton.getColor());
        gc.setLineWidth(singleton.getLineWidth());

      gc.fillRect(30, 250, 200, 100);
        gc.setFill(WHITE);
        gc.fillRect(37, 257, 186, 86);
        gc.setFill(BLACK);
        double[] xPoints = {30, 30 ,230,230};
        double[] yPoints = {330, 270, 270, 330};
       gc.fillPolygon(xPoints, yPoints, 4);
        gc.setFill(WHITE);
        double[] xPoints1 = {37, 37 ,223,223};
        double[] yPoints1 = {323, 277, 277, 323};
        gc.fillPolygon(xPoints1, yPoints1, 4);

    }
}
