package Dishes;

public class TestDish {
    public static void main(String[] args)
    {
        Glass g1=new Glass("glass","white",true,12,3);
        Glass g2=new Glass("glass","blue",false,10,5);
        Bowl b1=new Bowl();
        Plate p1=new Plate();
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(b1);
        System.out.println(p1);
    }
}
