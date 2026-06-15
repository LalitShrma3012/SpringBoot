package SpringCore;

// Module 1
class Engine{
    public void startEngine(){
        // hardware included and other expensive code.
        System.out.println("Harwared included and expensive code");
        System.out.println("Engine started!!");
    }
}

// Module 2
class Car{
    private Engine engine = new Engine();
    public void drive(){
        engine.startEngine();
        System.out.println("Car is moving!!");
    }
}

// 1. This approach makes unit testing difficult cause isolation of classes is not possible, they are highly attached with each other when the application grows.

// 2. After deployment, market demands Electrict engine. but your big software is hard coded for diesel/petrol engine. It doesn't mean that you can't switch our software to electric with this approach, ofcourse you can, but will be time consuming and expensive. So this will make maintenance difficult.




public class Problem {
    public static void main(String[] args) {
        Car car = new Car();
        // want to test car.drive()
        car.drive();
    }
}
