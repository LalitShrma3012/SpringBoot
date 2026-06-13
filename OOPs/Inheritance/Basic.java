package Inheritance;


class Engine{
    static void print(){
        System.out.println("Inside Engine class show()");
    }
}


// extends keyword is used to inherit a class.
class Car extends Engine{  
    static void show(){
        System.out.println("Inside Car class print()");
    }
}
public class Basic {
    public static void main(String[] args) {
        Engine.print();
        Car.print();
        Car.show(); // Car acquires the method print() from Engine class.
    }
}