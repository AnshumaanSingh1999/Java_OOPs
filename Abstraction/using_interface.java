package Abstraction;

interface animal{
    public void iamprintvalue();
}

class dog implements animal{
    public void iamprintvalue(){
        System.out.println("I am here!");
    }
}


class using_interface {
    public static void main(String[] args) {
        dog cl=new dog();
        cl.iamprintvalue();   
    }   
}