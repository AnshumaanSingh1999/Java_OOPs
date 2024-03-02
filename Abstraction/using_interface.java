package Abstraction;

interface animal1{
    public abstract void function2();   
}

class dogy implements animal1{
    public void function2(){
        System.out.println("I am dog");

    }
}

public class using_interface {
    public static void main(String[] args) {
        dogy cl=new dogy();
        cl.function2();
        
    }
}