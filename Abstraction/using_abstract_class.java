package Abstraction;

abstract class animal{
    int x=1;
    public abstract void function();
    public void test(){
        System.out.println(x);
    }
}

class dog extends animal{
    public void function(){
        System.out.println(x+1);

    }
}

public class using_abstract_class {
    public static void main(String[] args) {
        dog cl=new dog();
        cl.function();
        cl.test();
        
    }
    
}
