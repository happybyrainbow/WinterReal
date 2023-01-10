package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Schneeman extends GraphicalObject {

    public Schneeman(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool){
        //Schnee
        for (int i = 0; i < 3; i++){
            drawTool.setCurrentColor(new Color(255,255,255));
            drawTool.drawFilledCircle(x,y + i * 37, 20 + i * 2.4);
            drawTool.setCurrentColor(new Color(0,0,0));
            drawTool.drawCircle(x,y + i * 37, 20 + i * 2.4);
        }
        //Knöpfe
        for (int i = 0; i < 2; i++){
            drawTool.drawFilledCircle(x,(y + 65) + i * 10,3);
            drawTool.drawFilledCircle(x,(y + 30) + i * 10,3);
            drawTool.drawFilledCircle((x - 8) + i * 15,y,3);

        }
        //Eimer
        drawTool.drawFilledPolygon(x - 15, y - 27, x - 25, y - 6, x + 25, y - 6, x + 15, y - 27);
        //Nase
        drawTool.setCurrentColor(new Color(235, 137, 33));
        drawTool.drawFilledRectangle( x - 2, y + 3, 15, 5);
    }
}
