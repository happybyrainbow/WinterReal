package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class HinterGrund extends GraphicalObject {

    public HinterGrund(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(85, 92, 136));
        drawTool.drawFilledRectangle(0,0,700, 700);
    }
}
