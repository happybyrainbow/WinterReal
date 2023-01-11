package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class SchneeFlocken extends GraphicalObject {

    double speed = Math.random() * 50;

    public SchneeFlocken(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool){
        for (int i = 1; i<500; i++){
            drawTool.setCurrentColor(new Color(255, 255, 255));
            drawTool.drawFilledCircle(x + i * Math.random() * 600, y + i * Math.random() * 200, 2 );
            drawTool.setCurrentColor(new Color(1, 1, 1));
            drawTool.drawCircle(x + i * Math.random() * 600, y + i * Math.random() * 200, 2 );
        }
    }
    @Override
    public void update(double dt) {
        y = y + dt * speed;
        if(y > 800){
            y = -200;
        }
    }
}
