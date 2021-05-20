package sample;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import sample.Methods.Director;
import sample.Methods.ImageBuilder;
import sample.Methods.SimpleImageBuilder;

public class Controller {


    public Canvas can;
    public Object SimpleImageBuilder;


    public void drawPicture(ActionEvent actionEvent) {
        GraphicsContext gc = can.getGraphicsContext2D();
       Director director =  new Director();
       SimpleImageBuilder product = new SimpleImageBuilder();
director.build( product, gc, can);

    }




}
