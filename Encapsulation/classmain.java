package Encapsulation;
public class classmain {
    public static void main(String[] args) {
        callclass cl=new callclass();
        int r=5;
        cl.setter(r);
        int resp=cl.getter();
        System.out.println(resp);
    }   
}