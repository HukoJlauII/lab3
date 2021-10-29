package Dishes;

public abstract class Dish {
    protected String material;
    protected String color;
    protected boolean filled;
    public Dish(){
        material="glass";
        color="white";
        filled=false;
    }
    public Dish(String material,String color,boolean filled){
        this.material=material;
        this.color=color;
        this.filled=filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getMaterial() {
        return material;
    }
    abstract double getArea();
    abstract double getVolume();
    @Override
    public String toString() {
        return "Dish{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
