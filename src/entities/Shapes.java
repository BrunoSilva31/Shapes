package entities;

import enums.Color;

public abstract class Shapes {
    private Color color;

    public Shapes(){}
    public Shapes(Color color) {
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    public abstract Double area();
}
