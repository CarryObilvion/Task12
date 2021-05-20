package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Image {
    private Library library;
    private Subsystem subsystem;
    private Module module;
    public void setLibrary(Library library) {
        this.library = library;
    }
    public void setSubsystem(Subsystem subsystem) {
        this.subsystem = subsystem;
    }
    public void setModule(Module module) {
        this.module = module;
    }
    public void drawHouse(GraphicsContext gc, Canvas canvas){
        library.draw(gc,canvas);
    }
    public void drawGrass(GraphicsContext gc, Canvas canvas){
        subsystem.draw(gc,canvas);
    }
    public void drawTree(GraphicsContext gc, Canvas canvas){
        module.draw(gc,canvas);
    }
}