package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class SimpleImageBuilder implements ImageBuilder {
    private Image image;
    public SimpleImageBuilder(){
        this.image = new Image();
    }
    public void buildHouse(GraphicsContext gc, Canvas canvas) {
        this.image.setLibrary(new Library());
        this.image.drawHouse(gc,canvas);
    }



    public void buildGrass(GraphicsContext gc, Canvas canvas) {
        this.image.setSubsystem(new Subsystem());
        this.image.drawGrass(gc,canvas);
    }
    public void buildTree(GraphicsContext gc, Canvas canvas) {
        this.image.setModule(new Module());
        this.image.drawTree(gc,canvas);
    }
    public Image getImage() {
        return this.image;
    }
}