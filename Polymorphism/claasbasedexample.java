package Polymorphism;
class animal{
    String animals="Animals";
    String dogs="Dogs";
    public void function(){
        System.out.println(animals+" Making Sounds!");
    }
}
class dog extends animal{
    public void function(){
        System.out.println(dogs+" Making Sound!");
    }
}
public class claasbasedexample {    
    public static void main(String[] args) {
        animal acl=new animal();
        animal dcl=new dog();
        acl.function();
        dcl.function();
    }   
}