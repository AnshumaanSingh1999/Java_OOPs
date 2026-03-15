package Polymorphism;
public class function_overloading {
    static int TestFunction(int a, int b){
        int s=a+b;
        return s;
    }
    static double TestFunction(double a,double b){
        double s=a+b;
        return s;
    }
    static double TestFunction(double a){
        double s=a;
        return s;
    }
    public static void main(String args[]){
        int a=1;
        int b=1;
        int f1=TestFunction(a,b);
        System.out.println(f1);
        double f2=TestFunction(a,b);
        System.out.println(f2);
        double f3=TestFunction(a);
        System.out.println(f3);
    }
}
