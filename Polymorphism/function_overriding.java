package Polymorphism;
class claculator{
    public void adder(int x,int y){
        int s=x+y;
        System.out.println(s+" Not Overidden"); 
    }
    public void subtractor(int x,int y){
        int d=y-x;
        System.out.println(d+" Not Overidden as no function available in subclass to override"); 
    }
}
class advancedcalculator extends claculator{
    public void adder(int x,int y){
        int s=x+y+1;
        System.out.println(s+" Overidden"); 
    }
}
public class function_overriding {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        advancedcalculator cl=new advancedcalculator();
        cl.subtractor(a, b);
        cl.adder(a, b);
    }
}