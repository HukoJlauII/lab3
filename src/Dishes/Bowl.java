package Dishes;

public class Bowl extends Dish{
    protected double radius;
    protected double depth;
    Bowl(){
        material="glass";
        color="white";
        filled=false;
        radius=1;
        depth=1;
    }
    Bowl(double radius,double depth){
        material="glass";
        color="white";
        filled=false;
        this.depth=depth;
        this.radius=radius;
    }
    Bowl(String material,String color,boolean filled,double radius,double depth){
        this.material=material;
        this.color=color;
        this.filled=filled;
        this.depth=depth;
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    double getArea() {
        return 2*Math.PI*radius*depth;
    }

    @Override
    double getVolume() {
       return (2/3)*Math.PI*radius*radius*depth ;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "radius=" + radius +
                ", depth=" + depth +
                "} " + super.toString();
    }
}
