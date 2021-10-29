package Dishes;

public class Glass extends Dish {
    protected double radius;
    protected double height;
    Glass(){
        material="glass";
        color="white";
        filled=false;
        this.radius=1;
        this.height=1;
    }
    Glass(double radius,double height){
        material="glass";
        color="white";
        filled=false;
        this.radius=radius;
        this.height=height;
    }
    Glass(String material,String color,boolean filled,double radius,double height){
        this.material=material;
        this.color=color;
        this.filled=filled;
        this.radius=radius;
        this.height=height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public double getArea(){
        return 2*Math.PI*radius*(height+radius);
    }
    @Override
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }

    @Override
    public String toString() {
        return "Glass{" +
                "radius=" + radius +
                ", height=" + height +
                "} " + super.toString();
    }
}
