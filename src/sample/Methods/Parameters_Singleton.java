package sample.Methods;

import javafx.scene.paint.Color;

/**
 * Класс, управляющий параметрами создаваемой фигуры
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public final class Parameters_Singleton {
    private static Parameters_Singleton _instance = null;
    private Color color;
    private int lineWidth;
    private Parameters_Singleton(Color color, int lineWidth) {
        this.color = color;
        this.lineWidth = lineWidth;
    }
    public static synchronized Parameters_Singleton getInstance(Color color, int
            lineWidth){
        if (_instance == null)
            _instance = new Parameters_Singleton(color, lineWidth);
        return _instance;
    }
    public Color getColor(){
        return color;
    }
    public int getLineWidth(){



        return lineWidth;
    }
}
