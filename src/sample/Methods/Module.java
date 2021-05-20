package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.*;


public class Module implements Item {
    public void draw(GraphicsContext gc, Canvas canvas) {
        Parameters_Singleton singleton =
                Parameters_Singleton.getInstance(BLACK, 4);
        gc.setFill(singleton.getColor());
        gc.setLineWidth(singleton.getLineWidth());

        gc.fillRect(280, 150, 200, 100);
        gc.setFill(WHITE);
        gc.fillRect(287, 157, 186, 86);
        gc.setFill(BLACK);
        double[] xPoints = {295, 295 ,465,465};
        double[] yPoints = {235, 165, 165, 235};
      gc.fillPolygon(xPoints, yPoints, 4);
       gc.setFill(WHITE);
        double[] xPoints1 = {300, 300 ,460,460};
        double[] yPoints1 = {230, 170, 170, 230};
        gc.fillPolygon(xPoints1, yPoints1, 4);
    }
}
