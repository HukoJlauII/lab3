package Dishes;

public class Plate extends Bowl{
    Plate(){
        material="glass";
        color="white";
        filled=false;
        radius=1;
        depth=0;
    }
    Plate(String material,String color,boolean filled,double radius){
        this.material=material;
        this.color=color;
        this.filled=filled;
        this.depth=0;
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                "} " + super.toString();
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

}
