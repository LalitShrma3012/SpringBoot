package SpringCore;


interface Engine{
    void startEngine();
}

// Module 1
class PetrolEngine implements Engine{
    public void startEngine(){
        System.out.println("Petrol oriented hardware code get executed!");
        System.out.println("Engine Started!!!");
    }
}

// Module 2
class ElectricEngine implements Engine{
    public void startEngine(){
        System.out.println("Electric oriented hardware code get executed!");
        System.out.println("Engine Started!!!");
    }
}

// Module 3
class FakeEngine implements Engine{
    public void startEngine(){
        System.out.println("Engine Started!!!");
    }
}


// Module 4
class Car{
    private Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
    public void drive(){
        engine.startEngine();
        System.out.println("Car is moving!!");
    }
}

public class ProblemSolution {
    public static void main(String[] args){

        // For testing 
        Car car = new Car(new FakeEngine());
        car.drive();

        // For production, you can use real engines
        Car realCar = new Car(new PetrolEngine());
        realCar.drive();

    }
}
