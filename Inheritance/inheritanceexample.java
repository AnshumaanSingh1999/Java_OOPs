package Inheritance;

class company{
    String brand="Ford";
    public void company_message(){
        System.out.println("Ford Company");
    }
}
class car extends company{
    String product="Mustang";
    public void car_message(){
        System.out.println("Mustang car");
    }
}

public class inheritanceexample {
    public static void main(String[] args) {
        car cl=new car();
        String brand=cl.brand;
        String product=cl.product;
        System.out.println(brand);
        cl.company_message();
        System.out.println(product);
        cl.car_message();
    }
}