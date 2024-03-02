package Polymorphism;
public class function_overloading {
    public int adder(int x,int y){
        int s=x+y;
        return s;
    }
    public double adder(double x,double y){
        double s=x+y;
        return s;
    }
    public static void main(String[] args) {
        int a=2;
        int b=3;
        function_overloading cl=new function_overloading();
        int int_resp=cl.adder(a, b);
        double double_resp=cl.adder(a, b);
        System.out.println(int_resp);
        System.out.println(double_resp);
    }
}